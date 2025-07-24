package com.tecnico.prueba.model;

import org.w3c.dom.Text;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ordenes")
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 6, name = "numero_orden", unique = true, nullable = false)
    private String numeroOrden;

    @ManyToOne(optional = false, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Cliente cliente;

    @ManyToOne(optional = false, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Vehiculo vehiculo;

    @Column(nullable = false)
    private double kilometraje;

    @Column(nullable = false)
    private String VIM;

    @Column(nullable = false)
    private Date fechaInicio;

    @Column(nullable = false)
    private Date fechaSalida;

    @Column(nullable = false)
    private String tecnico;

    @Column(nullable = false)
    private String trabajo;

    @ManyToOne(optional = false, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private DetalleExterior listaExterior;

    @ManyToOne(optional = false, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private DetalleInterior listaInterior;

    @ManyToOne(optional = false, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private DetalleAccesorios listaAccesorios;

    @ManyToOne(optional = false, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private DetalleComponentes listaComponentes;

    @Column(nullable = false)
    private String tanqueGasolina;

    private String observaciones;

    public Orden() {};

    public Orden(String numeroOrden, Cliente cliente, Vehiculo vehiculo, double kilometraje, String VIM, Date fechaInicio, Date fechaSalida, String tecnico, String trabajo, DetalleExterior listaExterior, DetalleInterior listaInterior, DetalleAccesorios listaAccesorios, DetalleComponentes listaComponentes, String tanqueGasolina, String observaciones) {
        this.numeroOrden = numeroOrden;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.kilometraje = kilometraje;
        this.VIM = VIM;
        this.fechaInicio = fechaInicio;
        this.fechaSalida = fechaSalida;
        this.tecnico = tecnico;
        this.trabajo = trabajo;
        this.listaExterior = listaExterior;
        this.listaInterior = listaInterior;
        this.listaAccesorios = listaAccesorios;
        this.listaComponentes = listaComponentes;
        this.tanqueGasolina = tanqueGasolina;
        this.observaciones = observaciones;
    }


    public String getNumeroOrden() {
        return numeroOrden;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public String getVIM() {
        return VIM;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public String getTecnico() {
        return tecnico;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public String getTanqueGasolina() {
        return tanqueGasolina;
    }

    public DetalleExterior getListaExterior() {
        return listaExterior;
    }

    public DetalleInterior getListaInterior() {
        return listaInterior;
    }

    public DetalleAccesorios getListaAccesorios() {
        return listaAccesorios;
    }

    public DetalleComponentes getListaComponentes() {
        return listaComponentes;
    }

    public String getObservaciones() {
        return observaciones;
    }
}
