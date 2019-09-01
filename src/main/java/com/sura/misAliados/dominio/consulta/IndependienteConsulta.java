package com.sura.misAliados.dominio.consulta;

import java.util.List;

import com.sura.misAliados.dominio.modelo.Independiente;
import com.sura.misAliados.dominio.repositorio.IndependienteRepositorio;

public class IndependienteConsulta {
	
	private IndependienteRepositorio independienteRepositorio;

	public IndependienteConsulta(IndependienteRepositorio independienteRepositorio) {
		this.independienteRepositorio = independienteRepositorio;
	}

	public List<Independiente> consultarListaIndependientes() {
		return independienteRepositorio.consultarListaIndependientes();
	}
}
