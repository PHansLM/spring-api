package com.tecnico.prueba.model;

import javax.persistence.*;

@Entity
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 7, unique = true, updatable = false)
    private String placa;

    @Column(nullable = false, updatable = false)
    private String vehiculoModelo;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false)
    private String modelo;

    @Column(nullable = false)
    private String anio;

    @Column(nullable = false)
    private String color;

    public Vehiculo() {};

    public Vehiculo(String placa, String vehiculoModelo, String tipo, String modelo, String anio, String color) {
        this.placa = placa;
        this.vehiculoModelo = vehiculoModelo;
        this.tipo = tipo;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public String getVehiculoModelo() {
        return vehiculoModelo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAnio() {
        return anio;
    }

    public String getColor() {
        return color;
    }
}
