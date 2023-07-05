/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import SQL.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;



/**
 *
 * @author fabri
 */
public class Calculo_Precio {
    protected String Codigo;
    protected String Producto;
    protected int Cantidad;
    protected double Precio;
    protected double Importe;

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }
    
    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public double getImporte() {
        return Importe;
    }

    public void setImporte(double Importe) {
        this.Importe = Importe;
    }
    
    
    public Vector<Calculo_Precio> Precio(double Precio){
        PreparedStatement ps=null;
        ResultSet rs=null;
        Conexion cx=new Conexion();
        Connection con=cx.getConexion();
        
        Vector<Calculo_Precio> datos= new Vector<Calculo_Precio>();
        Calculo_Precio dat=null;
        
        try{
            String sql="SELECT Precio FROM Producto where Codigo='"+Codigo+"'";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            dat=new Calculo_Precio();
 
            while(rs.next()){
                dat=new Calculo_Precio();
                dat.setCodigo(rs.getString("Precio"));
                datos.add(dat);
            }
            
            rs.close();
        }catch(SQLException ex){
            System.err.println(ex.toString());
        }
        return datos;
    }
        
}
