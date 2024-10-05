package com.massmotosperu.backend.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@Table(name = "TB_Combustibles")
@NoArgsConstructor  // Constructor vacío
@AllArgsConstructor  // Constructor con todos los argumentos
public class CombustiblesModel {

    @Id
    @GeneratedValue(generator = "UUID")  // Generación automática de UUID
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "CombustiblesID", length = 36, updatable = false, nullable = false)
    private String combustiblesID;

    @Column(name = "TipoCombustible")
    private String tipoCombustible;

    @Column(name = "Octanaje")
    private int octanaje;

    @Column(name = "SistemaCombustible")
    private String sistemaCombustible;

    @Column(name = "CapacidadDeTanque")
    private double capacidadDeTanque;

    @Column(name = "Autonomia")
    private double autonomia;

    @Column(name = "RendimientoPorGalon")
    private double rendimientoPorGalon;
}
