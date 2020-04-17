package com.djhoyos.facturacion.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.djhoyos.facturacion.com.models.Producto;
import com.djhoyos.facturacion.com.service.producto.ProductoService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("producto")
public class ProductoController {
	
	@Autowired
	private ProductoService servicio;
	
	@GetMapping("lista")
	public List<Producto> listar(){
		return servicio.listar();
	}

    @PostMapping("/crear")
    public Producto crear(@RequestBody Producto producto) {    	
    	return servicio.crear(producto);
    }
    
	@PutMapping("/actualizar")
    public void actualizar(@RequestBody Producto producto){
        this.servicio.editar(producto);
    }

    @DeleteMapping("/eliminar/{id}")
    public  void eliminar(@PathVariable int id) {    	
    	servicio.eliminar(id);
    }

	
}
