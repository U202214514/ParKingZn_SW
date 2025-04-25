package pe.edu.upc.parkingzn_sw.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.parkingzn_sw.dtos.UsuarioDTO;
import pe.edu.upc.parkingzn_sw.entities.Usuario;
import pe.edu.upc.parkingzn_sw.servicesinterfaces.IUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService uS;

    @GetMapping
    public List<UsuarioDTO> listar(){
        return uS.list().stream().map(o->{
            ModelMapper m = new ModelMapper();
            return m.map(o,UsuarioDTO.class);
        }).collect(Collectors.toList());

    }
    @PostMapping
    public void insertar(@RequestBody UsuarioDTO dto){
        ModelMapper m = new ModelMapper();
        Usuario us = m.map(dto, Usuario.class);
        uS.insert(us);
    }
    @GetMapping("/{id}")
    public UsuarioDTO buscarId(@PathVariable("id")int id){
        ModelMapper m = new ModelMapper();
        UsuarioDTO dto = m.map(uS, UsuarioDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody UsuarioDTO dto){
        ModelMapper m = new ModelMapper();
        Usuario us = m.map(dto, Usuario.class);
        uS.update(us);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id){uS.delete(id);}

    @GetMapping("/busquedas")
    public List<UsuarioDTO>buscarNombre(@RequestParam(required = false) String nombre){
        return uS.buscar(nombre).stream().map(h->{
            ModelMapper m = new ModelMapper();
            return m.map(h,UsuarioDTO.class);
        }).collect(Collectors.toList());
    }
}
