package com.tecnico.prueba.controller;

import com.tecnico.prueba.model.Orden;
import com.tecnico.prueba.repository.OrdenRepository;
import com.tecnico.prueba.service.OrdenService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/ordenes")
public class OrdenController {
    private final OrdenService ordenService;

    public OrdenController(OrdenService ordenService) {
        this.ordenService = ordenService;
    }

    @GetMapping("/{numeroOrden}")
    public ResponseEntity<Orden> obtenerOrdenPorNumeroOrden(@PathVariable String numeroOrden) {
        return ordenService.obtenerOrdenPorNumeroOrden(numeroOrden)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
