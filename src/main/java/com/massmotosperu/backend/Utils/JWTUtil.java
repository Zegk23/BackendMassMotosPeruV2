package com.massmotosperu.backend.Utils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import java.security.Key;
import java.util.Date;
import org.springframework.stereotype.Component;

@Component
public class JWTUtil {

    // Clave secreta para la firma del token
    private Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    // Método para generar el token JWT
    public String generarToken(String subject) {
        return Jwts.builder()
                .setSubject(subject)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 86400000)) // 1 día de expiración
                .signWith(key) // Utiliza la clave secreta para firmar el token
                .compact();
    }

    // Método para validar el token
    public boolean validarToken(String token) {
        try {
            Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Obtener el subject (email o nombre de usuario) del token
    public String getSubject(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }
}
