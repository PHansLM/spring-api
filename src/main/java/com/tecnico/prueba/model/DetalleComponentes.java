package com.tecnico.prueba.model;

import javax.persistence.*;

@Entity
@Table(name = "detalle_componentes")

public class DetalleComponentes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private boolean taponAceite;

    @Column(nullable = false)
    private boolean taponRadiador;

    @Column(nullable = false)
    private boolean varillaAceite;

    @Column(nullable = false)
    private boolean bateria;

    public DetalleComponentes() {};

    public DetalleComponentes(boolean taponAceite, boolean taponRadiador, boolean varillaAceite, boolean bateria) {
        this.taponAceite = taponAceite;
        this.taponRadiador = taponRadiador;
        this.varillaAceite = varillaAceite;
        this.bateria = bateria;
    }

    public boolean isTaponAceite() {
        return taponAceite;
    }

    public boolean isTaponRadiador() {
        return taponRadiador;
    }

    public boolean isVarillaAceite() {
        return varillaAceite;
    }

    public boolean isBateria() {
        return bateria;
    }
}
