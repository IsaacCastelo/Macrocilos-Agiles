
package Presentacion;

public class VistaLogin extends javax.swing.JFrame {
    
    
    
    public VistaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImagenPotrosLabel = new javax.swing.JLabel();
        TituloLabel = new javax.swing.JLabel();
        VolumenEtapaLabel = new javax.swing.JLabel();
        VolumenEtapaLabel1 = new javax.swing.JLabel();
        VolumenEtapaLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        passTXT = new javax.swing.JPasswordField();
        VolumenEtapaText = new javax.swing.JTextField();
        ButtonEnviar1 = new javax.swing.JButton();
        ButtonEnviar = new javax.swing.JButton();
        FondoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImagenPotrosLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PotrosChico.jpg"))); // NOI18N
        getContentPane().add(ImagenPotrosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        TituloLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TituloLabel.setText("       INSTITUTO TECNOLOGICO DE SONORA DEPARTAMENTO DE DEPORTE Y SALUD ");
        TituloLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, null));
        getContentPane().add(TituloLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 760, -1));

        VolumenEtapaLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        VolumenEtapaLabel.setText("Iniciar Sesión");
        getContentPane().add(VolumenEtapaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        VolumenEtapaLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        VolumenEtapaLabel1.setText("Contraseña");
        getContentPane().add(VolumenEtapaLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        VolumenEtapaLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        VolumenEtapaLabel2.setText("Usuario");
        getContentPane().add(VolumenEtapaLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("¿No estás registrado?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, -1, -1));
        getContentPane().add(passTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 140, -1));

        VolumenEtapaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolumenEtapaTextActionPerformed(evt);
            }
        });
        getContentPane().add(VolumenEtapaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 140, -1));

        ButtonEnviar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnRegister.png"))); // NOI18N
        ButtonEnviar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEnviar1ActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonEnviar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 120, 30));

        ButtonEnviar.setText("Submit");
        ButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 110, 50));

        FondoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BlueWallpaper.jpeg"))); // NOI18N
        getContentPane().add(FondoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEnviarActionPerformed
Portada port=new Portada();
this.dispose();
port.setVisible(true);
    }//GEN-LAST:event_ButtonEnviarActionPerformed

    private void VolumenEtapaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolumenEtapaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VolumenEtapaTextActionPerformed

    private void ButtonEnviar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEnviar1ActionPerformed
        VistaRegistrar reg = new VistaRegistrar();
       this.dispose();
        reg.setVisible(true);
       
    }//GEN-LAST:event_ButtonEnviar1ActionPerformed

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
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaLogin().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEnviar;
    private javax.swing.JButton ButtonEnviar1;
    private javax.swing.JLabel FondoLabel;
    private javax.swing.JLabel ImagenPotrosLabel;
    private javax.swing.JLabel TituloLabel;
    private javax.swing.JLabel VolumenEtapaLabel;
    private javax.swing.JLabel VolumenEtapaLabel1;
    private javax.swing.JLabel VolumenEtapaLabel2;
    private javax.swing.JTextField VolumenEtapaText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField passTXT;
    // End of variables declaration//GEN-END:variables
}
