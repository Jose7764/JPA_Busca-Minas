package com.games.minas.controller;

import com.games.minas.dto.Usuario.UsuarioRequest;
import com.games.minas.dto.Usuario.UsuarioResponse;
import com.games.minas.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {
    private final UsuarioService service;

    @GetMapping
    public List<UsuarioResponse> buscarUsuarios(){
        return service.listarUsuarios();
    }

    @GetMapping("/{id}")
    public UsuarioResponse procurarUsuarioPorId(@PathVariable long id){
        return service.procurarUsuarioPorID(id);
    }

    @PostMapping("/criar")
    public UsuarioResponse criarUsuario(@RequestBody UsuarioRequest dto){
        return service.salvarUsuario(dto);
    }

    @PutMapping("/Atualizar/{id}")
    public UsuarioResponse atualizarUsuario(@RequestBody UsuarioRequest dto, @PathVariable long id){
        return service.atualizarUsuario(dto, id);
    };

    @DeleteMapping
    public void deletarUsuario(@PathVariable long id){
        service.deletarUsuario(id);
    }
}
