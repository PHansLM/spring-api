package com.tecnico.prueba.service;


import com.tecnico.prueba.model.Orden;

import java.util.Optional;

public interface OrdenService {
    Optional<Orden> obtenerOrdenPorNumeroOrden(String numeroOrden);
}
