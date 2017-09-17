/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

import Vista.Login;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Laboratorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            // TODO code application logic here
            Login ace = new Login();
        } catch (SQLException ex) {
            Logger.getLogger(Laboratorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
