package pe.edu.upc.parkingzn_sw.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.parkingzn_sw.entities.Reclamo;
import pe.edu.upc.parkingzn_sw.repositories.IReclamoRepository;
import pe.edu.upc.parkingzn_sw.servicesinterfaces.IReclamoService;

import java.util.List;

@Service
public class ReclamoServiceImplement implements IReclamoService {
    @Autowired
    private IReclamoRepository mR;

    @Override
    public List<Reclamo> list() {
        return mR.findAll();
    }

    @Override
    public void insert(Reclamo rm) {
        mR.save(rm);
    }

    @Override
    public Reclamo listId(int id) {
        return mR.findById(id).orElse(new Reclamo());
    }

    @Override
    public void update(Reclamo rm) {
        mR.save(rm);
    }

    @Override
    public void delete(int id) {
        mR.deleteById(id);
    }
}
