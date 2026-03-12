package com.games.minas.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private String pass;
    private String email;
    private int vitorias;
    private int derrotas;

    public Usuario(String nome, String pass, String email, int vitorias, int derrotas) {
        this.nome = nome;
        this.pass = pass;
        this.email = email;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
    }
}
