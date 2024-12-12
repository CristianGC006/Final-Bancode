package model;

import java.time.LocalDateTime;

public class modelPagoCreditos {
    //ATributos
    private int id;
    private int idSolicitud;
    private double montoPagado;
    private LocalDateTime fechaPago;
    private double saldoRestante;

    // Constructor, getters y setters


    public modelPagoCreditos(int id, int idSolicitud, double montoPagado, LocalDateTime fechaPago, double saldoRestante) {
        this.id = id;
        this.idSolicitud = idSolicitud;
        this.montoPagado = montoPagado;
        this.fechaPago = fechaPago;
        this.saldoRestante = saldoRestante;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public void setMontoPagado(double montoPagado) {
        this.montoPagado = montoPagado;
    }

    public void setFechaPago(LocalDateTime fechaPago) {
        this.fechaPago = fechaPago;
    }

    public void setSaldoRestante(double saldoRestante) {
        this.saldoRestante = saldoRestante;
    }

    public int getId() {
        return id;
    }

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public double getMontoPagado() {
        return montoPagado;
    }

    public LocalDateTime getFechaPago() {
        return fechaPago;
    }

    public double getSaldoRestante() {
        return saldoRestante;
    }
}
