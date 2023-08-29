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
public class GestionProducto {
    
    ConexionMySql connectionMySql = new ConexionMySql();
    Connection con = connectionMySql.conectar();
    
    public void eliminarProductoPorId(int idProducto){
    
        try {
            PreparedStatement borrar= con.prepareStatement("DELETE FROM producto WHERE idProducto=?");
            borrar.setInt(1, idProducto);

            borrar.executeUpdate();
            
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "NO SE PUEDO ELIMINAR EL REGISTRO" +e);
        }
    
    }
    
}
