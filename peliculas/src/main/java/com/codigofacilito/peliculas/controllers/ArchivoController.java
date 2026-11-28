package com.codigofacilito.peliculas.controllers;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codigofacilito.peliculas.services.IArchivoService;

@Controller
public class ArchivoController {
	private IArchivoService service;
	
	public ArchivoController(IArchivoService service) {
        this.service = service;
    }
	
	@GetMapping("/archivo")
	public ResponseEntity<Resource> get(@RequestParam("n") String archivo) {
		return service.get(archivo);
	}
}
