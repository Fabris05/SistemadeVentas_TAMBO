package com.urbansales.tiendaderopa.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Compra {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCompra")
    private int idCompra;

    @Column(name = "IDEmpleado")
    private int idEmpleado;

    @Column(name = "Codigo")
    private String codigo;

    @Column(name = "Precio_Neto")
    private double precioNeto;

    @Column(name = "Cantidad_Total_Productos")
    private int cantidadTotalProductos;

    public Compra(){

    }

    public int getIdCompra() {
        return this.idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecioNeto() {
        return this.precioNeto;
    }

    public void setPrecioNeto(double precioNeto) {
        this.precioNeto = precioNeto;
    }

    public int getCantidadTotalProductos() {
        return this.cantidadTotalProductos;
    }

    public void setCantidadTotalProductos(int cantidadTotalProductos) {
        this.cantidadTotalProductos = cantidadTotalProductos;
    }
}
