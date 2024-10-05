package com.massmotosperu.backend.Controllers;

import com.massmotosperu.backend.Models.UsuarioModel;
import com.massmotosperu.backend.Services.UserService;
import com.massmotosperu.backend.Utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:3000")
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private JWTUtil jwtUtil;

    // Endpoint para registrar un nuevo usuario
    @PostMapping("/register")
    public ResponseEntity<String> registrar(@RequestBody UsuarioModel usuario) {
        System.out.println("Datos recibidos: " + usuario.toString());

        if (usuario.getNombre() == null || usuario.getNombre().isEmpty()) {
            return ResponseEntity.badRequest().body("El nombre es obligatorio");
        }

        userService.registrarUsuario(usuario);
        return ResponseEntity.ok("Usuario registrado exitosamente");
    }

    

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UsuarioModel usuario) {
        Optional<UsuarioModel> user = userService.verificarUsuario(usuario.getCorreoElectronico(),
                usuario.getContraseña());
        if (user.isPresent()) {
            String token = jwtUtil.generarToken(user.get().getCorreoElectronico());
            return ResponseEntity.ok(token);
        }
        return ResponseEntity.badRequest().body("Correo o contraseña incorrectos");
    }

    

}
