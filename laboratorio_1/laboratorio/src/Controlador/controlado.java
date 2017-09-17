
package Controlador;

import Modelo.Conexion; //importar packages de modelo y su clase 
import java.sql.ResultSet;

import java.sql.SQLException;



public class controlado {

    public static ResultSet user() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    Conexion login = new Conexion();
  
    public void Conexion() throws ClassNotFoundException, SQLException{
        login.conecxionBD();
    }

    public String Consultar(String user, String pass) throws SQLException {
     String tipo="";
       tipo=login.Consultar(user, pass);
       
       return tipo;
    }
    
  public String ConsultarUSER(String usuario) throws SQLException {
       String tipo="";
       tipo=login.ConsUser(usuario);
       return tipo;
    }

    public String Consultactivo(String usuario) throws SQLException {
      String tipo="";
       tipo=login.Consultactivo(usuario);
       return tipo;
    }

    public void NuevoUser(String nom, String apell, int ced, int tel,  String corre,int  eda, String usuari, String pass1, String ROL, String activo) {
    login.NuevoUser(nom,  apell, ced, tel,  corre,  eda, usuari, pass1, ROL, activo);
    }

    public ResultSet conuser() throws SQLException {
      ResultSet rs = null;
        rs = login.conuser();
       return rs;}

    public  ResultSet  datos(String us) throws SQLException {
       ResultSet rs = null;
        rs = login.datos( us);
       return rs;
    }

    public void Actualizacion(String nom, String apell, int ced, int tel, String corre, int eda, String usuari, String pass1, String Activo, String us) {
    login.Actualizacion(nom,apell,ced,tel, corre,eda,  usuari, pass1, Activo, us);
    }

    public ResultSet Cons() throws SQLException {
      ResultSet rs = null;
        rs = login.Cons();
       return rs;  }

   
}

    

  

   

   

   

