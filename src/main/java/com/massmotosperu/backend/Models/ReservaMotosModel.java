package com.massmotosperu.backend.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Table(name = "TB_ReservaMotos")
@NoArgsConstructor  // Constructor vacío
@AllArgsConstructor  // Constructor con todos los argumentos
public class ReservaMotosModel {

    @Id
    @Column(name = "ReservaID", length = 36)
    private String reservaID;

    @Column(name = "Fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "IDMoto", referencedColumnName = "IDMoto")
    private MotoModel moto;

    @ManyToOne
    @JoinColumn(name = "TiendaID", referencedColumnName = "TiendaID")
    private SedeTiendaModel tienda;
}