/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aldo;

import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 *
 * @author coner
 */
public class mensajesJOP extends javax.swing.JFrame {

    /**
     * Creates new form mensajesJOP
     */
    public mensajesJOP() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnJOPadvertencia = new javax.swing.JButton();
        btnJOPcbox = new javax.swing.JButton();
        btnJOPconfirmación = new javax.swing.JButton();
        btnJOPdiálogo = new javax.swing.JButton();
        btnJOPescribir = new javax.swing.JButton();
        btnJOPescribirError = new javax.swing.JButton();
        btnJOPopción = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnJOPadvertencia.setText("Advertencia");
        btnJOPadvertencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJOPadvertenciaActionPerformed(evt);
            }
        });

        btnJOPcbox.setText("CBox");
        btnJOPcbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJOPcboxActionPerformed(evt);
            }
        });

        btnJOPconfirmación.setText("Confirmación");
        btnJOPconfirmación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJOPconfirmaciónActionPerformed(evt);
            }
        });

        btnJOPdiálogo.setText("Diálogo");
        btnJOPdiálogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJOPdiálogoActionPerformed(evt);
            }
        });

        btnJOPescribir.setText("Escribir");
        btnJOPescribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJOPescribirActionPerformed(evt);
            }
        });

        btnJOPescribirError.setText("EscribirError");
        btnJOPescribirError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJOPescribirErrorActionPerformed(evt);
            }
        });

        btnJOPopción.setText("Opción");
        btnJOPopción.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJOPopciónActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnJOPopción)
                    .addComponent(btnJOPadvertencia)
                    .addComponent(btnJOPcbox)
                    .addComponent(btnJOPconfirmación)
                    .addComponent(btnJOPdiálogo)
                    .addComponent(btnJOPescribir)
                    .addComponent(btnJOPescribirError))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnJOPadvertencia)
                .addGap(18, 18, 18)
                .addComponent(btnJOPcbox)
                .addGap(18, 18, 18)
                .addComponent(btnJOPconfirmación)
                .addGap(18, 18, 18)
                .addComponent(btnJOPdiálogo)
                .addGap(18, 18, 18)
                .addComponent(btnJOPescribir)
                .addGap(18, 18, 18)
                .addComponent(btnJOPescribirError)
                .addGap(18, 18, 18)
                .addComponent(btnJOPopción)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnJOPadvertenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJOPadvertenciaActionPerformed
        JOptionPane.showMessageDialog(null, "Mensaje dentro de la ventana", "Mensaje en la barra de titulo", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnJOPadvertenciaActionPerformed

    private void btnJOPcboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJOPcboxActionPerformed
        String[] carreras = {
            "Ingeniería en sistemas computacionales",
            "Ingeniería industrial",
            "Ingeniería en mecatrónica",
            "Ingeniería en informatica",
            "Ingeniería petroquímica"
        };
        Icon icon = null;
        String resp = (String) JOptionPane.showInputDialog(null, "Seleccione una carrera a cursar", "Carrera", JOptionPane.DEFAULT_OPTION, icon, carreras, carreras[0]);
        System.out.println(resp);
    }//GEN-LAST:event_btnJOPcboxActionPerformed

    private void btnJOPconfirmaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJOPconfirmaciónActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro?");
        System.out.println(resp);
    }//GEN-LAST:event_btnJOPconfirmaciónActionPerformed

    private void btnJOPdiálogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJOPdiálogoActionPerformed
        JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
    }//GEN-LAST:event_btnJOPdiálogoActionPerformed

    private void btnJOPescribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJOPescribirActionPerformed
        String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
    }//GEN-LAST:event_btnJOPescribirActionPerformed

    private void btnJOPescribirErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJOPescribirErrorActionPerformed
        String respuesta = JOptionPane.showInputDialog(null, "Escriba nuevamente su nombre", "Error!", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnJOPescribirErrorActionPerformed

    private void btnJOPopciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJOPopciónActionPerformed
        String[] options = {"Opcion A", "Opcion B", "Opcion C", "Opcion D"};
        Icon icon = null;
        int seleccion = JOptionPane.showOptionDialog(null,
                "Es necesario que seleccione una opcion",
                "Titulo", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                icon, options, options[0]);
        System.out.println(seleccion);
    }//GEN-LAST:event_btnJOPopciónActionPerformed

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
            java.util.logging.Logger.getLogger(mensajesJOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mensajesJOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mensajesJOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mensajesJOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mensajesJOP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJOPadvertencia;
    private javax.swing.JButton btnJOPcbox;
    private javax.swing.JButton btnJOPconfirmación;
    private javax.swing.JButton btnJOPdiálogo;
    private javax.swing.JButton btnJOPescribir;
    private javax.swing.JButton btnJOPescribirError;
    private javax.swing.JButton btnJOPopción;
    // End of variables declaration//GEN-END:variables
}
