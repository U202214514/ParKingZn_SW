package pe.edu.upc.parkingzn_sw.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.parkingzn_sw.dtos.EstacionamientoDTO;
import pe.edu.upc.parkingzn_sw.entities.Estacionamiento;
import pe.edu.upc.parkingzn_sw.servicesinterfaces.IEstacionamientoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/estacionamientos")
public class EstacionamientoController {
    @Autowired
    private IEstacionamientoService aS;

    @GetMapping
    public List<Estacionamiento> listar() {
        return aS.list().stream().map(i -> {
            ModelMapper m = new ModelMapper();
            return m.map(i, Estacionamiento.class);
        }).collect(Collectors.toList());

    }

    @PostMapping
    public void insertar(@RequestBody EstacionamientoDTO dto) {
        ModelMapper m = new ModelMapper();
        Estacionamiento e = m.map(dto, Estacionamiento.class);
        aS.insert(e);
    }

    @GetMapping("/{id}")
    public EstacionamientoDTO buscarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        EstacionamientoDTO dto = m.map(aS, EstacionamientoDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody EstacionamientoDTO dto) {
        ModelMapper m = new ModelMapper();
        Estacionamiento e = m.map(dto, Estacionamiento.class);
        aS.update(e);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        aS.delete(id);
    }
}
