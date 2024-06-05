package com.taller.modelado.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "counter")
public class Counter {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 70, nullable = false)
    private String nombre;

    @Column(name = "porcentaje_victoria", nullable = false)
    private Float porcentajeVictoria;

    @Column(name = "porcentaje_derrota", nullable = false)
    private Float porcentajeDerrota;

    @OneToOne
    private Nacionalidad nacionalidad;

    @OneToOne
    private Especie especie;
}