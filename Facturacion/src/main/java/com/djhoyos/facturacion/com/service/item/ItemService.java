package com.djhoyos.facturacion.com.service.item;

import java.util.List;

import com.djhoyos.facturacion.com.models.Item;

public interface ItemService {
	List<Item> listar();
	Item crear(Item item);
	void eliminar(int id);
}
