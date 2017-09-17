package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Conexion {

    public Connection Conexion = null;

    public void conecxionBD() {
        try {
            String draver = "org.postgresql.Driver";
            String ruta = "jdbc:postgresql://localhost:5432/laboratorio";
            String user = "postgres";
            String password = "postgresql";
            Class.forName(draver);
            Conexion = (Connection) DriverManager.getConnection(ruta, user, password);
            if (Conexion != null) {
                System.out.print("Conexion base de datos   ");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

    //consulta en base de datos 
    public String Consultar(String user, String pass) throws SQLException {//consulta de tipo de usuario

        String tipo = "";

        String Query = "SELECT rol FROM usuarios WHERE usuario ='" + user + "' AND contraseña = '" + pass + "'  ";
        Statement st = Conexion.createStatement();
        java.sql.ResultSet resultSet;
        resultSet = st.executeQuery(Query);
        while (resultSet.next()) {
            tipo = resultSet.getString("rol");

        }
        return tipo;
    }

    public String ConsUser(String user) throws SQLException {//consulta de Usuario
        String use = "";
        String Query = "SELECT usuario FROM usuarios WHERE usuario ='" + user + "'";
        Statement st = Conexion.createStatement();
        java.sql.ResultSet resultSet;
        resultSet = st.executeQuery(Query);
        while (resultSet.next()) {
            use = resultSet.getString("usuario");

        }
        return use;
    }

    public String Consultactivo(String user) throws SQLException {
         String use = "";
        String Query = "SELECT activo FROM usuarios WHERE usuario ='" + user + "'";
        Statement st = Conexion.createStatement();
        java.sql.ResultSet resultSet;
        resultSet = st.executeQuery(Query);
        while (resultSet.next()) {
            use = resultSet.getString("activo");

        }
        return use; }

    public void NuevoUser(String nom, String apell, int ced, int tel,  String corre,int  eda, String usuari, String pass1, String ROL, String activo) {
       try {
            String Query = ("insert into usuarios(nombre,apeliido ,  cedula , usuario ,contraseña,edad ,telefono,rol ,activo ) values( '" + nom + "' , '" + apell + "',' " + ced + "','" + usuari + "','" + pass1 + "','" + eda + "','" + tel + "','" + ROL + "','" + activo + "' )");
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error ");

        } }

    public ResultSet conuser() throws SQLException {
       
        String Query = "select usuario from usuarios ";
        Statement st = Conexion.createStatement();
        java.sql.ResultSet resultSet;
        resultSet = st.executeQuery(Query);

        return resultSet;}

   

    public void Actualizacion(String nom, String apell, int ced, int tel, String corre, int eda, String usuari, String pass1, String Activo, String us) {
       try {
            String Query = ("update into usuarios(nombre,apeliido ,  cedula , usuario ,contraseña,edad ,telefono,activo ) values( '" + nom + "' , '" + apell + "',' " + ced + "','" + usuari + "','" + pass1 + "','" + eda + "','" + tel + "','" +  Activo + "' ) where usuario ='" + us + "'");
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error ");

        }
    }

    public ResultSet Cons() throws SQLException {
     String Query = "SELECT * FROM usuarios";
        Statement st = Conexion.createStatement();
        java.sql.ResultSet resultSet;
        resultSet = st.executeQuery(Query);

       
        System.out.println(resultSet);
         return resultSet;
    }

    public ResultSet datos(String us) throws SQLException {
     String Query = "select * from usuarios where usuario = '" + us + "' ";
        Statement st = Conexion.createStatement();
        java.sql.ResultSet resultSet;
        resultSet = st.executeQuery(Query);
     System.out.println(us);
        return resultSet; }

 

}