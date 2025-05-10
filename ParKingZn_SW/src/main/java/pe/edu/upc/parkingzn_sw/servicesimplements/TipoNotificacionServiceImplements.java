package pe.edu.upc.parkingzn_sw.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.parkingzn_sw.entities.TipoNotificacion;
import pe.edu.upc.parkingzn_sw.repositories.ITipoNotificacionRepository;
import pe.edu.upc.parkingzn_sw.servicesinterfaces.ITipoNotificacionService;

import java.util.List;

@Service
public class TipoNotificacionServiceImplements implements ITipoNotificacionService {
    @Autowired
    private ITipoNotificacionRepository pR;

    @Override
    public List<TipoNotificacion> list() {
        return pR.findAll();
    }

    @Override
    public void insert(TipoNotificacion tp) {
        pR.save(tp);
    }

    @Override
    public TipoNotificacion listId(int id) {
        return pR.findById(id).orElse(new TipoNotificacion());
    }

    @Override
    public void update(TipoNotificacion tp) {
        pR.save(tp);
    }

    @Override
    public void delete(int id) {
        pR.deleteById(id);
    }

    @Override
    public List<TipoNotificacion> buscar(String Descripcion) {
        return pR.buscarDescripcion(Descripcion);
    }
}
