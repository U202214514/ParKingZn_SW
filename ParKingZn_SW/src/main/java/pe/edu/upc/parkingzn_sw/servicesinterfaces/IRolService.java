package pe.edu.upc.parkingzn_sw.servicesinterfaces;


import pe.edu.upc.parkingzn_sw.entities.Rol;

import java.util.List;

public interface IRolService {
    public List<Rol> list();
    public void insert(Rol r);
    public Rol listId(int idRol);
    public void update(Rol r);
    public void delete(int idRol);
}
