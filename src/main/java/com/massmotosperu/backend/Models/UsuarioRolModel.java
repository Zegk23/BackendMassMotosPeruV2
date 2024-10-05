package com.massmotosperu.backend.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "TB_UsuarioRol")
@IdClass(UsuarioRolId.class)  // Asignar la clase de clave compuesta
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioRolModel {

    @Id
    @Column(name = "UsuarioID", length = 36)
    private String usuarioID;

    @Id
    @Column(name = "RolID")
    private int rolID;

    @ManyToOne
    @JoinColumn(name = "UsuarioID", referencedColumnName = "ID", insertable = false, updatable = false)
    private UsuarioModel usuario;

    @ManyToOne
    @JoinColumn(name = "RolID", referencedColumnName = "ID", insertable = false, updatable = false)
    private RolModel rol;
}
