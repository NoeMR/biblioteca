package biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConeccionDB {
    Connection conexion = null;
    String url = "jdbc:mysql://localhost/biblioteca";
    String user = "Noe";
    String pass = "pass";
    public Connection establecerConeccion(){
        try{
        conexion = DriverManager.getConnection(url,user,pass);
        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
        return conexion;
    }
    
    
    
}
