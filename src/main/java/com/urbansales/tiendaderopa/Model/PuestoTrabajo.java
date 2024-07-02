package com.urbansales.tiendaderopa.Model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PuestoTrabajo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPuesto_Trabajo")
    private int idPuestoTrabajo;

    @Column(name = "Puesto")
    private String puesto;

    @Column(name = "Fecha_Creacion")
    private Date fechaCreacion;

    @Column(name = "Estado")
    private boolean estado;

    public PuestoTrabajo(){

    }

    public int getIdPuestoTrabajo() {
        return this.idPuestoTrabajo;
    }

    public void setIdPuestoTrabajo(int idPuestoTrabajo) {
        this.idPuestoTrabajo = idPuestoTrabajo;
    }

    public String getPuesto() {
        return this.puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
