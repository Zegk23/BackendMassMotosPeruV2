package com.massmotosperu.backend.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "TB_Frenos")
@NoArgsConstructor  // Constructor vacío
@AllArgsConstructor  // Constructor con todos los argumentos
public class FrenosModel {

    @Id
    @Column(name = "FrenosID", length = 36)
    private String frenosID;

    @Column(name = "FrenoDelantero")
    private double frenoDelantero;

    @Column(name = "FrenoTrasero")
    private double frenoTrasero;

    @Column(name = "TipoFreno")
    private String tipoFreno;
}