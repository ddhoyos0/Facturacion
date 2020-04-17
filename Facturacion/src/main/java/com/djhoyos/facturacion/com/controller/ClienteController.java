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

import com.djhoyos.facturacion.com.models.Cliente;
import com.djhoyos.facturacion.com.service.cliente.ClienteService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService servicio;
	
	@GetMapping("lista")
	public List<Cliente> listar(){
		return servicio.listar();
	}

    @PostMapping("/crear")
    public Cliente crear(@RequestBody Cliente cliente) {    	
    	return servicio.crear(cliente);
    }
    
	@PutMapping("/actualizar")
    public void actualizar(@RequestBody Cliente cliente){
        this.servicio.editar(cliente);
    }

    @DeleteMapping("/eliminar/{id}")
    public  void eliminar(@PathVariable int id) {    	
    	servicio.eliminar(id);
    }


}
