package pe.edu.upc.parkingzn_sw.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Suscripcion")
public class Suscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSuscripcion;
    @Column(name="TipoSuscripcion", length=50, nullable=false)
    private String TipoSuscripcion;
    @Column(name="estado", length=20, nullable=false)
    private String estado;
    @Column(name="tipoPago", length=20, nullable=false)
    private String tipoPago;
    @Column(name="renovada",nullable=false)
    private double renovada;
    @Column(name="fechaInicio", nullable=false)
    private LocalDate fechaInicio;
    @Column(name="fechaFin", nullable=false)
    private LocalDate fechaFin;
    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario usuario;
    public Suscripcion() {

    }

    public Suscripcion(int idSuscripcion, Usuario usuario, LocalDate fechaFin, LocalDate fechaInicio, double renovada, String tipoPago, String estado, String tipoSuscripcion) {
        this.idSuscripcion = idSuscripcion;
        this.usuario = usuario;
        this.fechaFin = fechaFin;
        this.fechaInicio = fechaInicio;
        this.renovada = renovada;
        this.tipoPago = tipoPago;
        this.estado = estado;
        TipoSuscripcion = tipoSuscripcion;
    }

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
