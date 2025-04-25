package pe.edu.upc.parkingzn_sw.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.parkingzn_sw.dtos.SuscripcionDTO;
import pe.edu.upc.parkingzn_sw.entities.Suscripcion;
import pe.edu.upc.parkingzn_sw.servicesinterfaces.ISuscripcionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/suscripciones")
public class SuscripcionController {
    @Autowired
    private ISuscripcionService sR;

    @GetMapping
    public List<SuscripcionDTO> list(){
        return sR.list().stream().map(H->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(H, SuscripcionDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody SuscripcionDTO dto) {
        ModelMapper m = new ModelMapper();
        Suscripcion sp=m.map(dto, Suscripcion.class);
        sR.insert(sp);
    }
    @GetMapping("/{id}")
    public SuscripcionDTO buscarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        SuscripcionDTO dto = m.map(sR, SuscripcionDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody SuscripcionDTO dto) {
        ModelMapper m = new ModelMapper();
        Suscripcion sp=m.map(dto, Suscripcion.class);
        sR.update(sp);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        sR.delete(id);
    }
}
