/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.itss.modelo;

/**
 *
 * @author PAUL CROSSOVER
 */

import com.ec.itss.conexion.ConexionMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EliminarProveedor {
    ConexionMySql connectionMySql = new ConexionMySql();
    Connection con = connectionMySql.conectar();
    public void borrarProveedor(int idProveedor){
        try {
            PreparedStatement borrar= con.prepareStatement("DELETE FROM proveedor WHERE idProveedor=?");
            borrar.setInt(1,idProveedor);

            borrar.executeUpdate();
            
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "NO SE PUEDO ELIMINAR EL REGISTRO" +e);
        }
    }
    
}
