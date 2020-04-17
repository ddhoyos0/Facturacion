package com.djhoyos.facturacion.com.service.factura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djhoyos.facturacion.com.models.Factura;
import com.djhoyos.facturacion.com.repository.FacturaRepository;

@Service
public class FacturaServiceImpl implements FacturaService {
	
	@Autowired
	private FacturaRepository repositorio; 
	
	@Override
	public List<Factura> listar() {
		return repositorio.findAll();
	}

	@Override
	public Factura crear(Factura factura) {
		return repositorio.save(factura);
	}

	@Override
	public void eliminar(int id) {
		repositorio.deleteById(id);
	}

}
