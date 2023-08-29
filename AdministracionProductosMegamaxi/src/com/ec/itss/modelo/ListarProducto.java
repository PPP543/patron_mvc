/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.itss.modelo;

import com.ec.itss.conexion.ConexionMySql;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ppucha
 */
public class ListarProducto {
    ConexionMySql conMySql = new ConexionMySql();
    Connection connection = conMySql.conectar();
    
    public void mostrarTabla(JTable tabla){
        DefaultTableModel modelo = new DefaultTableModel();
        // no se necesita agregar la columna idProducto
        //modelo.addColumn("Id");
        modelo.addColumn("Tipo Producto");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad existencia");
        modelo.addColumn("Precio comercialización");
        
        String query = "SELECT p.idProducto, c.nombre, p.precio, p.cantidad, p.precioComercializacion "
                + "FROM producto p, categoria c "
                + "WHERE p.idCategoria = c.idCategoria";
        Statement st;
         try {
            st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                Object [] lista = {rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4), rs.getDouble(5)};
                modelo.addRow(lista);
            }
            tabla.setModel(modelo);
        } catch (SQLException e) {
            System.out.print("Error al listar los datos de la tabla producto\n" + e);
        }
        
        
    }
}
