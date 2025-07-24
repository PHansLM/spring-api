package com.tecnico.prueba.seeder;

import com.tecnico.prueba.model.*;
import com.tecnico.prueba.repository.OrdenRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
public class BaseSeeder implements CommandLineRunner{

    private final OrdenRepository ordenRepository;

    public BaseSeeder(OrdenRepository ordenRepository) {
        this.ordenRepository = ordenRepository;
    }

    @Override
    public void run(String... args){
        if(ordenRepository.count()>0) return;

        Cliente cliente = new Cliente("Juan", "Soliz", "70380644");
        Vehiculo vehiculo = new Vehiculo("4046USI", "Corona", "Sedán", "Toyota", "1996", "Blanco");

        DetalleExterior listaExterior = new DetalleExterior(true, true, false, true, true, false, true, true, true, true, false, false, true);
        DetalleInterior listaInterior = new DetalleInterior(true, false, true, true, false, true, false, true, false, true, true, false);
        DetalleAccesorios listaAccesorios = new DetalleAccesorios(true, true, true, true, false, false, false);
        DetalleComponentes listaComponentes = new DetalleComponentes(true, false, false, true);

        Date fechaInicio = Date.valueOf("2025-07-22");
        Date fechaSalida = Date.valueOf("2025-07-23");

        Orden orden = new Orden("000028", cliente, vehiculo, 127.366, "si",
                                    fechaInicio, fechaSalida, "Fidel Unzaga",
                            "Limpieza general de exteriores e interiores \n Inflado de llantas",
                                    listaExterior,  listaInterior, listaAccesorios, listaComponentes,
                                    "1/2", "Un rayon presente en la puerta izquierda");

        ordenRepository.save(orden);
    }
}
