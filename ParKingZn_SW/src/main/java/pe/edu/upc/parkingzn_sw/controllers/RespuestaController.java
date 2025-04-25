package pe.edu.upc.parkingzn_sw.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.parkingzn_sw.dtos.RespuestaDTO;
import pe.edu.upc.parkingzn_sw.entities.Respuesta;
import pe.edu.upc.parkingzn_sw.servicesinterfaces.IRespuestaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/respuestas")
public class RespuestaController {
    @Autowired
    private IRespuestaService eS;

    @GetMapping
    public List<RespuestaDTO> list(){
        return eS.list().stream().map(w->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(w,RespuestaDTO.class);
        }).collect(Collectors.toList());

    }
    @PostMapping
    public void insertar(@RequestBody RespuestaDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Respuesta ra = modelMapper.map(dto,Respuesta.class);
        eS.insert(ra);
    }
    @GetMapping("/{id}")
    public RespuestaDTO buscarId(@PathVariable("id") int id){
        ModelMapper modelMapper = new ModelMapper();
        RespuestaDTO dto = modelMapper.map(eS, RespuestaDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody RespuestaDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Respuesta ra = modelMapper.map(dto,Respuesta.class);
        eS.update(ra);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id){
        eS.delete(id);
    }

}
