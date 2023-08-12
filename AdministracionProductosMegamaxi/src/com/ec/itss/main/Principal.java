/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.itss.main;

import com.ec.itss.controlador.Frm_RegistrarProveedor_Controlador;
import com.ec.itss.modelo.ListarProveedor;
//import com.ec.itss.vista.Frm_RegistrarProducto;
import com.ec.itss.vista.Frm_RegistrarProveedor;

/**
 *
 * @author ppucha
 */
public class Principal {
    
    public static Frm_RegistrarProveedor frm_prov;
    
    public static Frm_RegistrarProveedor_Controlador c_frm_prov;
    
    public static ListarProveedor listar_proveedor;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frm_prov = new Frm_RegistrarProveedor();
        frm_prov.setVisible(true);
        frm_prov.setLocationRelativeTo(null);
        
        //c_frm_prov = new Frm_RegistrarProveedor_Controlador(frm_prov);
        
        ListarProveedor ListarProveedores = new ListarProveedor();
        ListarProveedores.mostrarTabla(frm_prov.tableProveedor);
    }
    
}
