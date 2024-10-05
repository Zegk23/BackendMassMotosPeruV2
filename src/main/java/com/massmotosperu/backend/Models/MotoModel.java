package com.massmotosperu.backend.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "TB_Motos")
@NoArgsConstructor
@AllArgsConstructor
public class MotoModel {

    @Id
    @Column(name = "IDMoto", length = 36)
    private String idMoto;

    @Column(name = "NombreMoto", nullable = false)
    private String nombreMoto;

    @Column(name = "EstadoMoto")
    private String estadoMoto;

    @Column(name = "MarcaMoto", nullable = false)
    private String marcaMoto;

    @Column(name = "ModeloMoto", nullable = false)
    private String modeloMoto;

    @Column(name = "AnioFabricacion")
    private int anioFabricacion;

    @Column(name = "VelocidadMaxima")
    private double velocidadMaxima;

    @Column(name = "PrecioSoles")
    private double precioSoles;

    @Column(name = "PrecioDolares")
    private double precioDolares;

    @Column(name = "Kilometraje")
    private int kilometraje;

    @Column(name = "Disponibilidad")
    private boolean disponibilidad;

    @Column(name = "Peso")
    private double peso;

    @Column(name = "NumAsientos")
    private int numAsientos;

    @Column(name = "CargaUtil")
    private int cargaUtil;

    @Column(name = "GarantiaAnios")
    private int garantiaAnios;

    @Column(name = "GarantiaKM")
    private int garantiaKM;

    @Column(name = "URLImg")
    private String urlImg;

    @Column(name = "DescripcionMoto", length = 1000)
    private String descripcionMoto;

    @ManyToOne
    @JoinColumn(name = "TiendaID", referencedColumnName = "TiendaID")
    private SedeTiendaModel tienda;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "MotorID", referencedColumnName = "MotorID")
    private MotorModel motor;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SuspensionesID", referencedColumnName = "SuspensionesID")
    private SuspensionesModel suspensiones;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CombustiblesID", referencedColumnName = "CombustiblesID")
    private CombustiblesModel combustibles;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "NeumaticosID", referencedColumnName = "NeumaticosID")
    private NeumaticosModel neumaticos;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "FrenosID", referencedColumnName = "FrenosID")
    private FrenosModel frenos;

}
