package com.games.minas.service;

import com.games.minas.dto.Usuario.UsuarioRequest;
import com.games.minas.dto.Usuario.UsuarioResponse;
import com.games.minas.mapper.UsuarioMapper;
import com.games.minas.model.Usuario;
import com.games.minas.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository repository;
    private final UsuarioMapper mapper;

    public UsuarioResponse salvarUsuario(UsuarioRequest dto){

        Usuario user = mapper.toEntity(dto);
        return mapper.toResponse(repository.save(user));
    }

    public List<UsuarioResponse> listarUsuarios(){
        return repository.findAll()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    public UsuarioResponse procurarUsuarioPorID(long id){
        return mapper.toResponse(repository.findById(id).orElseThrow(() -> new RuntimeException("Usuario não Achado!")));
    };

    public UsuarioResponse atualizarUsuario(UsuarioRequest dto, long id){
        Usuario newUser = repository.findById(id).orElseThrow(() -> new RuntimeException("Usuario não Achado, imposivel ATUALIZAR!"));
        newUser.setNome(dto.nome());
        newUser.setPass(dto.pass());
        newUser.setEmail(dto.email());
        newUser.setVitorias(dto.vitorias());
        newUser.setDerrotas(dto.derrotas());

        return mapper.toResponse(repository.save(newUser));
    };

    public void deletarUsuario(long id){
        if (repository.existsById(id)){
            repository.deleteById(id);
        }
        throw new RuntimeException("Usuario nao existe, imposivel DELETAR");
    }
}
