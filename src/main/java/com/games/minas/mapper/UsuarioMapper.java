package com.games.minas.mapper;

import com.games.minas.dto.Usuario.UsuarioRequest;
import com.games.minas.dto.Usuario.UsuarioResponse;
import com.games.minas.model.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioMapper {

    public UsuarioResponse toResponse(Usuario user){
        return new UsuarioResponse(
                user.getId(),
                user.getNome(),
                user.getPass(),
                user.getEmail(),
                user.getVitorias(),
                user.getDerrotas()
        );
    }

    public Usuario toEntity(UsuarioRequest dto){
        return new Usuario(
                dto.nome(),
                dto.pass(),
                dto.email(),
                dto.vitorias(),
                dto.derrotas()
        );
    }
}
