package com.djhoyos.facturacion.com.service.tipoDocumento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djhoyos.facturacion.com.models.TipoDocumento;
import com.djhoyos.facturacion.com.repository.TipoDocumentoRepository;

@Service
public class TipoDocumentoImpl implements TipoDocumentoService {
	
	@Autowired
	private TipoDocumentoRepository repositorio;

	@Override
	public List<TipoDocumento> listar() {		
		return repositorio.findAll();
	}

	@Override
	public TipoDocumento crear(TipoDocumento tipoDocumento) {		
		return repositorio.save(tipoDocumento);
	}

}
