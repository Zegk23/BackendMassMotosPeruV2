package com.massmotosperu.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .cors(cors -> cors.disable()) // Opción para habilitar o deshabilitar CORS, aquí deshabilitado
            .csrf(csrf -> csrf.disable()) // Deshabilita CSRF si no se necesita
            .authorizeHttpRequests(authorize -> authorize
                .requestMatchers("/api/motos/**").permitAll() // Permitir acceso público a los endpoints de motos
                .requestMatchers("/api/auth/**").permitAll() // Permitir acceso público a los endpoints de autenticación
                .requestMatchers("/motos/**").permitAll() // Permitir acceso público a las vistas de Thymeleaf
                .requestMatchers("/**").permitAll() // Permitir todas las vistas y recursos
                .anyRequest().authenticated() // Proteger todos los demás endpoints
            );
        return http.build();
    }

    @Bean
    public org.springframework.security.crypto.password.PasswordEncoder passwordEncoder() {
        return new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder();
    }
}
