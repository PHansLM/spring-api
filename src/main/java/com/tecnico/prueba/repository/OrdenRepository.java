package com.tecnico.prueba.repository;

import com.tecnico.prueba.model.Orden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrdenRepository extends JpaRepository<Orden, Long> {
    Optional<Orden> findByNumeroOrden(String numeroOrden);

}
