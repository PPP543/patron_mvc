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

/**
 *
 * @author PAUL CROSSOVER
 */
public class CalcularPesoCarne {
    
    ConexionMySql conMySql = new ConexionMySql();
    Connection connection = conMySql.conectar();

    public String CalcularG() {

        String consultap = "SELECT SUM(peso) FROM producto WHERE idCategoria BETWEEN 1 AND 2; ";

        Statement st;
        try {
            st = connection.createStatement();
            ResultSet rs = st.executeQuery(consultap);
            rs.next();
            //rs.setResultado.setText(rs.getString(1));
            String rest = rs.getString(1);

            System.out.println("Conexion exitosa");
            return rest;

        } catch (SQLException e) {
            System.out.print("Error al realizar la consulta" + e);
            return "Hola";
        }

    }
    
}
