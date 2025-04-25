package pe.edu.upc.parkingzn_sw.servicesinterfaces;


import pe.edu.upc.parkingzn_sw.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public List<Usuario> list();
    public void insert(Usuario u);
    public Usuario listId(int id);
    public void update(Usuario u);
    public void delete(int id);
    public List<Usuario> buscar(String nombre);
}
