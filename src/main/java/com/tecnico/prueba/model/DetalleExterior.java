package com.tecnico.prueba.model;

import javax.persistence.*;

@Entity
@Table(name = "detalle_exterior")

public class DetalleExterior {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private boolean unidadLuces;

    @Column(nullable = false)
    private boolean luces1_4;

    @Column(nullable = false)
    private boolean antena;

    @Column(nullable = false)
    private boolean espejoLateral;

    @Column(nullable = false)
    private boolean cristales;

    @Column(nullable = false)
    private boolean emblema;

    @Column(nullable = false)
    private boolean llantas4;

    @Column(nullable = false)
    private boolean taponRuedas4;

    @Column(nullable = false)
    private boolean moldadurasCompletas;

    @Column(nullable = false)
    private boolean taponGasolina;

    @Column(nullable = false)
    private boolean carroseriaSinGolpes;

    @Column(nullable = false)
    private boolean bocinasGlacson;

    @Column(nullable = false)
    private boolean limpiadores;

    public DetalleExterior() {};

    public DetalleExterior(boolean unidadLuces, boolean luces1_4, boolean antena, boolean espejoLateral, boolean cristales, boolean emblema, boolean llantas4, boolean taponRuedas4, boolean moldadurasCompletas, boolean taponGasolina, boolean carroseriaSinGolpes, boolean bocinasGlacson, boolean limpiadores) {
        this.unidadLuces = unidadLuces;
        this.luces1_4 = luces1_4;
        this.antena = antena;
        this.espejoLateral = espejoLateral;
        this.cristales = cristales;
        this.emblema = emblema;
        this.llantas4 = llantas4;
        this.taponRuedas4 = taponRuedas4;
        this.moldadurasCompletas = moldadurasCompletas;
        this.taponGasolina = taponGasolina;
        this.carroseriaSinGolpes = carroseriaSinGolpes;
        this.bocinasGlacson = bocinasGlacson;
        this.limpiadores = limpiadores;
    }

    public boolean isUnidadLuces() {
        return unidadLuces;
    }

    public boolean isLuces1_4() {
        return luces1_4;
    }

    public boolean isAntena() {
        return antena;
    }

    public boolean isEspejoLateral() {
        return espejoLateral;
    }

    public boolean isCristales() {
        return cristales;
    }

    public boolean isEmblema() {
        return emblema;
    }

    public boolean isLlantas4() {
        return llantas4;
    }

    public boolean isTaponRuedas4() {
        return taponRuedas4;
    }

    public boolean isMoldadurasCompletas() {
        return moldadurasCompletas;
    }

    public boolean isTaponGasolina() {
        return taponGasolina;
    }

    public boolean isCarroseriaSinGolpes() {
        return carroseriaSinGolpes;
    }

    public boolean isBocinasGlacson() {
        return bocinasGlacson;
    }

    public boolean isLimpiadores() {
        return limpiadores;
    }
}
