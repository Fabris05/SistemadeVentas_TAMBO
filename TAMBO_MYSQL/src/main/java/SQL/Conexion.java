
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author fabri
 */
public class Conexion {
    
    public static Connection getConexion(){
        
       String conexionUrl= "jdbc:mysql://localhost:3306/TAMBO?user=root&password=12345";
               
       //Conexion para sqlServer
       
//               "jdbc:mysql://localhost:3306;"
//               +"database=TAMBO;"
//               +"user=root;"
//               +"password=12345;"
//               +"loginTimeout=30;"
//               +"encrypt=true; trustServerCertificate=false;"
//               +"TrustServerCertificate=True;";
       
       try{
           Connection con=DriverManager.getConnection(conexionUrl);
           return con;
       }catch(SQLException ex){
           System.out.println(ex.toString());
           return null;
       }
    }

    PreparedStatement prepareStatement(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
