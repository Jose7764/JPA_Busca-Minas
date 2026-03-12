package com.games.minas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Dificuldade")
public class Dificuldade {

    @Id
    @GeneratedValue
    private long id;

    private String nome;
    private int linhas;
    private int colunas;
    private int minas;
}
