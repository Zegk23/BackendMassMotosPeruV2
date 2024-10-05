package com.massmotosperu.backend.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@Table(name = "TB_Neumaticos")
@NoArgsConstructor  // Constructor vacío
@AllArgsConstructor  // Constructor con todos los argumentos
public class NeumaticosModel {

    @Id
    @GeneratedValue(generator = "UUID")  // Generar automáticamente el UUID
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "NeumaticosID", length = 36, updatable = false, nullable = false)
    private String neumaticosID;

    @Column(name = "NeumaticoDelantero")
    private String neumaticoDelantero;

    @Column(name = "NeumaticoTrasero")
    private String neumaticoTrasero;

    @Column(name = "AroDelantero")
    private int aroDelantero;

    @Column(name = "AroTrasero")
    private int aroTrasero;
}
