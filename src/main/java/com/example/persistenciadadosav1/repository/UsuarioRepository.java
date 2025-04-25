package com.example.persistenciadadosav1.repository;

import com.example.persistenciadadosav1.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
