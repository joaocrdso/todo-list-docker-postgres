package com.br.todolist.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class TarefaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String descricao;

    private boolean pronto = false;

    public String getDescricao() {
        return descricao;
    }

    public Long getId() {
        return id;
    }

}
