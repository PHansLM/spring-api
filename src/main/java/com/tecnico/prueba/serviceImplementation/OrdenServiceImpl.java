package com.tecnico.prueba.serviceImplementation;

import com.tecnico.prueba.model.Orden;
import com.tecnico.prueba.repository.OrdenRepository;
import com.tecnico.prueba.service.OrdenService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrdenServiceImpl implements OrdenService {
    private final OrdenRepository ordenRepository;

    public OrdenServiceImpl(OrdenRepository ordenRepository) {
        this.ordenRepository = ordenRepository;
    }

    @Override
    public Optional<Orden> obtenerOrdenPorNumeroOrden(String numeroOrden) {
        return ordenRepository.findByNumeroOrden(numeroOrden);
    }
}
