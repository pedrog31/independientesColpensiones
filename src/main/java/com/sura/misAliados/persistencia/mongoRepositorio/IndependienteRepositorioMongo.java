package com.sura.misAliados.persistencia.mongoRepositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sura.misAliados.persistencia.entidad.IndependienteEntidad;

@Repository
public interface IndependienteRepositorioMongo extends MongoRepository<IndependienteEntidad, String> {

}
