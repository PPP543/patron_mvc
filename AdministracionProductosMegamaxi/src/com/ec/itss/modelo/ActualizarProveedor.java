/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.itss.modelo;

import com.ec.itss.conexion.ConexionMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author PAUL CROSSOVER
 */
public class ActualizarProveedor {
    ConexionMySql connectionMySql = new ConexionMySql();
    Connection con = connectionMySql.conectar();
    public void actualizar(Proveedor r){
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE proveedor SET nombre=?, ruc=?, cantidadEntregaAlMes=?, tipo_proveedor=? WHERE idProveedor=?");
            ps.setString(1,r.getNombre());
            ps.setString(2, r.getRuc());
            ps.setInt(3,r.getCantidadEntregaAlMes());
            ps.setString(4, r.getTipo_proveedor());
            ps.setInt(5, r.getIdProveedor());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "PROVEEDOR ACTUALIZADO\n");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR EL PROVEEDOR\n"+ ex);
        }
    } 
}
