package com.games.minas.dto.Usuario;

public record UsuarioResponse (
        long id,
        String nome,
        String pass,
        String email,
        int vitorias,
        int derrotas
){
}
