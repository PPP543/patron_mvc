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
    
    public void registrarUtensilio(Utensilio utensilio){
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO Producto(nombre, identificador, cantidad, precio, precioComercializacion, total, fechaCaducidad, "
                    + "fechaRegistro, idCategoria, esPlastico, esMetal, esImportado) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,utensilio.getNombre());
            ps.setString(2,utensilio.getIdentificador());
            ps.setInt(3,utensilio.getCantidad());
            ps.setDouble(4,utensilio.getPrecio());
            ps.setDouble(5,utensilio.getPrecioComercializacion());
            ps.setDouble(6,utensilio.calcularTotal());
            ps.setDouble(7,utensilio.getFechaCaducidad());
            ps.setDate(8,utensilio.getFechaRegistro());
            ps.setDouble(9,utensilio.getIdCategoria());
            ps.setBoolean(10, utensilio.getEsPlastico());
            ps.setBoolean(11, utensilio.getEsMetal());
            ps.setBoolean(12, utensilio.getEsImportado());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL REGISTAR EL PRODUCTO\n"+ ex);
        }
    }
    
    public void registrarCarnico(Carnico carnico){
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO Producto(nombre, identificador, cantidad, precio, precioComercializacion, total, fechaCaducidad, "
                    + "fechaRegistro, idCategoria, tipoCarnico, peso) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,carnico.getNombre());
            ps.setString(2,carnico.getIdentificador());
            ps.setInt(3,carnico.getCantidad());
            ps.setDouble(4,carnico.getPrecio());
            ps.setDouble(5,carnico.getPrecioComercializacion());
            ps.setDouble(6,carnico.calcularTotal());
            ps.setDouble(7,carnico.getFechaCaducidad());
            ps.setDate(8,carnico.getFechaRegistro());
            ps.setDouble(9,carnico.getIdCategoria());
            ps.setString(10, carnico.getTipoCarnico());
            ps.setDouble(11, carnico.getPeso());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL REGISTAR EL PRODUCTO\n"+ ex);
        }
    }
}
