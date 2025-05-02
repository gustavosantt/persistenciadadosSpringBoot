package com.example.persistenciadedadosav1.repository;

import com.example.persistenciadedadosav1.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
