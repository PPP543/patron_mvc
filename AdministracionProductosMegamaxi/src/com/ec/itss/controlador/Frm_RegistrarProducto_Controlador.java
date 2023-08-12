/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.itss.controlador;

import com.ec.itss.modelo.ListarProducto;
import com.ec.itss.modelo.Producto;
import com.ec.itss.modelo.RegistroProducto;
import com.ec.itss.modelo.Utensilio;
import com.ec.itss.vista.Frm_RegistrarProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ppucha
 */
public class Frm_RegistrarProducto_Controlador implements ActionListener{
 
    Frm_RegistrarProducto frm_rp; 

    public Frm_RegistrarProducto_Controlador(Frm_RegistrarProducto frm_rp) {
        this.frm_rp = frm_rp;
        this.frm_rp.btnGuardar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == frm_rp.btnGuardar){
            
            // traer los valores de la caja de texto
            String nombre = frm_rp.txtNombre.getText();
            String identificador = frm_rp.txtIdentificador.getText();
            Integer cantidad = Integer.parseInt(frm_rp.txtCantidad.getText());
            Double precio = Double.parseDouble(frm_rp.txtPrecio.getText());
            Integer fechaCaducidad = frm_rp.txtFechaCaducidad.getText() == null ? Integer.parseInt(frm_rp.txtFechaCaducidad.getText()) : 0;
            Integer idCategoria = frm_rp.jComboBoxCategoria.getItemAt(frm_rp.jComboBoxCategoria.getSelectedIndex()).getIdCategoria();
            
            // Si selecciono Utensilio en el combo se me va a guardar un producto Utensilio
            if(idCategoria == 1){
                if(frm_rp.jRadioButtonEsPlastico.isSelected()){
                    System.out.println("plastico is clic controller");
                }
                Boolean esPlastico = frm_rp.jRadioButtonEsPlastico.isSelected() ? Boolean.TRUE : Boolean.FALSE;
                Boolean esMetal = frm_rp.jRadioButtonEsMetal.isSelected()  ? Boolean.TRUE : Boolean.FALSE;
                Boolean esImportado = frm_rp.jRadioButtonEsImportado.isSelected()  ? Boolean.TRUE : Boolean.FALSE;
                Utensilio utensilio = new Utensilio(esPlastico,esMetal,esImportado,nombre,identificador,cantidad,precio,fechaCaducidad,idCategoria);
                RegistroProducto registro = new RegistroProducto();
                registro.registrar(utensilio);
            }
            
            
            
            
            
            ListarProducto lp = new ListarProducto();
            lp.mostrarTabla(frm_rp.tableProductos);
            limpiarEntradas();
        }
    }

    private void limpiarEntradas() {
        frm_rp.txtNombre.setText("");
        frm_rp.txtIdentificador.setText("");
        frm_rp.txtCantidad.setText("");
        frm_rp.txtPrecio.setText("");
        frm_rp.txtFechaCaducidad.setText("");  
    }
}
