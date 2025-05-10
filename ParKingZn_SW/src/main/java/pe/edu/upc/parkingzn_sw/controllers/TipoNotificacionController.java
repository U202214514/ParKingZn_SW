package pe.edu.upc.parkingzn_sw.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.parkingzn_sw.dtos.TipoNotificacionDTO;
import pe.edu.upc.parkingzn_sw.entities.TipoNotificacion;
import pe.edu.upc.parkingzn_sw.servicesinterfaces.ITipoNotificacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tiponotificaciones")
public class TipoNotificacionController {
    @Autowired
    private ITipoNotificacionService pS;

    @GetMapping
    public List<TipoNotificacionDTO> listar(){
            return pS.list().stream().map(t->{
                ModelMapper m = new ModelMapper();
                return m.map(t, TipoNotificacionDTO.class);
            }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody TipoNotificacionDTO dto){
        ModelMapper m = new ModelMapper();
        TipoNotificacion tp = m.map(dto, TipoNotificacion.class);
        pS.insert(tp);
    }

    @GetMapping("/{id}")
    public TipoNotificacionDTO buscarId(@PathVariable ("id")int id){
        ModelMapper m = new ModelMapper();
        TipoNotificacionDTO dto = m.map(pS, TipoNotificacionDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody TipoNotificacionDTO dto){
        ModelMapper m = new ModelMapper();
        TipoNotificacion tp = m.map(dto, TipoNotificacion.class);
        pS.update(tp);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id){
        pS.delete(id);
    }
    @GetMapping("/busquedas")
    public List<TipoNotificacionDTO>buscarDescripcion(@RequestParam(required = false) String Descripcion){
        return pS.buscar(Descripcion).stream().map(i->{
            ModelMapper m = new ModelMapper();
            return m.map(i,TipoNotificacionDTO.class);
        }).collect(Collectors.toList());
    }
}
