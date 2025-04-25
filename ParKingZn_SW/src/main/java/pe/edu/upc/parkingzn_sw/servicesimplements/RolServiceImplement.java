package pe.edu.upc.parkingzn_sw.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.parkingzn_sw.entities.Rol;
import pe.edu.upc.parkingzn_sw.repositories.IRolRepository;
import pe.edu.upc.parkingzn_sw.servicesinterfaces.IRolService;

import java.util.List;

@Service
public class RolServiceImplement implements IRolService {
    @Autowired
    private IRolRepository rR;

    @Override
    public List<Rol> list() {return rR.findAll();}

    @Override
    public void insert(Rol r) {rR.save(r);}

    @Override
    public Rol listId(int idRol) {return rR.findById(idRol).orElse(new Rol());}

    @Override
    public void update(Rol r) { rR.save(r);}

    @Override
    public void delete(int idRol) {rR.deleteById(idRol);}

}
