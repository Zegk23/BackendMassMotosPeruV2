package com.massmotosperu.backend.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "TB_SedeTienda")
@NoArgsConstructor  // Constructor vacío
@AllArgsConstructor  // Constructor con todos los argumentos
public class SedeTiendaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TiendaID")
    private int tiendaID;

    @Column(name = "NombreTienda", nullable = false)
    private String nombreTienda;

    @Column(name = "TelefonoTienda")
    private String telefonoTienda;

    @Column(name = "Ubicacion", nullable = false)
    private String ubicacion;
}