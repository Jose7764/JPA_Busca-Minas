package com.games.minas.dto.Usuario;

public record UsuarioRequest (

        String nome,
        String pass,
        String email,
        int vitorias,
        int derrotas
){
}
