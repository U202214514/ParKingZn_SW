package pe.edu.upc.parkingzn_sw.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.parkingzn_sw.dtos.PagoDTO;
import pe.edu.upc.parkingzn_sw.entities.Pago;
import pe.edu.upc.parkingzn_sw.servicesinterfaces.IPagoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pagos")
public class PagoController {
    @Autowired
    private IPagoService gS;

    @GetMapping
    public List<PagoDTO> list() {
        return gS.list().stream().map(a->{
        ModelMapper m = new ModelMapper();
        return m.map(a, PagoDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody PagoDTO dto){
        ModelMapper m = new ModelMapper();
        Pago pg= m.map(dto, Pago.class);
        gS.insert(pg);
    }

    @GetMapping("/{id}")
    public PagoDTO buscarId(@PathVariable("id")int id){
        ModelMapper m = new ModelMapper();
        PagoDTO dto = m.map(gS, PagoDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody PagoDTO dto){
        ModelMapper m = new ModelMapper();
        Pago pg= m.map(dto, Pago.class);
        gS.update(pg);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id){
        gS.delete(id);
    }
}
