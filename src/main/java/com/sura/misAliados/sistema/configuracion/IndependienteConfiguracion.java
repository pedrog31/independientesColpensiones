package com.sura.misAliados.sistema.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sura.misAliados.dominio.consulta.IndependienteConsulta;
import com.sura.misAliados.dominio.repositorio.IndependienteRepositorio;
import com.sura.misAliados.dominio.servicio.IndependienteServicio;

@Configuration
public class IndependienteConfiguracion {

	@Bean
	IndependienteConsulta crearIndependienteConsulta (IndependienteRepositorio independienteRepositorio) {
		return new IndependienteConsulta (independienteRepositorio);
	}

	@Bean
	IndependienteServicio crearIndependienteServicio (IndependienteRepositorio independienteRepositorio) {
		return new IndependienteServicio (independienteRepositorio);
	}

}
