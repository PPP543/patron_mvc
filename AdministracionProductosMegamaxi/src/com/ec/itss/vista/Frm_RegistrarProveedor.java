        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.itss.vista;

//import static com.ec.itss.main.Principal.frm_prov;
import com.ec.itss.modelo.ListarProveedores;
import com.ec.itss.modelo.Proveedor;
import com.ec.itss.modelo.RegistrarProveedor;
import javax.swing.JOptionPane;
//import com.ec.itss.modelo.RegistrarProveedor;

/**
 *
 * @author PAUL CROSSOVER
 */
public class Frm_RegistrarProveedor extends javax.swing.JFrame {

    /**
     * Creates new form Frm_RegistrarProveedor
     */
    public Frm_RegistrarProveedor() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableProveedor = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtNomProv = new javax.swing.JTextField();
        btnCerrar2 = new javax.swing.JButton();
        btnGuardarProv = new javax.swing.JButton();
        btnActualizar2 = new javax.swing.JButton();
        txtRuc = new javax.swing.JTextField();
        txtEntregas = new javax.swing.JTextField();
        txtTprov = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableProveedor.setBackground(new java.awt.Color(204, 204, 255));
        tableProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tableProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nombre Proveedor", "Ruc Proveedor", "Cantidad Entregas Mes", "Tipo Proveedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProveedor);
        if (tableProveedor.getColumnModel().getColumnCount() > 0) {
            tableProveedor.getColumnModel().getColumn(0).setPreferredWidth(40);
            tableProveedor.getColumnModel().getColumn(1).setPreferredWidth(40);
            tableProveedor.getColumnModel().getColumn(2).setPreferredWidth(40);
            tableProveedor.getColumnModel().getColumn(3).setMinWidth(30);
            tableProveedor.getColumnModel().getColumn(3).setPreferredWidth(40);
        }

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txtNomProv.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12))); // NOI18N
        txtNomProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomProvActionPerformed(evt);
            }
        });

        btnCerrar2.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrar2.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnCerrar2.setText("Cerrar");
        btnCerrar2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        btnCerrar2.setBorderPainted(false);
        btnCerrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar2ActionPerformed(evt);
            }
        });

        btnGuardarProv.setBackground(new java.awt.Color(255, 0, 0));
        btnGuardarProv.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnGuardarProv.setText("Guardar");
        btnGuardarProv.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        btnGuardarProv.setBorderPainted(false);
        btnGuardarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProvActionPerformed(evt);
            }
        });

        btnActualizar2.setBackground(new java.awt.Color(255, 0, 0));
        btnActualizar2.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnActualizar2.setText("Actualizar");
        btnActualizar2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        btnActualizar2.setBorderPainted(false);
        btnActualizar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizar2MouseClicked(evt);
            }
        });
        btnActualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar2ActionPerformed(evt);
            }
        });

        txtRuc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ruc Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12))); // NOI18N
        txtRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRucActionPerformed(evt);
            }
        });

        txtEntregas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cantidad Entregas Mes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12))); // NOI18N
        txtEntregas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntregasActionPerformed(evt);
            }
        });

        txtTprov.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12))); // NOI18N
        txtTprov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTprovActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtRuc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(btnActualizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNomProv, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTprov))
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtEntregas, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGuardarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnCerrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNomProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEntregas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTprov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCerrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        txtEntregas.getAccessibleContext().setAccessibleName("Entregas al Mes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(187, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar2ActionPerformed

    private void btnGuardarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProvActionPerformed
        // TODO add your handling code here:
        
        ListarProveedores a = new ListarProveedores();
        RegistrarProveedor b= new RegistrarProveedor();
        Proveedor r = new Proveedor();
        r.setNombre (txtNomProv.getText());
        r.setRuc(txtRuc.getText());
        r.setCantidadEntregaAlMes(Integer.parseInt(txtEntregas.getText()));
        r.setTipo_proveedor(txtTprov.getText());
        b.registrar(r);
        limpiarentradas();
        a.mostrarTabla(tableProveedor);
        JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");
        
        

        
    }//GEN-LAST:event_btnGuardarProvActionPerformed

    private void btnCerrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar2ActionPerformed
        // TODO add your handling code here:
        dispose();
        //System.exit(0);
    }//GEN-LAST:event_btnCerrar2ActionPerformed

    private void txtNomProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomProvActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNomProvActionPerformed

    private void txtEntregasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntregasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntregasActionPerformed

    private void txtRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRucActionPerformed

    private void txtTprovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTprovActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTprovActionPerformed

    private void btnActualizar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar2MouseClicked

    private void tableProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProveedorMouseClicked
        
        ListarProveedores a = new ListarProveedores();
        RegistrarProveedor b= new RegistrarProveedor();
        Proveedor r = new Proveedor();
        a.mostrarTabla(tableProveedor);
        int fila = tableProveedor.getSelectedRow();
        txtNomProv.setText(this.tableProveedor.getValueAt(fila, 3).toString());
        r.setRuc(txtRuc.toString());
        r.setCantidadEntregaAlMes(Integer.parseInt(txtEntregas.toString()));
        r.setTipo_proveedor(txtTprov.toString());
        a.mostrarTabla(tableProveedor);
        JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS CORRECTAMENTE");
        //b.registrar(r);
        //limpiarentradas();
    }//GEN-LAST:event_tableProveedorMouseClicked

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
            java.util.logging.Logger.getLogger(Frm_RegistrarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_RegistrarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_RegistrarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_RegistrarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_RegistrarProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar2;
    public javax.swing.JButton btnCerrar2;
    public javax.swing.JButton btnGuardarProv;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tableProveedor;
    public javax.swing.JTextField txtEntregas;
    public javax.swing.JTextField txtNomProv;
    public javax.swing.JTextField txtRuc;
    public javax.swing.JTextField txtTprov;
    // End of variables declaration//GEN-END:variables

    private void limpiarentradas() {
        txtEntregas.setText("");
        txtNomProv.setText("");
        txtRuc.setText("");
        txtTprov.setText("");
        
    }
    
   
}
