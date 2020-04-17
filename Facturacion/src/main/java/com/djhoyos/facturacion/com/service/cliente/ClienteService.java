package com.djhoyos.facturacion.com.service.cliente;

import java.util.List;

import com.djhoyos.facturacion.com.models.Cliente;

public interface ClienteService {
	List<Cliente> listar();
	Cliente crear(Cliente cliente);
	Cliente editar	(Cliente cliente);
	void eliminar(int id);
}
