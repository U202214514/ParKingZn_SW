package pe.edu.upc.parkingzn_sw.dtos;

import pe.edu.upc.parkingzn_sw.entities.Reserva;
import pe.edu.upc.parkingzn_sw.entities.Usuario;

import java.time.LocalDate;
import java.time.LocalTime;

public class ReclamoDTO {


    private int idReclamo;

    private String titulo;

    private String descripcion;

    private Boolean archivo;

    private LocalDate fecha;

    private String estado;

    private LocalTime hora;

    private Usuario usuario;

    private Reserva reserva;

    public int getIdReclamo() {
        return idReclamo;
    }

    public void setIdReclamo(int idReclamo) {
        this.idReclamo = idReclamo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getArchivo() {
        return archivo;
    }

    public void setArchivo(Boolean archivo) {
        this.archivo = archivo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
