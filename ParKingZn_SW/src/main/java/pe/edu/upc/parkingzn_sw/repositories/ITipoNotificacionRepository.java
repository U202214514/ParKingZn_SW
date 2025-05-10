package pe.edu.upc.parkingzn_sw.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.parkingzn_sw.entities.TipoNotificacion;

import java.util.List;

@Repository
public interface ITipoNotificacionRepository extends JpaRepository<TipoNotificacion, Integer> {

    @Query("Select tp from TipoNotificacion tp where tp.Descripcion like %:nDescripcion%")
    public List<TipoNotificacion> buscarDescripcion(@Param("nDescripcion") String nDescripcion);

}
