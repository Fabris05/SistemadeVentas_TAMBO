package com.urbansales.tiendaderopa.Model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDProducto")
    private int idProducto;

    @Column(name = "IDCategoria_Producto")
    private int idCategoriaProducto;

    @Column(name = "Codigo_Producto")
    private String codigoProducto;
    
    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Cantidad")
    private int cantidad;

    @Column(name = "Talla")
    private char talla;

    @Column(name = "Precio_Unitario")
    private double precioUnitario;

    @Column(name = "Fecha_Agregacion")
    private Date fechaAgregacion;

    @Column(name = "Estado")
    private boolean estado;

    @Column(name = "QR")
    private String qr;

    public Producto(){

    }

    public int getIdProducto() {
        return this.idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdCategoriaProducto() {
        return this.idCategoriaProducto;
    }

    public void setIdCategoriaProducto(int idCategoriaProducto) {
        this.idCategoriaProducto = idCategoriaProducto;
    }

    public String getCodigoProducto() {
        return this.codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public char getTalla() {
        return this.talla;
    }

    public void setTalla(char talla) {
        this.talla = talla;
    }

    public double getPrecioUnitario() {
        return this.precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Date getFechaAgregacion() {
        return this.fechaAgregacion;
    }

    public void setFechaAgregacion(Date fechaAgregacion) {
        this.fechaAgregacion = fechaAgregacion;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getQr() {
        return this.qr;
    }

    public void setQr(String qr) {
        this.qr = qr;
    }
}
