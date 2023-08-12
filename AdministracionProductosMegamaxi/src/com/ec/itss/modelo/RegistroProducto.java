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
 * @author ppucha
 */
public class RegistroProducto {
    
    ConexionMySql connectionMySql = new ConexionMySql();
    Connection con = connectionMySql.conectar();
    
    public void registrar(Utensilio p){
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO Producto(nombre, identificador, cantidad, precio, precioComercializacion, total, fechaCaducidad, "
                    + "fechaRegistro, idCategoria, esPlastico, esMetal, esImportado) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,p.getNombre());
            ps.setString(2,p.getIdentificador());
            ps.setInt(3,p.getCantidad());
            ps.setDouble(4,p.getPrecio());
            ps.setDouble(5,p.getPrecioComercializacion());
            ps.setDouble(6,p.calcularTotal());
            ps.setDouble(7,p.getFechaCaducidad());
            ps.setDate(8,p.getFechaRegistro());
            ps.setDouble(9,p.getIdCategoria());
            ps.setBoolean(10, p.getEsPlastico());
            ps.setBoolean(11, p.getEsMetal());
            ps.setBoolean(12, p.getEsImportado());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL REGISTAR EL PRODUCTO\n"+ ex);
        }
    }
}
