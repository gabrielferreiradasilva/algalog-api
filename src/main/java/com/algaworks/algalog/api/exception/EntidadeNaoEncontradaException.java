package com.algaworks.algalog.api.exception;

import com.algaworks.algalog.domain.exception.NegocioException;

public class EntidadeNaoEncontradaException extends NegocioException {

	private static final long serialVersionUID = 1L;

	public EntidadeNaoEncontradaException(String message) {
		super(message);
	}

	
}
