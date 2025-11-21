package com.br.todolist.service;

import com.br.todolist.repository.TarefaRepository;

public class TarefaService {

    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }
}
