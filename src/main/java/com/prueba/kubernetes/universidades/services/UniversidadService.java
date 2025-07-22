package com.prueba.kubernetes.universidades.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.kubernetes.universidades.entities.Universidad;
import com.prueba.kubernetes.universidades.repositories.UniversidadRepository;

/**
 * UniversidadService
 */
@Service
public class UniversidadService {

    @Autowired
    private UniversidadRepository universidadRepository;

    public Universidad getUniversidad(Long codigo) {
        return universidadRepository.findByCodigo(codigo);
    }

    public Universidad crear(Universidad universidad) {
        return universidadRepository.save(universidad);
    }

    public Universidad actualizar(Long codigo, Universidad universidad) {
        Universidad universidadExistente = universidadRepository.findByCodigo(codigo);

        if (universidadExistente == null) {
            throw new RuntimeException("Universidad no encontrada con código: " + codigo);
        }

        universidad.setCodigo(universidadExistente.getCodigo());
        if (universidad.getNombre() == null) {
            universidad.setNombre(universidadExistente.getNombre());
        }
        if (universidad.getDireccion() == null) {
            universidad.setDireccion(universidadExistente.getDireccion());
        }
        if (universidad.getTelefono() == null) {
            universidad.setTelefono(universidadExistente.getTelefono());
        }
        return universidadRepository.save(universidad);
    }

    public void eliminar(Long codigo) {
        universidadRepository.deleteByCodigo(codigo);
    }

    public List<Universidad> listar() {
        return universidadRepository.findAll();
    }

}
