package com.br.todolist.repository;

import com.br.todolist.entity.TarefaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<TarefaEntity, Integer> {
}
