package com.massmotosperu.backend.Repositories;

import com.massmotosperu.backend.Models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, String> {
    Optional<UsuarioModel> findByCorreoElectronico(String correoElectronico);
}
