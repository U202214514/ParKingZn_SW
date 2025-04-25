package pe.edu.upc.parkingzn_sw.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name="nombre", length = 50, nullable = false)
    private String nombre;
    @Column(name ="apellido", length = 50, nullable = false)
    private String apellido;
    @Column(name ="correo", length = 75, nullable = false)
    private String correo;
    @Column(name ="contrasenia", length = 50, nullable = false)
    private String contrasenia;
    @Column(name ="telefono", length = 20, nullable = false)
    private String telefono;
    @Column(name = "tipoUsuario", length = 75, nullable = false)
    private String tipoUsuario;
    @Column(name ="latitud", nullable = false )
    private double latitud;
    @Column(name ="longitud", nullable = false )
    private double longitud;
    @Column(name ="esNuevo", nullable = false )
    private boolean esNuevo;

    @ManyToOne
    @JoinColumn(name="idRol")
    private Rol rol;

    public Usuario(){

    }

    public Usuario(int idUsuario, String nombre, String apellido, String correo, String contrasenia, String telefono, String tipoUsuario, double latitud, double longitud, boolean esNuevo, Rol rol) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.telefono = telefono;
        this.tipoUsuario = tipoUsuario;
        this.latitud = latitud;
        this.longitud = longitud;
        this.esNuevo = esNuevo;
        this.rol = rol;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public boolean isEsNuevo() {
        return esNuevo;
    }

    public void setEsNuevo(boolean esNuevo) {
        this.esNuevo = esNuevo;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
