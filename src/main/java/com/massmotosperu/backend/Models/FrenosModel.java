package com.massmotosperu.backend.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@Table(name = "TB_Frenos")
@NoArgsConstructor  // Constructor vacío
@AllArgsConstructor  // Constructor con todos los argumentos
public class FrenosModel {

    @Id
    @GeneratedValue(generator = "UUID")  // Generación automática de UUID
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "FrenosID", length = 36, updatable = false, nullable = false)
    private String frenosID;

    @Column(name = "FrenoDelantero")
    private double frenoDelantero;

    @Column(name = "FrenoTrasero")
    private double frenoTrasero;

    @Column(name = "TipoFreno")
    private String tipoFreno;
}
