package pe.edu.upc.parkingzn_sw.servicesinterfaces;


import pe.edu.upc.parkingzn_sw.entities.Pago;

import java.util.List;

public interface IPagoService {
    public List<Pago> list();
    public void insert(Pago pg);
    public Pago listId(int id);
    public void update(Pago pg);
    public void delete(int id);

}
