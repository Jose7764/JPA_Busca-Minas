package com.games.minas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.catalina.User;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Games")
public class Game {

    @Id
    @GeneratedValue
    private long id;

    private User user;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int duracao;
    private boolean resultado;

}
