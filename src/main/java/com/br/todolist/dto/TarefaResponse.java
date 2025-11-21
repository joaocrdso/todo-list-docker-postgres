package com.br.todolist.dto;

public record TarefaResponse(
        Long id,
        String descricao,
        boolean pronto
) {
}
