package com.massmotosperu.backend.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "TB_Rol")
@NoArgsConstructor  // Constructor vacío
@AllArgsConstructor  // Constructor con todos los argumentos
public class RolModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(name = "NombreRol", nullable = false)
    private String nombreRol;
}