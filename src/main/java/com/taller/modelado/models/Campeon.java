package com.taller.modelado.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "campeon")
public class Campeon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo_ataque", length = 15, nullable = false)
    private String tipoAtaque;
    
    @Column(name = "vida_base", nullable = false)
    private Integer vidaBase;

    @Column(name = "mana_bool", nullable = false)
    private Boolean manaBool;

    @Column(name = "energia_bool", nullable = false)
    private Boolean energiaBool;

    @Column(name = "velocidad_ataque_base", nullable = false)
    private Float velocidadAtaqueBase;

    @Column(name = "velocidad_movimiento_base", nullable = false)
    private Float velocidadMovimientoBase;

    @Column(name = "nombre", length = 70, nullable = false)
    private String nombre;

    @OneToOne
    private Nacionalidad nacionalidad;

    @OneToOne
    private Especie especie;
}
