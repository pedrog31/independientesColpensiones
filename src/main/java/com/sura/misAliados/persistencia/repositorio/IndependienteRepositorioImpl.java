package com.sura.misAliados.persistencia.repositorio;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.sura.misAliados.dominio.modelo.Independiente;
import com.sura.misAliados.dominio.repositorio.IndependienteRepositorio;
import com.sura.misAliados.persistencia.convertidor.IndependienteConvertidor;
import com.sura.misAliados.persistencia.entidad.IndependienteEntidad;
import com.sura.misAliados.persistencia.mongoRepositorio.IndependienteRepositorioMongo;

@Repository
public class IndependienteRepositorioImpl implements IndependienteRepositorio {
	
	@Autowired
	MongoOperations operacionMongo;
	
	@Autowired
	IndependienteRepositorioMongo independienteRepositorioMongo;
	
	@Autowired
	IndependienteConvertidor independienteConvertidor;
	
	
	@Override
	public List<Independiente> consultarListaIndependientes() {
		return independienteRepositorioMongo
				.findAll()
				.stream()
				.map(independienteConvertidor::convertirAIndependiente)
				.collect(Collectors.toList());
	}

	@Override
	public void registrarIndependiente(Independiente independiente) {
		independienteRepositorioMongo.save(
				independienteConvertidor.convertirAIndependienteEntidad(independiente));
	}

	@Override
	public void actualizarEstadoIndependiente(String tipoDocumento, String numeroDocumento, String estado) {
		Query query = new Query();
		query.addCriteria(Criteria.where("tipoDocumento").is(tipoDocumento));
		query.addCriteria(Criteria.where("numeroDocumento").is(numeroDocumento));
		Update update = new Update();
		update.set("estado", estado);
		operacionMongo.updateFirst(query, update, IndependienteEntidad.class);
	}
}
