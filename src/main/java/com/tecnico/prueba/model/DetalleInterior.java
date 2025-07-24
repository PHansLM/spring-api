package com.tecnico.prueba.model;

import javax.persistence.*;

@Entity
@Table(name = "detalle_interior")

public class DetalleInterior {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private boolean instrumentosTablero;

    @Column(nullable = false)
    private boolean calefaccion;

    @Column(nullable = false)
    private boolean radio;

    @Column(nullable = false)
    private boolean bocinas;

    @Column(nullable = false)
    private boolean encendedores;

    @Column(nullable = false)
    private boolean retrovisor;

    @Column(nullable = false)
    private boolean ceniceros;

    @Column(nullable = false)
    private boolean cinturones;

    @Column(nullable = false)
    private boolean botones;

    @Column(nullable = false)
    private boolean manijas;

    @Column(nullable = false)
    private boolean tapetes;

    @Column(nullable = false)
    private boolean vestiduras;

    public DetalleInterior() {};

    public DetalleInterior(boolean instrumentosTablero, boolean calefaccion, boolean radio, boolean bocinas, boolean encendedores, boolean retrovisor, boolean ceniceros, boolean cinturones, boolean botones, boolean manijas, boolean tapetes, boolean vestiduras) {
        this.instrumentosTablero = instrumentosTablero;
        this.calefaccion = calefaccion;
        this.radio = radio;
        this.bocinas = bocinas;
        this.encendedores = encendedores;
        this.retrovisor = retrovisor;
        this.ceniceros = ceniceros;
        this.cinturones = cinturones;
        this.botones = botones;
        this.manijas = manijas;
        this.tapetes = tapetes;
        this.vestiduras = vestiduras;
    }

    public boolean isInstrumentosTablero() {
        return instrumentosTablero;
    }

    public boolean isCalefaccion() {
        return calefaccion;
    }

    public boolean isRadio() {
        return radio;
    }

    public boolean isBocinas() {
        return bocinas;
    }

    public boolean isEncendedores() {
        return encendedores;
    }

    public boolean isRetrovisor() {
        return retrovisor;
    }

    public boolean isCeniceros() {
        return ceniceros;
    }

    public boolean isCinturones() {
        return cinturones;
    }

    public boolean isBotones() {
        return botones;
    }

    public boolean isManijas() {
        return manijas;
    }

    public boolean isTapetes() {
        return tapetes;
    }

    public boolean isVestiduras() {
        return vestiduras;
    }
}
