/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.itss.vista;

import com.ec.itss.modelo.Categoria;
import com.ec.itss.modelo.ListarCategoria;
import com.ec.itss.modelo.ListarProveedores;
import com.ec.itss.modelo.Proveedor;
import com.ec.itss.modelo.Utensilio;
import java.util.ArrayList;

/**
 *
 * @author ppucha
 */
public class Frm_RegistrarProducto extends javax.swing.JDialog {

    private Utensilio utensilio;

    /**
     * Creates new form frm_registrarProducto
     */
    public Frm_RegistrarProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrarCategorias();
        mostrarProveedores();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtPrecio = new javax.swing.JTextField();
        txtFechaCaducidad = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        txtIdentificador = new javax.swing.JTextField();
        jPanelPropiedadesUtensilio = new javax.swing.JPanel();
        jRadioButtonEsPlastico = new javax.swing.JRadioButton();
        jRadioButtonEsMetal = new javax.swing.JRadioButton();
        jRadioButtonEsImportado = new javax.swing.JRadioButton();
        jPanelPropiedadesCarnico = new javax.swing.JPanel();
        jRadioButtonCarnicoPollo = new javax.swing.JRadioButton();
        jRadioButtonCarnicoCerdo = new javax.swing.JRadioButton();
        jRadioButtonCarnicoCarne = new javax.swing.JRadioButton();
        txtPesoKg = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanelPropiedadesLiquido = new javax.swing.JPanel();
        jRadioButtonEsLacteo = new javax.swing.JRadioButton();
        textCapacidadEnvase = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jComboBoxProveedor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txtPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Precio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12))); // NOI18N
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        txtFechaCaducidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha caducidad (días)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12))); // NOI18N
        txtFechaCaducidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaCaducidadActionPerformed(evt);
            }
        });

        txtCantidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cantidad en existencia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12))); // NOI18N
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12))); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jComboBoxCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12))); // NOI18N
        jComboBoxCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxCategoriaItemStateChanged(evt);
            }
        });

        txtIdentificador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Identificador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12))); // NOI18N
        txtIdentificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificadorActionPerformed(evt);
            }
        });

        jPanelPropiedadesUtensilio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Propiedades utensilio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12))); // NOI18N

        jRadioButtonEsPlastico.setText("Plástico");

        jRadioButtonEsMetal.setText("Metal");

        jRadioButtonEsImportado.setText("Importado");

        javax.swing.GroupLayout jPanelPropiedadesUtensilioLayout = new javax.swing.GroupLayout(jPanelPropiedadesUtensilio);
        jPanelPropiedadesUtensilio.setLayout(jPanelPropiedadesUtensilioLayout);
        jPanelPropiedadesUtensilioLayout.setHorizontalGroup(
            jPanelPropiedadesUtensilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPropiedadesUtensilioLayout.createSequentialGroup()
                .addComponent(jRadioButtonEsPlastico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonEsMetal, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonEsImportado))
        );
        jPanelPropiedadesUtensilioLayout.setVerticalGroup(
            jPanelPropiedadesUtensilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPropiedadesUtensilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jRadioButtonEsMetal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jRadioButtonEsPlastico, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jRadioButtonEsImportado))
        );

        jPanelPropiedadesCarnico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Propiedades cárnico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12))); // NOI18N

        buttonGroup1.add(jRadioButtonCarnicoPollo);
        jRadioButtonCarnicoPollo.setText("Pollo");

        buttonGroup1.add(jRadioButtonCarnicoCerdo);
        jRadioButtonCarnicoCerdo.setText("Cerdo");

        buttonGroup1.add(jRadioButtonCarnicoCarne);
        jRadioButtonCarnicoCarne.setText("Carne");

        txtPesoKg.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Peso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel1.setText("kg");

        javax.swing.GroupLayout jPanelPropiedadesCarnicoLayout = new javax.swing.GroupLayout(jPanelPropiedadesCarnico);
        jPanelPropiedadesCarnico.setLayout(jPanelPropiedadesCarnicoLayout);
        jPanelPropiedadesCarnicoLayout.setHorizontalGroup(
            jPanelPropiedadesCarnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPropiedadesCarnicoLayout.createSequentialGroup()
                .addComponent(jRadioButtonCarnicoPollo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonCarnicoCarne, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonCarnicoCerdo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelPropiedadesCarnicoLayout.createSequentialGroup()
                .addComponent(txtPesoKg, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelPropiedadesCarnicoLayout.setVerticalGroup(
            jPanelPropiedadesCarnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPropiedadesCarnicoLayout.createSequentialGroup()
                .addGroup(jPanelPropiedadesCarnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonCarnicoPollo)
                    .addComponent(jRadioButtonCarnicoCerdo)
                    .addComponent(jRadioButtonCarnicoCarne))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPropiedadesCarnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPesoKg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelPropiedadesLiquido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Propiedades líquido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12))); // NOI18N

        jRadioButtonEsLacteo.setText("Es lácteo");

        textCapacidadEnvase.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Capacidad envase", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel2.setText("ml");

        javax.swing.GroupLayout jPanelPropiedadesLiquidoLayout = new javax.swing.GroupLayout(jPanelPropiedadesLiquido);
        jPanelPropiedadesLiquido.setLayout(jPanelPropiedadesLiquidoLayout);
        jPanelPropiedadesLiquidoLayout.setHorizontalGroup(
            jPanelPropiedadesLiquidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRadioButtonEsLacteo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelPropiedadesLiquidoLayout.createSequentialGroup()
                .addComponent(textCapacidadEnvase, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelPropiedadesLiquidoLayout.setVerticalGroup(
            jPanelPropiedadesLiquidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPropiedadesLiquidoLayout.createSequentialGroup()
                .addComponent(jRadioButtonEsLacteo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPropiedadesLiquidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textCapacidadEnvase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnGuardar.setBackground(new java.awt.Color(255, 0, 0));
        btnGuardar.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        btnGuardar.setBorderPainted(false);

        jComboBoxProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12))); // NOI18N
        jComboBoxProveedor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxProveedorItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanelPropiedadesCarnico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelPropiedadesUtensilio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIdentificador)
                        .addComponent(jComboBoxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPrecio)
                        .addComponent(txtFechaCaducidad)
                        .addComponent(txtCantidad)
                        .addComponent(txtNombre)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanelPropiedadesLiquido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jComboBoxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jComboBoxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPropiedadesUtensilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPropiedadesCarnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPropiedadesLiquido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        tableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableProductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 952, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtFechaCaducidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaCaducidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaCaducidadActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtIdentificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificadorActionPerformed

    private void jComboBoxCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaItemStateChanged
        if(jComboBoxCategoria.getItemAt(jComboBoxCategoria.getSelectedIndex()).getIdCategoria() == 1){
            jPanelPropiedadesUtensilio.setVisible(true);
            jPanelPropiedadesCarnico.setVisible(false);
            jPanelPropiedadesLiquido.setVisible(false);
        }else if(jComboBoxCategoria.getItemAt(jComboBoxCategoria.getSelectedIndex()).getIdCategoria() == 2){
            jPanelPropiedadesUtensilio.setVisible(false);
            jPanelPropiedadesCarnico.setVisible(true);
            jPanelPropiedadesLiquido.setVisible(false);
        } else if(jComboBoxCategoria.getItemAt(jComboBoxCategoria.getSelectedIndex()).getIdCategoria() == 3){
            jPanelPropiedadesUtensilio.setVisible(false);
            jPanelPropiedadesCarnico.setVisible(false);
            jPanelPropiedadesLiquido.setVisible(true);
        }     
    }//GEN-LAST:event_jComboBoxCategoriaItemStateChanged

    private void jComboBoxProveedorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxProveedorItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxProveedorItemStateChanged

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
            java.util.logging.Logger.getLogger(Frm_RegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_RegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_RegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_RegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
    }
    
    private void mostrarCategorias(){
        ListarCategoria listar = new ListarCategoria();
        ArrayList<Categoria> categorias = listar.obtenerCategorias();
        jComboBoxCategoria.removeAllItems();
        
        for (int i = 0; i < categorias.size(); i++) {
            jComboBoxCategoria.addItem(new Categoria(categorias.get(i).getIdCategoria(), categorias.get(i).getNombre()));
        }
    }
    
    private void mostrarProveedores(){
        ListarProveedores listar = new ListarProveedores();
        ArrayList<Proveedor> proveedores = listar.obtenerProveedores();
        jComboBoxProveedor.removeAllItems();
        
        for (int i = 0; i < proveedores.size(); i++) {
            jComboBoxProveedor.addItem(new Proveedor( proveedores.get(i).getIdProveedor(),proveedores.get(i).getNombre()));
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnGuardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    public javax.swing.JComboBox<Categoria> jComboBoxCategoria;
    public javax.swing.JComboBox<Proveedor> jComboBoxProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanelPropiedadesCarnico;
    public javax.swing.JPanel jPanelPropiedadesLiquido;
    public javax.swing.JPanel jPanelPropiedadesUtensilio;
    public javax.swing.JRadioButton jRadioButtonCarnicoCarne;
    public javax.swing.JRadioButton jRadioButtonCarnicoCerdo;
    public javax.swing.JRadioButton jRadioButtonCarnicoPollo;
    public javax.swing.JRadioButton jRadioButtonEsImportado;
    public javax.swing.JRadioButton jRadioButtonEsLacteo;
    public javax.swing.JRadioButton jRadioButtonEsMetal;
    public javax.swing.JRadioButton jRadioButtonEsPlastico;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tableProductos;
    public javax.swing.JTextField textCapacidadEnvase;
    public javax.swing.JTextField txtCantidad;
    public javax.swing.JTextField txtFechaCaducidad;
    public javax.swing.JTextField txtIdentificador;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtPesoKg;
    public javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables


}

