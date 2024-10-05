package com.massmotosperu.backend.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.massmotosperu.backend.Models.UsuarioModel;
import com.massmotosperu.backend.Repositories.UsuarioRepository;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UsuarioModel registrarUsuario(UsuarioModel usuario) {
        usuario.setContraseña(passwordEncoder.encode(usuario.getContraseña()));
        return usuarioRepository.save(usuario);
    }

    public Optional<UsuarioModel> obtenerUsuarioPorCorreo(String correoElectronico) {
        return usuarioRepository.findByCorreoElectronico(correoElectronico);
    }

    public Optional<UsuarioModel> verificarUsuario(String correoElectronico, String contraseña) {
        Optional<UsuarioModel> usuario = usuarioRepository.findByCorreoElectronico(correoElectronico);

        if (usuario.isPresent() && passwordEncoder.matches(contraseña, usuario.get().getContraseña())) {
            return usuario;
        }

        return Optional.empty();
    }

}
