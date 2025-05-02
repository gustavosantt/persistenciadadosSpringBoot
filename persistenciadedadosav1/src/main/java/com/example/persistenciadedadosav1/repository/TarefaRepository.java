package com.example.persistenciadedadosav1.repository;

import com.example.persistenciadedadosav1.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
