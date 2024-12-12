package model;

import java.time.LocalDateTime;

public class modelVentas {
    //Atributos
    private int id;
    private int idUsuario;  // Aquí agregamos el id del usuario
    private int idCredito;
    private float montoSolicitado;
    private int plazoSolicitado;
    private String estado;
    private LocalDateTime fechaSolicitud;

    // Constructor, getters y setters


    public modelVentas(int id, int idUsuario, int idCredito, float montoSolicitado, int plazoSolicitado, String estado, LocalDateTime fechaSolicitud) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idCredito = idCredito;
        this.montoSolicitado = montoSolicitado;
        this.plazoSolicitado = plazoSolicitado;
        this.estado = estado;
        this.fechaSolicitud = fechaSolicitud;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setIdCredito(int idCredito) {
        this.idCredito = idCredito;
    }

    public void setMontoSolicitado(float montoSolicitado) {
        this.montoSolicitado = montoSolicitado;
    }

    public void setPlazoSolicitado(int plazoSolicitado) {
        this.plazoSolicitado = plazoSolicitado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaSolicitud(LocalDateTime fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public int getIdCredito() {
        return idCredito;
    }

    public float getMontoSolicitado() {
        return montoSolicitado;
    }

    public int getPlazoSolicitado() {
        return plazoSolicitado;
    }

    public String getEstado() {
        return estado;
    }

    public LocalDateTime getFechaSolicitud() {
        return fechaSolicitud;
    }
}
