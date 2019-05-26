/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DMI;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author coner
 */
public class MódulosAcceso extends javax.swing.JFrame {

    /**
     * Creates new form ModulosAcceso
     */
    public MódulosAcceso() {
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

        ImageIcon icon = new ImageIcon(getClass().getResource("/img/FONDO.png"));
        Image image = icon.getImage();
        dkpMAfondo = new javax.swing.JDesktopPane() {
            public void paintComponent(Graphics g)	{
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        btnMAingresar_empleado = new javax.swing.JButton();
        btnMAingresar_cliente = new javax.swing.JButton();
        btnMAbuscar_cliente = new javax.swing.JButton();
        btnMAbuscar_empleado = new javax.swing.JButton();
        btnMAbuscar_producto = new javax.swing.JButton();
        btnMAbuscar_servicio = new javax.swing.JButton();
        btnMAingresar_servicio = new javax.swing.JButton();
        btnMAingresar_producto = new javax.swing.JButton();
        btnMAcotizar_producto = new javax.swing.JButton();
        btnMAagendar = new javax.swing.JButton();
        btnMAasignar_contraseña = new javax.swing.JButton();
        btnMAmodificar_contraseña = new javax.swing.JButton();
        btnMAsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMAingresar_empleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_perm_contact_cal_grey600_18dp_1.png"))); // NOI18N
        btnMAingresar_empleado.setText("Ingresar Empleado");
        btnMAingresar_empleado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMAingresar_empleado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMAingresar_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMAingresar_empleadoActionPerformed(evt);
            }
        });

