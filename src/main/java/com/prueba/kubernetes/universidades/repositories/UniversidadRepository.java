package com.prueba.kubernetes.universidades.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.kubernetes.universidades.entities.Universidad;

/**
 * UniversidadRepository
 */
@Repository
public interface UniversidadRepository extends JpaRepository<Universidad, Long> {

    Universidad findByCodigo(Long codigo);
    void deleteByCodigo(Long codigo);
    List<Universidad> findAll();
    Universidad findByNombre(String nombre);

}
