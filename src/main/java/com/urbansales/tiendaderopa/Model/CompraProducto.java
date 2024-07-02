package com.urbansales.tiendaderopa.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CompraProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    
    @Column(name = "IDCompra")
    private int idCompra;

    @Column(name = "IDProducto")
    private int idProducto;

    @Column(name = "Cantidad_Comprado_Producto")
    private int cantidaCompradoProducto;

    public CompraProducto(){

    }
    
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCompra() {
        return this.idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdProducto() {
        return this.idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidaCompradoProducto() {
        return this.cantidaCompradoProducto;
    }

    public void setCantidaCompradoProducto(int cantidaCompradoProducto) {
        this.cantidaCompradoProducto = cantidaCompradoProducto;
    }
}