        btnMAingresar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_account_circle_grey600_18dp.png"))); // NOI18N
        btnMAingresar_cliente.setText("Ingresar Cliente");
        btnMAingresar_cliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMAingresar_cliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMAingresar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMAingresar_clienteActionPerformed(evt);
            }
        });

        btnMAbuscar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_perm_identity_grey600_18dp.png"))); // NOI18N
        btnMAbuscar_cliente.setText("Buscar Cliente");
        btnMAbuscar_cliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMAbuscar_cliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMAbuscar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMAbuscar_clienteActionPerformed(evt);
            }
        });

        btnMAbuscar_empleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_dashboard_grey600_18dp.png"))); // NOI18N
        btnMAbuscar_empleado.setText("Buscar Empleado");
        btnMAbuscar_empleado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMAbuscar_empleado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMAbuscar_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMAbuscar_empleadoActionPerformed(evt);
            }
        });

        btnMAbuscar_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_perm_identity_black_18dp.png"))); // NOI18N
        btnMAbuscar_producto.setText("Buscar Producto");
        btnMAbuscar_producto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMAbuscar_producto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMAbuscar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMAbuscar_productoActionPerformed(evt);
            }
        });

        btnMAbuscar_servicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_add_to_photos_grey600_18dp.png"))); // NOI18N
        btnMAbuscar_servicio.setText("Buscar Servicio");
        btnMAbuscar_servicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMAbuscar_servicio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMAbuscar_servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMAbuscar_servicioActionPerformed(evt);
            }
        });

        btnMAingresar_servicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_credit_card_grey600_18dp.png"))); // NOI18N
        btnMAingresar_servicio.setText("Ingresar Servicio");
        btnMAingresar_servicio.setDoubleBuffered(true);
        btnMAingresar_servicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMAingresar_servicio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMAingresar_servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMAingresar_servicioActionPerformed(evt);
            }
        });

        btnMAingresar_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_add_shopping_cart_grey600_18dp.png"))); // NOI18N
        btnMAingresar_producto.setText("Ingresar Producto");
        btnMAingresar_producto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMAingresar_producto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMAingresar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMAingresar_productoActionPerformed(evt);
            }
        });

        btnMAcotizar_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_credit_card_black_18dp.png"))); // NOI18N
        btnMAcotizar_producto.setText("Cotizar Producto");
        btnMAcotizar_producto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMAcotizar_producto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMAcotizar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMAcotizar_productoActionPerformed(evt);
            }
        });

        btnMAagendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_dashboard_white_18dp.png"))); // NOI18N
        btnMAagendar.setText("Agendar");
        btnMAagendar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMAagendar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMAagendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMAagendarActionPerformed(evt);
            }
        });

        btnMAasignar_contraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_lock_outline_grey600_18dp.png"))); // NOI18N
        btnMAasignar_contraseña.setText("Asignar Contraseña");
        btnMAasignar_contraseña.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMAasignar_contraseña.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMAasignar_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMAasignar_contraseñaActionPerformed(evt);
            }
        });

        btnMAmodificar_contraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_vpn_key_grey600_18dp.png"))); // NOI18N
        btnMAmodificar_contraseña.setText("Modificar Contraseña");
        btnMAmodificar_contraseña.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMAmodificar_contraseña.setPreferredSize(new java.awt.Dimension(137, 100));
        btnMAmodificar_contraseña.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMAmodificar_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMAmodificar_contraseñaActionPerformed(evt);
            }
        });

        btnMAsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_exit_to_app_grey600_18dp.png"))); // NOI18N
        btnMAsalir.setText("Salir");
        btnMAsalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMAsalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMAsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMAsalirActionPerformed(evt);
            }
        });

        dkpMAfondo.setLayer(btnMAingresar_empleado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpMAfondo.setLayer(btnMAingresar_cliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpMAfondo.setLayer(btnMAbuscar_cliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpMAfondo.setLayer(btnMAbuscar_empleado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpMAfondo.setLayer(btnMAbuscar_producto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpMAfondo.setLayer(btnMAbuscar_servicio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpMAfondo.setLayer(btnMAingresar_servicio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpMAfondo.setLayer(btnMAingresar_producto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpMAfondo.setLayer(btnMAcotizar_producto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpMAfondo.setLayer(btnMAagendar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpMAfondo.setLayer(btnMAasignar_contraseña, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpMAfondo.setLayer(btnMAmodificar_contraseña, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpMAfondo.setLayer(btnMAsalir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dkpMAfondoLayout = new javax.swing.GroupLayout(dkpMAfondo);
        dkpMAfondo.setLayout(dkpMAfondoLayout);
        dkpMAfondoLayout.setHorizontalGroup(
            dkpMAfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkpMAfondoLayout.createSequentialGroup()
                .addGroup(dkpMAfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dkpMAfondoLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnMAasignar_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(btnMAmodificar_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMAsalir))
                    .addGroup(dkpMAfondoLayout.createSequentialGroup()
                        .addGroup(dkpMAfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dkpMAfondoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(dkpMAfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMAingresar_empleado)
                                    .addComponent(btnMAbuscar_empleado))
                                .addGap(46, 46, 46)
                                .addGroup(dkpMAfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMAbuscar_cliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMAingresar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(dkpMAfondoLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(btnMAagendar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 362, Short.MAX_VALUE)
                        .addGroup(dkpMAfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dkpMAfondoLayout.createSequentialGroup()
                                .addGroup(dkpMAfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMAingresar_producto, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnMAbuscar_producto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addGroup(dkpMAfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMAingresar_servicio, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnMAbuscar_servicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dkpMAfondoLayout.createSequentialGroup()
                                .addComponent(btnMAcotizar_producto)
                                .addGap(85, 85, 85)))))
                .addContainerGap())
        );
        dkpMAfondoLayout.setVerticalGroup(
            dkpMAfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkpMAfondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dkpMAfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dkpMAfondoLayout.createSequentialGroup()
                        .addGroup(dkpMAfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMAbuscar_producto)
                            .addComponent(btnMAingresar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMAingresar_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(dkpMAfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMAbuscar_servicio)
                            .addComponent(btnMAbuscar_empleado)
                            .addComponent(btnMAingresar_producto)
                            .addComponent(btnMAbuscar_cliente)))
                    .addComponent(btnMAingresar_servicio))
                .addGroup(dkpMAfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dkpMAfondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(btnMAcotizar_producto)
                        .addGap(62, 62, 62))
                    .addGroup(dkpMAfondoLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnMAagendar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(dkpMAfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMAasignar_contraseña)
                    .addComponent(btnMAsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMAmodificar_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkpMAfondo)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkpMAfondo)
        );

        setSize(new java.awt.Dimension(978, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMAingresar_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMAingresar_empleadoActionPerformed
        IngresarEmpleado IE = new IngresarEmpleado();
        this.dkpMAfondo.add(IE);
        IE.show();
    }//GEN-LAST:event_btnMAingresar_empleadoActionPerformed

    private void btnMAingresar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMAingresar_clienteActionPerformed
        IngresarCliente IC = new IngresarCliente();
        this.dkpMAfondo.add(IC);
        IC.show();
    }//GEN-LAST:event_btnMAingresar_clienteActionPerformed

    private void btnMAbuscar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMAbuscar_clienteActionPerformed
        BuscarCliente BC = new BuscarCliente();
        this.dkpMAfondo.add(BC);
        BC.show();
    }//GEN-LAST:event_btnMAbuscar_clienteActionPerformed

    private void btnMAbuscar_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMAbuscar_empleadoActionPerformed
        BuscarEmpleado BE = new BuscarEmpleado();
        this.dkpMAfondo.add(MA);
        MA.show();
    }//GEN-LAST:event_btnMAbuscar_empleadoActionPerformed

    private void btnMAbuscar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMAbuscar_productoActionPerformed
        BuscarProducto BP = new BuscarProducto();
        this.dkpMAfondo.add(BP);
        BP.show();
    }//GEN-LAST:event_btnMAbuscar_productoActionPerformed

    private void btnMAbuscar_servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMAbuscar_servicioActionPerformed
        BuscarServicio BS = new BuscarServicio();
        this.dkpMAfondo.add(BS);
        BS.show();
    }//GEN-LAST:event_btnMAbuscar_servicioActionPerformed

    private void btnMAingresar_servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMAingresar_servicioActionPerformed
        IngresarServicio IS = new IngresarServicio();
        this.dkpMAfondo.add(IS);
        IS.show();
    }//GEN-LAST:event_btnMAingresar_servicioActionPerformed

    private void btnMAingresar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMAingresar_productoActionPerformed
        IngresarProducto IP = new IngresarProducto();
        this.dkpMAfondo.add(IP);
        IP.show();
    }//GEN-LAST:event_btnMAingresar_productoActionPerformed

    private void btnMAcotizar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMAcotizar_productoActionPerformed
        CotizarProducto CR = new CotizarProducto();
        this.dkpMAfondo.add(CR);
        CR.show();
    }//GEN-LAST:event_btnMAcotizar_productoActionPerformed

    private void btnMAagendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMAagendarActionPerformed
        Agendar A = new Agendar();
        this.dkpMAfondo.add(A);
        A.show();
    }//GEN-LAST:event_btnMAagendarActionPerformed

    private void btnMAasignar_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMAasignar_contraseñaActionPerformed
        AsignarContraseña AC = new AsignarContraseña();
        this.dkpMAfondo.add(AC);
        AC.show();
    }//GEN-LAST:event_btnMAasignar_contraseñaActionPerformed

    private void btnMAmodificar_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMAmodificar_contraseñaActionPerformed
        ModificarContraseña MC = new ModificarContraseña();
        this.dkpMAfondo.add(MC);
        MC.show();
    }//GEN-LAST:event_btnMAmodificar_contraseñaActionPerformed

    private void btnMAsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMAsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnMAsalirActionPerformed

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
            java.util.logging.Logger.getLogger(MódulosAcceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MódulosAcceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MódulosAcceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MódulosAcceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MódulosAcceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMAagendar;
    private javax.swing.JButton btnMAasignar_contraseña;
    private javax.swing.JButton btnMAbuscar_cliente;
    private javax.swing.JButton btnMAbuscar_empleado;
    private javax.swing.JButton btnMAbuscar_producto;
    private javax.swing.JButton btnMAbuscar_servicio;
    private javax.swing.JButton btnMAcotizar_producto;
    private javax.swing.JButton btnMAingresar_cliente;
    private javax.swing.JButton btnMAingresar_empleado;
    private javax.swing.JButton btnMAingresar_producto;
    private javax.swing.JButton btnMAingresar_servicio;
    private javax.swing.JButton btnMAmodificar_contraseña;
    private javax.swing.JButton btnMAsalir;
    private javax.swing.JDesktopPane dkpMAfondo;
    // End of variables declaration//GEN-END:variables
}
