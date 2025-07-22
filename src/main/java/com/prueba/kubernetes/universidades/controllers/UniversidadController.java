package com.prueba.kubernetes.universidades.controllers;

import com.prueba.kubernetes.universidades.entities.Universidad;
import com.prueba.kubernetes.universidades.services.UniversidadService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UniversidadController {

	@Autowired
	private UniversidadService universidadService;

    @GetMapping("/listar")
    public List<Universidad> listar() {
        return universidadService.listar();
    }

	@GetMapping("/leer/{id}")
	public Universidad getUniversidad(@PathVariable Long id) {
		return universidadService.getUniversidad(id);
    }

    @PostMapping("/crear")
    public Universidad crear(@RequestBody Universidad universidad) {
        return universidadService.crear(universidad);
    }

    @PutMapping("/actualizar/{id}")
    public Universidad actualizar(@PathVariable Long id, @RequestBody Universidad universidad) {
        return universidadService.actualizar(id, universidad);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        universidadService.eliminar(id);
    }
}
