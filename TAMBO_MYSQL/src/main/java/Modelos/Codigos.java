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
public class Codigos {
    private String Codigo;

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String toString(){
        return Codigo;
    }
    
    public Vector<Codigos> mostrarCodigos(String Categoria){
        PreparedStatement ps=null;
        ResultSet rs=null;
        Conexion cx=new Conexion();
        Connection con=cx.getConexion();
        
        Vector<Codigos> datos= new Vector<Codigos>();
        Codigos dat=null;
        
        
        try{
            String sql="SELECT Codigo FROM Producto where Categoria='"+Categoria+"'";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            dat=new Codigos();
            dat.setCodigo("Seleccione código");
            datos.add(dat);
            
            
            
            while(rs.next()){
                dat=new Codigos();
                dat.setCodigo(rs.getString("Codigo"));
                datos.add(dat);
            }
            
            rs.close();
        }catch(SQLException ex){
            System.err.println(ex.toString());
        }
        return datos;
    }
}
