
package Presentacion;
import dominio.CalcularEtapas;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VistaRegistrar extends javax.swing.JFrame {
    
    public VistaRegistrar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegistrarLabel = new javax.swing.JLabel();
        ImagenPotrosLabel = new javax.swing.JLabel();
        TituloLabel = new javax.swing.JLabel();
        usuarioLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usuarioLabel1 = new javax.swing.JLabel();
        passwordLabel1 = new javax.swing.JLabel();
        nombreTXT = new javax.swing.JTextField();
        emailTXT = new javax.swing.JTextField();
        usuarioTXT = new javax.swing.JTextField();
        passwordTXT = new javax.swing.JPasswordField();
        ButtonEnviar = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        FondoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Entrenador");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegistrarLabel.setFont(new java.awt.Font("Segoe UI", 1, 55)); // NOI18N
        RegistrarLabel.setText("Registrar Entrenador");
        getContentPane().add(RegistrarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 540, 80));

        ImagenPotrosLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PotrosChico.jpg"))); // NOI18N
        getContentPane().add(ImagenPotrosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        TituloLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TituloLabel.setText("       INSTITUTO TECNOLOGICO DE SONORA DEPARTAMENTO DE DEPORTE Y SALUD ");
        TituloLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, null));
        getContentPane().add(TituloLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 810, -1));

        usuarioLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usuarioLabel.setText("Contraseña");
        getContentPane().add(usuarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordLabel.setText("Usuario");
        getContentPane().add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        usuarioLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usuarioLabel1.setText("E-Mail");
        getContentPane().add(usuarioLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, -1));

        passwordLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordLabel1.setText("Nombre");
        getContentPane().add(passwordLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        nombreTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTXTActionPerformed(evt);
            }
        });
        getContentPane().add(nombreTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 160, 20));
        getContentPane().add(emailTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 160, 20));
        getContentPane().add(usuarioTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 160, 20));
        getContentPane().add(passwordTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 160, -1));

        ButtonEnviar.setText("Enviar");
        ButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 90, 40));

        BtnRegresar.setText("Regresar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 100, 40));

        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 100, 40));

        FondoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BlueWallpaper.jpeg"))); // NOI18N
        getContentPane().add(FondoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEnviarActionPerformed

    }//GEN-LAST:event_ButtonEnviarActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
   
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void nombreTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTXTActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JButton ButtonEnviar;
    private javax.swing.JLabel FondoLabel;
    private javax.swing.JLabel ImagenPotrosLabel;
    private javax.swing.JLabel RegistrarLabel;
    private javax.swing.JLabel TituloLabel;
    private javax.swing.JTextField emailTXT;
    private javax.swing.JTextField nombreTXT;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JPasswordField passwordTXT;
    private javax.swing.JLabel usuarioLabel;
    private javax.swing.JLabel usuarioLabel1;
    private javax.swing.JTextField usuarioTXT;
    // End of variables declaration//GEN-END:variables
}
