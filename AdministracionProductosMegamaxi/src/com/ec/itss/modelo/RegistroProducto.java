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
    PreparedStatement ps;
    public static final String QUERY = "INSERT INTO Producto(nombre, identificador, cantidad, precio, "
            + "precioComercializacion, total, fechaCaducidad, fechaRegistro, idCategoria, idProveedor,";
    
    public void registrarUtensilio(Utensilio utensilio){
        try {
            ps = con.prepareStatement(QUERY + "esPlastico, esMetal, esImportado) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,utensilio.getNombre());
            ps.setString(2,utensilio.getIdentificador());
            ps.setInt(3,utensilio.getCantidad());
            ps.setDouble(4,utensilio.getPrecio());
            ps.setDouble(5,utensilio.getPrecioComercializacion());
            ps.setDouble(6,utensilio.calcularTotal());
            ps.setDouble(7,utensilio.getFechaCaducidad());
            ps.setDate(8,utensilio.getFechaRegistro());
            ps.setInt(9,utensilio.getIdCategoria());
            ps.setInt(10,utensilio.getIdProveedor());
            ps.setBoolean(11, utensilio.getEsPlastico());
            ps.setBoolean(12, utensilio.getEsMetal());
            ps.setBoolean(13, utensilio.getEsImportado());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL REGISTRAR UTENSILIO\n"+ ex);
        }
    }
    
    public void registrarCarnico(Carnico carnico){
        try {
            ps = con.prepareStatement(QUERY + "tipoCarnico, peso) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,carnico.getNombre());
            ps.setString(2,carnico.getIdentificador());
            ps.setInt(3,carnico.getCantidad());
            ps.setDouble(4,carnico.getPrecio());
            ps.setDouble(5,carnico.getPrecioComercializacion());
            ps.setDouble(6,carnico.calcularTotal());
            ps.setDouble(7,carnico.getFechaCaducidad());
            ps.setDate(8,carnico.getFechaRegistro());
            ps.setInt(9,carnico.getIdCategoria());
            ps.setInt(10,carnico.getIdProveedor());
            ps.setString(11, carnico.getTipoCarnico());
            ps.setDouble(12, carnico.getPeso());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL REGISTRAR CARNICO\n"+ ex);
        }
    }
    
    public void registrarLiquido(Liquido liquido){
        try {
            ps = con.prepareStatement(QUERY + "capacidadEnvase, esLacteo) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,liquido.getNombre());
            ps.setString(2,liquido.getIdentificador());
            ps.setInt(3,liquido.getCantidad());
            ps.setDouble(4,liquido.getPrecio());
            ps.setDouble(5,liquido.getPrecioComercializacion());
            ps.setDouble(6,liquido.calcularTotal());
            ps.setDouble(7,liquido.getFechaCaducidad());
            ps.setDate(8,liquido.getFechaRegistro());
            ps.setInt(9,liquido.getIdCategoria());
            ps.setInt(10,liquido.getIdProveedor());
            ps.setDouble(11, liquido.getCapacidadEnvase());
            ps.setBoolean(12, liquido.getEsLacteo());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL REGISTRAR LIQUIDO\n"+ ex);
        }
    }
}
