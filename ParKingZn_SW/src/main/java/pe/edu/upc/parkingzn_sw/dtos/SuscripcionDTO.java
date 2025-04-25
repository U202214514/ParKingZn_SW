package pe.edu.upc.parkingzn_sw.dtos;


import pe.edu.upc.parkingzn_sw.entities.Usuario;

import java.time.LocalDate;

public class SuscripcionDTO {

    private int idSuscripcion;

    private String TipoSuscripcion;

    private String estado;

    private String tipoPago;

    private double renovada;

    private LocalDate fechaInicio;

    private LocalDate fechaFin;

    private Usuario usuario;

    public int getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(int idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }

    public String getTipoSuscripcion() {
        return TipoSuscripcion;
    }

    public void setTipoSuscripcion(String tipoSuscripcion) {
        TipoSuscripcion = tipoSuscripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public double getRenovada() {
        return renovada;
    }

    public void setRenovada(double renovada) {
        this.renovada = renovada;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
