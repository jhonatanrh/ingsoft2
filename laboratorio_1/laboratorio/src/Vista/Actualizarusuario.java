/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JOptionPane;
import Controlador.controlado; //importe Controlador 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Actualizarusuario extends javax.swing.JFrame {

     ResultSet rs;
    controlado control = new controlado();
   String us="";
    
    public Actualizarusuario() throws ClassNotFoundException, SQLException {
        initComponents();
      control.Conexion();//Conexion de base de datos
       this.setSize(720, 350);
    
        
      
           
    }

    Actualizarusuario(ResultSet rs){
          initComponents();
          try {
            
        
          jPanel1.setVisible(true);
      control.Conexion();//Conexion de base de datos
       this.setSize(720, 350);
       while(rs.next()){
                nombre.setText(rs.getString("nombre"));
            apellido.setText(rs.getString("apeliido"));
            usuario.setText(rs.getString("usuario"));
            coo.setText(rs.getString("contraseña"));
            edad.setText(rs.getString("edad"));
            cedula.setText(rs.getString("cedula"));
          contraseña.setText(rs.getString("contraseña"));
            telefono.setText(rs.getString("telefono"));
            coo.setText(rs.getString("activo"));
            } 
           
            
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
        }
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        actualizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        activo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        coo = new javax.swing.JPasswordField();
        contraseña = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 59, 53));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 59, 53));
        jLabel3.setText("Cedula");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        cedula.setBackground(new java.awt.Color(204, 204, 0));
        cedula.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cedula.setForeground(new java.awt.Color(255, 255, 255));
        cedula.setCaretColor(new java.awt.Color(153, 0, 0));
        cedula.setDisabledTextColor(new java.awt.Color(153, 0, 0));
        cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaActionPerformed(evt);
            }
        });
        jPanel1.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 180, 30));

        actualizar.setBackground(new java.awt.Color(204, 204, 0));
        actualizar.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        actualizar.setText("ACTUALIZAR");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        jPanel1.add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 210, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/Delete_26px_2.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 30, 20));

        jLabel5.setBackground(new java.awt.Color(0, 59, 53));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 59, 53));
        jLabel5.setText("Nombre");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 59, 53));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 59, 53));
        jLabel6.setText("Apellidos");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        nombre.setBackground(new java.awt.Color(204, 204, 0));
        nombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setCaretColor(new java.awt.Color(153, 0, 0));
        nombre.setDisabledTextColor(new java.awt.Color(153, 0, 0));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 180, 30));

        edad.setBackground(new java.awt.Color(204, 204, 0));
        edad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        edad.setForeground(new java.awt.Color(255, 255, 255));
        edad.setCaretColor(new java.awt.Color(153, 0, 0));
        edad.setDisabledTextColor(new java.awt.Color(153, 0, 0));
        edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadActionPerformed(evt);
            }
        });
        jPanel1.add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 180, 30));

        jLabel7.setBackground(new java.awt.Color(0, 59, 53));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 59, 53));
        jLabel7.setText("Edad");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        telefono.setBackground(new java.awt.Color(204, 204, 0));
        telefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        telefono.setForeground(new java.awt.Color(255, 255, 255));
        telefono.setCaretColor(new java.awt.Color(153, 0, 0));
        telefono.setDisabledTextColor(new java.awt.Color(153, 0, 0));
        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });
        jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 180, 30));

        jLabel8.setBackground(new java.awt.Color(0, 59, 53));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 59, 53));
        jLabel8.setText("Telefono");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        activo.setBackground(new java.awt.Color(204, 204, 0));
        activo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        activo.setForeground(new java.awt.Color(255, 255, 255));
        activo.setCaretColor(new java.awt.Color(153, 0, 0));
        activo.setDisabledTextColor(new java.awt.Color(153, 0, 0));
        activo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activoActionPerformed(evt);
            }
        });
        jPanel1.add(activo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 180, 30));

        jLabel9.setBackground(new java.awt.Color(0, 59, 53));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 59, 53));
        jLabel9.setText("Correo");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        jLabel11.setBackground(new java.awt.Color(0, 59, 53));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 59, 53));
        jLabel11.setText("Activo");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 70, -1));

        jLabel13.setBackground(new java.awt.Color(0, 59, 53));
        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 59, 53));
        jLabel13.setText("Usuario");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

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
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 180, 30));

        jLabel14.setBackground(new java.awt.Color(0, 59, 53));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 59, 53));
        jLabel14.setText("Contraseña");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        coo.setBackground(new java.awt.Color(204, 204, 0));
        coo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        coo.setForeground(new java.awt.Color(255, 255, 255));
        coo.setCaretColor(new java.awt.Color(153, 0, 0));
        coo.setDisabledTextColor(new java.awt.Color(153, 0, 0));
        jPanel1.add(coo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 180, 30));

        contraseña.setBackground(new java.awt.Color(204, 204, 0));
        contraseña.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        contraseña.setForeground(new java.awt.Color(255, 255, 255));
        contraseña.setCaretColor(new java.awt.Color(153, 0, 0));
        contraseña.setDisabledTextColor(new java.awt.Color(153, 0, 0));
        jPanel1.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 180, 30));

        jLabel2.setBackground(new java.awt.Color(0, 59, 53));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 59, 53));
        jLabel2.setText("POR FAVOR LLENAR EL FORMULARIO CON LA ACTUALIZACION");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        apellido.setBackground(new java.awt.Color(204, 204, 0));
        apellido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        apellido.setForeground(new java.awt.Color(255, 255, 255));
        apellido.setCaretColor(new java.awt.Color(153, 0, 0));
        apellido.setDisabledTextColor(new java.awt.Color(153, 0, 0));
        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });
        jPanel1.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 180, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_formKeyPressed

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void activoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_activoActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed

    private void edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        String user = "";
        String nom = "";
        String apell= "";
        int ced ;
        int tel;
        String tipo ="";
        String corre ="";
        int eda ;
        String usuari="" ;
        String pass1 ="";
        String Activo="";
        Activo=this.coo.getText();
        char [] arrayc;
        nom=this.nombre.getText();
        apell=this.apellido.getText();
        ced = Integer.parseInt(this.cedula.getText());
        tel=Integer.parseInt(this.telefono.getText());
        corre=this.activo.getText();
        eda=Integer.parseInt(this.edad.getText());
        usuari = this.usuario.getText();
        arrayc = this.contraseña.getPassword();
        pass1 = new String(arrayc);

        control.Actualizacion(nom ,apell,ced,tel,corre ,eda,usuari,pass1 ,Activo,us);

        ;
    }//GEN-LAST:event_actualizarActionPerformed

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaActionPerformed

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
    private javax.swing.JTextField activo;
    private javax.swing.JButton actualizar;
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField cedula;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JPasswordField coo;
    private javax.swing.JTextField edad;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField telefono;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
