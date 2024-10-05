package com.massmotosperu.backend.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class MotoDTO {
    private String nombreMoto;
    private String estadoMoto;
    private String marcaMoto;
    private String modeloMoto;
    private int anioFabricacion;
    private double velocidadMaxima;
    private double precioSoles;
    private double precioDolares;
    private int kilometraje;
    private boolean disponibilidad;
    private double peso;
    private int numAsientos;
    private int cargaUtil;
    private int garantiaAnios;
    private int garantiaKM;
    private String urlImg;
    private int tiendaID;

    // Detalles de Motor
    private String tipoMotor;
    private int cilindrada;
    private int numeroCilindros;
    private String sistemaDeArranque;
    private String sistemaDeEncendido;
    private String sistemaDeEnfriamiento;
    private double potencia;
    private double torque;

    // Detalles de Suspensiones
    private String suspensionDelantera;
    private String suspensionTrasera;

    // Detalles de Combustible
    private String tipoCombustible;
    private int octanaje;
    private String sistemaCombustible;
    private double capacidadDeTanque;
    private double autonomia;
    private double rendimientoPorGalon;

    // Detalles de Neumáticos
    private String neumaticoDelantero;
    private String neumaticoTrasero;
    private int aroDelantero;
    private int aroTrasero;

    // Detalles de Frenos
    private double frenoDelantero;
    private double frenoTrasero;
    private String tipoFreno;

    // Detalles de Colores
    private String nombreColor;

    // Nuevo campo: Descripción de la moto
    private String descripcionMoto;
}
