package com.massmotosperu.backend.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@Table(name = "TB_Suspensiones")
@NoArgsConstructor  // Constructor vacío
@AllArgsConstructor  // Constructor con todos los argumentos
public class SuspensionesModel {

    @Id
    @GeneratedValue(generator = "UUID")  // Generador de UUID automático
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "SuspensionesID", updatable = false, nullable = false, length = 36)
    private String suspensionesID;

    @Column(name = "SuspensionDelantera")
    private String suspensionDelantera;

    @Column(name = "SuspensionTrasera")
    private String suspensionTrasera;
}
