package com.br.todolist.dto;

import jakarta.validation.constraints.NotBlank;

public record TarefaRequest(
        @NotBlank String descricao,
        boolean pronto
) {
}
