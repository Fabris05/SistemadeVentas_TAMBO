package com.urbansales.tiendaderopa.Model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Proveedor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDProveedor")
    private int idProveedor;

    @Column(name = "RUC")
    private String ruc;

    @Column(name = "Razon_Social")
    private String razonSocial;

    @Column(name = "Representante")
    private String representante;

    @Column(name = "Direccion")
    private String direccion;

    @Column(name = "Correo_Electronico")
    private String correoElectronico;

    @Column(name = "Telefono")
    private String telefono;

    @Column(name = "Fecha_Inicio_Actividad")
    private Date fechaInicioActividad;

    public Proveedor(){

    }

    public int getIdProveedor() {
        return this.idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getRuc() {
        return this.ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return this.razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRepresentante() {
        return this.representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return this.correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaInicioActividad() {
        return this.fechaInicioActividad;
    }

    public void setFechaInicioActividad(Date fechaInicioActividad) {
        this.fechaInicioActividad = fechaInicioActividad;
    }
}
