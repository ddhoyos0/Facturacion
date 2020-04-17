package com.djhoyos.facturacion.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.djhoyos.facturacion.com.models.TipoDocumento;
import com.djhoyos.facturacion.com.service.tipoDocumento.TipoDocumentoService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("tipoDocumento")
public class TipoDocumentoController {
	
	@Autowired
	private TipoDocumentoService servicio;
	
	@GetMapping("lista")
	public List<TipoDocumento> listar(){
		return servicio.listar();
	}

    @PostMapping("/crear")
    public TipoDocumento crear(@RequestBody TipoDocumento tipoDocumento) {    	
    	return servicio.crear(tipoDocumento);
    }
    
}
