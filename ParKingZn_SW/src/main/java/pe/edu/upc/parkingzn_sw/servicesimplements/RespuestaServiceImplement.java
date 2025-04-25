package pe.edu.upc.parkingzn_sw.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.parkingzn_sw.entities.Respuesta;
import pe.edu.upc.parkingzn_sw.repositories.IRespuestaRepository;
import pe.edu.upc.parkingzn_sw.servicesinterfaces.IRespuestaService;

import java.util.List;

@Service
public class RespuestaServiceImplement implements IRespuestaService {

    @Autowired
    private IRespuestaRepository eR;

    @Override
    public List<Respuesta> list() {
        return eR.findAll();
    }

    @Override
    public void insert(Respuesta ra) {
        eR.save(ra);
    }

    @Override
    public Respuesta listId(int id) {
        return eR.findById(id).orElse(new Respuesta());
    }

    @Override
    public void update(Respuesta ra) {
        eR.save(ra);
    }

    @Override
    public void delete(int id) {
        eR.deleteById(id);
    }
}
