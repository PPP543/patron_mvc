/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.itss.modelo;

import com.ec.itss.conexion.ConexionMySql;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ppucha
 */
public class ListarProveedores {
    ConexionMySql conMySql = new ConexionMySql();
    Connection connection = conMySql.conectar();
    
    public void mostrarTabla(JTable tabla){
        DefaultTableModel modelo = new DefaultTableModel();
        //modelo.addColumn("idProveedor");
        modelo.addColumn("Ruc Proveedor");
        modelo.addColumn("Nombre Proveedor");
        modelo.addColumn("Cantidad Entregas Mes");
        modelo.addColumn("Tipo Proveedor");

        String query = "SELECT * FROM Proveedor";
        Statement st;
         try {
            st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                Object [] lista = {rs.getInt(1), rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5)};
                modelo.addRow(lista);
            }
            tabla.setModel(modelo);
        } catch (SQLException e) {
            System.out.print("Error al listar los datos de la tabla producto\n" + e);
        }
        
        
    }
    
    public ArrayList<Proveedor> obtenerProveedores(){
        ArrayList<Proveedor> proveedorList = new ArrayList<>();
        
        try {
            Statement st;
            String query = "SELECT idProveedor, nombre FROM Proveedor ORDER  BY NOMBRE ASC";
            st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                Proveedor proveedor =new Proveedor();
                proveedor.setIdProveedor(rs.getInt("idProveedor"));
                proveedor.setNombre(rs.getString("nombre"));
                
                proveedorList.add(proveedor);
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar proveedores\n" +e);
        }
        return proveedorList;
    }
}
