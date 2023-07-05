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
public class Categorias {
    private String Categoria;



    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
    public String toString(){
        return Categoria;
    }
    
    public Vector<Categorias> mostrarcategorias(){
        PreparedStatement ps=null;
        ResultSet rs=null;
        Conexion cx=new Conexion();
        Connection con=cx.getConexion();
        
        Vector<Categorias> datos= new Vector<Categorias>();
        Categorias dat=null;
        
        
        try{
            String sql="SELECT Categoria FROM CATEGORIA";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            dat=new Categorias();
            dat.setCategoria("Seleccione categoria");
            datos.add(dat);
            
            
            
            while(rs.next()){
                dat=new Categorias();
                dat.setCategoria(rs.getString("Categoria"));
                datos.add(dat);
            }
            
            rs.close();
        }catch(SQLException ex){
            System.err.println(ex.toString());
        }
        return datos;
    }
}
