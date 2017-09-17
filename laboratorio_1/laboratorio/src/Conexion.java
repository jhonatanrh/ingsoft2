
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
     public Connection conexion=null;

    Connection conexion() {
 
        try {

             String draver = "org.postgresql.Driver";
             String ruta = "jdbc:postgresql://localhost:5432/laboratorio";
             String user = "postgres";
             String password = "postgresql";
             Class.forName(draver);
             conexion = (Connection) DriverManager.getConnection(ruta, user, password);
             


        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage());
        }
        return conexion;
    }

   
}
