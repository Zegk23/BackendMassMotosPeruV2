package com.massmotosperu.backend.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@Table(name = "TB_Colores")
@NoArgsConstructor  // Constructor vacío
@AllArgsConstructor  // Constructor con todos los argumentos
public class ColoresModel {

    @Id
    @GeneratedValue(generator = "UUID")  // Configuración para generar el UUID automáticamente
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "ColoresID", length = 36, updatable = false, nullable = false)
    private String coloresID;

    @Column(name = "NombreColor")
    private String nombreColor;

    @ManyToOne
    @JoinColumn(name = "IDMoto", referencedColumnName = "IDMoto")
    private MotoModel moto;
}
