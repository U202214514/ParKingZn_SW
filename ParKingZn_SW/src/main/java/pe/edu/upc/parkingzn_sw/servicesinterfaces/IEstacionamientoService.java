package pe.edu.upc.parkingzn_sw.servicesinterfaces;

import pe.edu.upc.parkingzn_sw.entities.Estacionamiento;

import java.util.List;

public interface IEstacionamientoService {
    public List<Estacionamiento> list();
    public void insert(Estacionamiento e);
    public Estacionamiento listId(int id);
    public void update(Estacionamiento e);
    public void delete(int id);
}

