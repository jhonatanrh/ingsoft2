
package Vista;

import javax.swing.JOptionPane;
import Controlador.controlado; //importe Controlador 
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Login extends javax.swing.JFrame {

    
    controlado control = new controlado();
    public Login() throws ClassNotFoundException, SQLException {
        initComponents();
        control.Conexion();//Conexion de base de datos
        this.setLocationRelativeTo(null);
    
    }                                                                           

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        Iniciar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 59, 53));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 59, 53));
        jLabel2.setText("USUARIO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 59, 53));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 59, 53));
        jLabel3.setText("CONTRASEÑA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        usuario.setBackground(new java.awt.Color(204, 204, 0));
        usuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setCaretColor(new java.awt.Color(153, 0, 0));
        usuario.setDisabledTextColor(new java.awt.Color(153, 0, 0));
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 180, 30));

        pass.setBackground(new java.awt.Color(204, 204, 0));
        pass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pass.setForeground(new java.awt.Color(255, 255, 255));
        pass.setCaretColor(new java.awt.Color(153, 0, 0));
        pass.setDisabledTextColor(new java.awt.Color(153, 0, 0));
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 180, 30));

        Iniciar.setBackground(new java.awt.Color(204, 204, 0));
        Iniciar.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Iniciar.setText("INICIAR SESION");
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });
        jPanel1.add(Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 210, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 680, 230));

        jPanel2.setBackground(new java.awt.Color(204, 204, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/universidad-cundinamarca.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 490, 130));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/Delete_26px_2.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 30, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
        String user = "";
        String tipo ="";
        String usuario="" ;
        String pass1 ="";
        char [] arrayc;
        usuario = this.usuario.getText();
        arrayc = this.pass.getPassword();
        pass1 = new String(arrayc);
        
        
        if (usuario.equals("") && pass1.equals("")){
            JOptionPane.showMessageDialog(null,"INGRESE SU USUARIO Y CONTRASEÑA");
        }
         else{
                if(usuario.equals("") ){
                    
                   JOptionPane.showMessageDialog(null,"INGRESE SU USUARIO");
               } 
                else {
                   if(pass1.equals("")){
                        JOptionPane.showMessageDialog(null,"INGRESE SU CONTRASEÑA");
                      } 
                   else{
                       try {
                           
                          user = control.ConsultarUSER(usuario);//Consulta del Usuario
                          if(user.equals("")){
                           JOptionPane.showMessageDialog(null,"NO EXISTE USUARIO");
                       }
                          else {
                              String ac=control.Consultactivo(usuario);
                              if (ac.equals("si")){
                                                             
                             try {
                                 tipo = control.Consultar(usuario, pass1); //Consulta de tipo de Usuario
                                 if(tipo.equals("Admin") ){
                                  Menu_Admin ad = new Menu_Admin();
                                  ad.setVisible(true);
                                  dispose();
//Colocar Ventana de admin
                                }
                                else {
                                  if(tipo.equals("Asistente")  ){
                                      
                                      Menu_Usua menu = null;
                                      menu = new Menu_Usua();
                                      menu.setVisible(true);
                                      dispose();
                                              
                                 }
                                  else{
                                      if(tipo.equals("")){
                                          JOptionPane.showMessageDialog(null,"Contraseña No Coincide "+tipo);
                                      }
                                  }
                               }
                           } catch (SQLException ex) {
                              Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                           }
                          }
                           else{
                                  
                              }
                          }
                       }   catch (SQLException ex) {
                          Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                       }
                   }
                }
        } 
    }//GEN-LAST:event_IniciarActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_formKeyPressed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
