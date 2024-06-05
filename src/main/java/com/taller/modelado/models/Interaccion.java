package com.taller.modelado.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "interaccion")
public class Interaccion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_interaccion", length = 45)
    private String nombreInteraccion;
    
    @Column(name = "limite_interaccion")
    private Integer limiteIteraccion;
}