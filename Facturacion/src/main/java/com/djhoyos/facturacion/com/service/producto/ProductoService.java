package com.djhoyos.facturacion.com.service.producto;

import java.util.List;

import com.djhoyos.facturacion.com.models.Producto;

public interface ProductoService {
	List<Producto> listar();
	Producto crear(Producto producto);
	Producto editar	(Producto producto);
	void eliminar(int id);
}
