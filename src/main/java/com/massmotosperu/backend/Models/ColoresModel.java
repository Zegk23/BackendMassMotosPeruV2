package com.massmotosperu.backend.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "TB_Colores")
@NoArgsConstructor  // Constructor vacío
@AllArgsConstructor  // Constructor con todos los argumentos
public class ColoresModel {

    @Id
    @Column(name = "ColoresID", length = 36)
    private String coloresID;

    @Column(name = "NombreColor")
    private String nombreColor;

    @ManyToOne
    @JoinColumn(name = "IDMoto", referencedColumnName = "IDMoto")
    private MotoModel moto;
}