package com.djhoyos.facturacion.com.service.cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djhoyos.facturacion.com.models.Cliente;
import com.djhoyos.facturacion.com.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteRepository repositorio;

	@Override
	public List<Cliente> listar() {		
		return repositorio.findAll();
	}

	@Override
	public Cliente crear(Cliente cliente) {		
		return repositorio.save(cliente);
	}

	@Override
	public Cliente editar(Cliente cliente) {		
		return repositorio.save(cliente);
	}

	@Override
	public void eliminar(int id) {		
		repositorio.deleteById(id);
	}

}
