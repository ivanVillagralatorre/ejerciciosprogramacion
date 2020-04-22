/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import t9p1e1.Principal;


public class Ventana extends javax.swing.JFrame {


    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(null);
        // Utilizamos la ventana para dar de alta una persona
        bAnterior.setVisible(false);
        bSiguiente.setVisible(false);
        bSalir.setVisible(false);
        
    }

    public Ventana(String n, int e,String p, String t) {
        initComponents();
         this.setLocationRelativeTo(null);
        // Utilizamos la ventana para mostrar datos.
        bAceptar.setVisible(false);
        tfNombre.setEditable(false);
        tfEdad.setEditable(false);
        tfProfesion.setEditable(false);
        tfTelefono.setEditable(false);
        llenar(n,e,p,t);
        
    }
     
    public void llenar(String n, Integer e,String p, String t)
     {
         tfNombre.setText(n);
         tfEdad.setText(e.toString());
         tfProfesion.setText(p);
         tfTelefono.setText(t);
     }
   
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfEdad = new javax.swing.JTextField();
        tfProfesion = new javax.swing.JTextField();
        tfTelefono = new javax.swing.JTextField();
        bAceptar = new javax.swing.JButton();
        bSiguiente = new javax.swing.JButton();
        bAnterior = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Nombre");

        jLabel3.setText("Edad");

        jLabel4.setText("Profesión");

        jLabel5.setText("Teléfono");

        jLabel6.setFont(new java.awt.Font("Padre", 1, 16)); // NOI18N
        jLabel6.setText("Personas");

        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        bSiguiente.setText(">");
        bSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSiguienteActionPerformed(evt);
            }
        });

        bAnterior.setText("<");
        bAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnteriorActionPerformed(evt);
            }
        });

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tfTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addComponent(tfProfesion, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(tfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bAnterior)
                        .addGap(18, 18, 18)
                        .addComponent(bSiguiente)
                        .addGap(18, 18, 18)
                        .addComponent(bSalir)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bAceptar)
                        .addGap(124, 124, 124))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel6)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSiguiente)
                    .addComponent(bAnterior)
                    .addComponent(bSalir))
                .addGap(27, 27, 27)
                .addComponent(bAceptar)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean validar(){
        try
        {
         
            
            Pattern patron = Pattern.compile("^[A-Z][a-z ]*$");
            Matcher mat = patron.matcher(tfNombre.getText());
            if (!mat.matches())
               
            
            patron = Pattern.compile("^[0-9]{1,2}$");
            mat = patron.matcher(tfEdad.getText());
            if (!mat.matches())
             
            
            patron = Pattern.compile("^[A-Z][a-z ]*$");
            mat = patron.matcher(tfProfesion.getText());
            if (!mat.matches())
            
            
            patron = Pattern.compile("^[6789][0-9]{8}$");
            mat = patron.matcher(tfTelefono.getText());
        
            
            return true;
        
 
    
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Problemas validando");
            return false;
        }
    }
    
    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        try
        {
            if (validar())
            {
                Principal.registrarPersona(tfNombre.getText(), Integer.parseInt(tfEdad.getText()), tfProfesion.getText(), tfTelefono.getText());
                JOptionPane.showMessageDialog(this,"Persona insertada en la base de datos");
                Principal.salir();
            }
        }
        catch(MySQLIntegrityConstraintViolationException e)
        {
            JOptionPane.showMessageDialog(this,"El nombre de la persona debe ser único");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Problemas " + e.getMessage());
        }
    }//GEN-LAST:event_bAceptarActionPerformed

    private void bSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSiguienteActionPerformed
        
        if (Principal.isSiguiente())
        {
            String n=Principal.getSiguienteNombre();
            Integer e = Principal.getEdad();
            String p = Principal.getProfesion();
            String t=Principal.getTelefono();
            llenar(n,e,p,t);
        }
        else
            JOptionPane.showMessageDialog(this, " No hay más personas");
        
    }//GEN-LAST:event_bSiguienteActionPerformed

    private void bAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnteriorActionPerformed
        if (Principal.isAnterior())
        {
            // objeto
            String n=Principal.getAnteriorNombre();
            Integer e = Principal.getEdad();
            String p = Principal.getProfesion();
            String t=Principal.getTelefono();
            llenar(n,e,p,t);
        }
        else
            JOptionPane.showMessageDialog(this, " No hay más personas");
    }//GEN-LAST:event_bAnteriorActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        Principal.salir();
    }//GEN-LAST:event_bSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bAnterior;
    private javax.swing.JButton bSalir;
    private javax.swing.JButton bSiguiente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField tfEdad;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfProfesion;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}
