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

import com.djhoyos.facturacion.com.models.Item;
import com.djhoyos.facturacion.com.service.item.ItemService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("item")
public class ItemController {
	@Autowired
	private ItemService servicio;
	
	@GetMapping("lista")
	public List<Item> listar(){
		return servicio.listar();
	}

    @PostMapping("/crear")
    public Item crear(@RequestBody Item item) {    	
    	return servicio.crear(item);
    }
    

    @DeleteMapping("/eliminar/{id}")
    public  void eliminar(@PathVariable int id) {    	
    	servicio.eliminar(id);
    }
}
