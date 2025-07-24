package com.tecnico.prueba.model;

import javax.persistence.*;

@Entity
@Table(name = "detalle_accesorios")

public class DetalleAccesorios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private boolean gata;

    @Column(nullable = false)
    private boolean manivelaGata;

    @Column(nullable = false)
    private boolean llaveRuedas;

    @Column(nullable = false)
    private boolean estucheHerramientas;

    @Column(nullable = false)
    private boolean trianguloSeguridad;

    @Column(nullable = false)
    private boolean llantaRefaccion;

    @Column(nullable = false)
    private boolean estinguidor;

    public DetalleAccesorios() {};

    public DetalleAccesorios(boolean gata, boolean manivelaGata, boolean llaveRuedas, boolean estucheHerramientas, boolean trianguloSeguridad, boolean llantaRefaccion, boolean estinguidor) {
        this.gata = gata;
        this.manivelaGata = manivelaGata;
        this.llaveRuedas = llaveRuedas;
        this.estucheHerramientas = estucheHerramientas;
        this.trianguloSeguridad = trianguloSeguridad;
        this.llantaRefaccion = llantaRefaccion;
        this.estinguidor = estinguidor;
    }

    public boolean isGata() {
        return gata;
    }

    public boolean isManivelaGata() {
        return manivelaGata;
    }

    public boolean isLlaveRuedas() {
        return llaveRuedas;
    }

    public boolean isEstucheHerramientas() {
        return estucheHerramientas;
    }

    public boolean isTrianguloSeguridad() {
        return trianguloSeguridad;
    }

    public boolean isLlantaRefaccion() {
        return llantaRefaccion;
    }

    public boolean isEstinguidor() {
        return estinguidor;
    }
}
