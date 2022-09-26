package co.edu.eam.service;


import co.edu.eam.dao.PersonajeDao;
import co.edu.eam.domain.Personaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonajeImplementation implements PersonajeService {

    @Autowired
    private PersonajeDao personajeDao;

    @Override
    @Transactional(readOnly = true)
    public List<Personaje> listar() {
        return (List<Personaje>) personajeDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Personaje buscar(Personaje personaje) {
        return personajeDao.findById(personaje.getId()).orElse(null);
    }

    @Override
    @Transactional
    public void guardar(Personaje personaje) {
        personajeDao.save(personaje);
    }

    @Override
    @Transactional
    public void eliminar(Personaje personaje) {
        personajeDao.delete(personaje);
    }
}