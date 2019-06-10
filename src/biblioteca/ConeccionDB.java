package biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConeccionDB {
    Connection conectar = null;
    
    public Connection establecerConeccion() throws SQLException, ClassNotFoundException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "userb", "pass");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex);
        }
        return conectar;
    }
    
    
    
}
