package co.edu.eam.service;

import co.edu.eam.domain.Personaje;
import java.util.List;

public interface PersonajeService {

    public List<Personaje> listar();
    public Personaje buscar(Personaje personaje);
    public void guardar(Personaje personaje);
    public void eliminar(Personaje personaje);

}
