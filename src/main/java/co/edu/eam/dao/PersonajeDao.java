package co.edu.eam.dao;

import co.edu.eam.domain.Personaje;
import org.springframework.data.repository.CrudRepository;

public interface PersonajeDao extends CrudRepository<Personaje, Long> {

}