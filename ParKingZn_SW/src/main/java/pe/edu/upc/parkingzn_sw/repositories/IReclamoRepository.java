package pe.edu.upc.parkingzn_sw.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.parkingzn_sw.entities.Reclamo;

@Repository
public interface IReclamoRepository extends JpaRepository<Reclamo, Integer> {

}
