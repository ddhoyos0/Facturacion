package com.djhoyos.facturacion.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.djhoyos.facturacion.com.models.Factura;
import com.djhoyos.facturacion.com.service.factura.FacturaService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("factura")
public class FacturaController {
	@Autowired
	private FacturaService servicio;
	
	@GetMapping("lista")
	public List<Factura> listar(){
		return servicio.listar();
	}

    @PostMapping("/crear")
    public Factura crear(@RequestBody Factura item) {    	
    	return servicio.crear(item);
    }
    

    @DeleteMapping("/eliminar/{id}")
    public  void eliminar(@PathVariable int id) {    	
    	servicio.eliminar(id);
    }
}
