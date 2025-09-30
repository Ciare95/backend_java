package com.adso.aprendiz.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor // Constructor con argumentos
@NoArgsConstructor // Constructor sin argumentos
@Entity // Indica que es una entidad en la base de datos
@Table(name = "aprendiz") // Nombre de la tabla en la base de datos
public class AprendizEntity {
    @Id // Indica que es la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Genera el valor de la llave primaria automáticamente
    private Long id;

    @Column(name = "nombre") //Así queda en la base de datos
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "direccion")
    private String direccion;
}
