package pe.edu.upc.parkingzn_sw.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.parkingzn_sw.entities.Usuario;
import pe.edu.upc.parkingzn_sw.repositories.IUsuarioRepository;
import pe.edu.upc.parkingzn_sw.servicesinterfaces.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {

    @Autowired
    private IUsuarioRepository uR;
    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }

    @Override
    public void insert(Usuario u) {
        uR.save(u);
    }

    @Override
    public Usuario listId(int id) {
        return uR.findById(id).orElse(new Usuario());
    }

    @Override
    public void update(Usuario u) {
        uR.save(u);
    }

    @Override
    public void delete(int id) {
        uR.deleteById(id);
    }

    @Override
    public List<Usuario> buscar(String nombre) {
        return uR.buscarNombre(nombre);
    }
}
