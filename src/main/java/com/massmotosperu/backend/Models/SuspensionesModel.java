package com.massmotosperu.backend.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "TB_Suspensiones")
@NoArgsConstructor  // Constructor vacío
@AllArgsConstructor  // Constructor con todos los argumentos
public class SuspensionesModel {

    @Id
    @Column(name = "SuspensionesID", length = 36)
    private String suspensionesID;

    @Column(name = "SuspensionDelantera")
    private String suspensionDelantera;

    @Column(name = "SuspensionTrasera")
    private String suspensionTrasera;
}