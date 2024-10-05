package com.massmotosperu.backend.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@Table(name = "TB_Usuario")
@NoArgsConstructor // Constructor vacío
@AllArgsConstructor // Constructor con todos los argumentos
public class UsuarioModel {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "ID", updatable = false, nullable = false, length = 36)
    private String id;

    @Column(name = "Nombre", nullable = false)
    private String nombre = ""; 

    @Column(name = "PreNombre")
    private String preNombre = ""; 

    @Column(name = "ApellidoPaterno", nullable = false)
    private String apellidoPaterno = ""; // Valor predeterminado para evitar nulos

    @Column(name = "ApellidoMaterno")
    private String apellidoMaterno = "";

    @Column(name = "Dni", nullable = false, length = 8)
    private String dni = "";

    @Column(name = "Telefono")
    private String telefono = "";

    @Column(name = "CorreoElectronico", unique = true)
    private String correoElectronico = "";

    @Column(name = "Edad")
    private int edad = 0;

    @Column(name = "Contraseña", nullable = false)
    private String contraseña = "";
}
