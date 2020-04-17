package com.djhoyos.facturacion.com.service.producto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djhoyos.facturacion.com.models.Producto;
import com.djhoyos.facturacion.com.repository.ProductoRepository;

@Service
public class ProcutoServiceImpl implements ProductoService {
	
	@Autowired
	private ProductoRepository repositorio;
	
	@Override
	public List<Producto> listar() {		
		return repositorio.findAll();
	}

	@Override
	public Producto crear(Producto producto) {		
		return repositorio.save(producto);
	}

	@Override
	public Producto editar(Producto producto) {	
		return repositorio.save(producto);
	}

	@Override
	public void eliminar(int id) {
		repositorio.deleteById(id);
	}

}
