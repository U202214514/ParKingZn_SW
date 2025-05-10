package pe.edu.upc.parkingzn_sw.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.parkingzn_sw.dtos.EmpresaDTO;
import pe.edu.upc.parkingzn_sw.entities.Empresa;
import pe.edu.upc.parkingzn_sw.servicesinterfaces.IEmpresaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {
    @Autowired
    private IEmpresaService eS;

    @GetMapping
    public List<EmpresaDTO> listar(){

        return eS.list().stream().map(p->{
            ModelMapper m = new ModelMapper();
            return m.map(p, EmpresaDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody EmpresaDTO dto) {
        ModelMapper m = new ModelMapper();
        Empresa e = m.map(dto, Empresa.class);
        eS.insert(e);
    }
    @GetMapping("/{id}")
    public EmpresaDTO buscarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        EmpresaDTO dto = m.map(eS, EmpresaDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody EmpresaDTO dto) {
        ModelMapper m = new ModelMapper();
        Empresa e = m.map(dto, Empresa.class);
        eS.update(e);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        eS.delete(id);
    }
}
