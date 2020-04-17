package com.djhoyos.facturacion.com.service.factura;

import java.util.List;

import com.djhoyos.facturacion.com.models.Factura;

public interface FacturaService {
	List<Factura> listar();
	Factura crear(Factura factura);
	void eliminar(int id);
}
