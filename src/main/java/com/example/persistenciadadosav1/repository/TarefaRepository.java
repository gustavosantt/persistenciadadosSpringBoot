package com.example.persistenciadadosav1.repository;

import com.example.persistenciadadosav1.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
