package com.djhoyos.facturacion.com.service.tipoDocumento;

import java.util.List;

import com.djhoyos.facturacion.com.models.TipoDocumento;

public interface TipoDocumentoService {
	List<TipoDocumento> listar();
	TipoDocumento crear(TipoDocumento tipoDocumento);
}
