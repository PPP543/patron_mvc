/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.itss.controlador;

import com.ec.itss.modelo.ListarProveedores;
import com.ec.itss.modelo.Proveedor;
import com.ec.itss.modelo.RegistrarProveedor;
import com.ec.itss.vista.Frm_RegistrarProveedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author PAUL CROSSOVER
 */
public class Frm_RegistrarProveedor_Controlador implements ActionListener{
    
    Frm_RegistrarProveedor frm_prov; 

    public Frm_RegistrarProveedor_Controlador(Frm_RegistrarProveedor frm_prov){
        this.frm_prov = frm_prov;
        this.frm_prov.btnGuardarProv.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == frm_prov.btnGuardarProv){
            
            // traer los valores de la caja de texto
            String nombre = frm_prov.txtNomProv.getText();
            String ruc = frm_prov.txtRuc.getText();
            Integer cantidadEntregaAlMes = Integer.parseInt(frm_prov.txtEntregas.getText());
            String tipo_proveedor=frm_prov.txtTprov.getText();
            Proveedor proveedor = new Proveedor(nombre, ruc, cantidadEntregaAlMes, tipo_proveedor);
            
            RegistrarProveedor registro = new RegistrarProveedor();
            
            registro.registrar(proveedor);
            
            
            ListarProveedores lprov = new ListarProveedores();
            lprov.mostrarTabla(frm_prov.tableProveedor);
            limpiarEntradas();
        }
    }

    private void limpiarEntradas() {
        frm_prov.txtNomProv.setText("");
        frm_prov.txtEntregas.setText("");
        frm_prov.txtRuc.setText("");
        frm_prov.txtTprov.setText("");
    }
    
}
