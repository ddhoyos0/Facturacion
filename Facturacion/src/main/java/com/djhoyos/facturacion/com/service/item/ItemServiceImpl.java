package com.djhoyos.facturacion.com.service.item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djhoyos.facturacion.com.models.Item;
import com.djhoyos.facturacion.com.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemRepository repositorio; 
	
	@Override
	public List<Item> listar() {
		return repositorio.findAll();
	}

	@Override
	public Item crear(Item item) {
		return repositorio.save(item);
	}

	@Override
	public void eliminar(int id) {
		repositorio.deleteById(id);
	}

}
