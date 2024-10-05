package com.massmotosperu.backend.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "TB_Motor")
@NoArgsConstructor  // Constructor vacío
@AllArgsConstructor  // Constructor con todos los argumentos
public class MotorModel {

    @Id
    @Column(name = "MotorID", length = 36)
    private String motorID;

    @Column(name = "TipoMotor")
    private String tipoMotor;

    @Column(name = "Cilindrada")
    private int cilindrada;

    @Column(name = "NumeroCilindros")
    private int numeroCilindros;

    @Column(name = "SistemaDeArranque")
    private String sistemaDeArranque;

    @Column(name = "SistemaDeEncendido")
    private String sistemaDeEncendido;

    @Column(name = "SistemaDeEnfriamiento")
    private String sistemaDeEnfriamiento;

    @Column(name = "Potencia")
    private double potencia;

    @Column(name = "Torque")
    private double torque;
}