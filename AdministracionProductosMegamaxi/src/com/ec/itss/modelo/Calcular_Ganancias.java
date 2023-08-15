
package com.ec.itss.modelo;

import com.ec.itss.conexion.ConexionMySql;
import java.sql.*;

/**
 *
 * @author PAUL CROSSOVER
 */
public class Calcular_Ganancias {

    ConexionMySql conMySql = new ConexionMySql();
    Connection connection = conMySql.conectar();

    public String CalcularG() {

        String consulta = "SELECT SUM(total) FROM producto";

        Statement st;
        try {
            st = connection.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            rs.next();
            //rs.setResultado.setText(rs.getString(1));
            String rest = rs.getString(1);

            System.out.println("Conexion exitosa");
            return "$ " + rest;

        } catch (SQLException e) {
            System.out.print("Error al realizar la consulta" + e);
            return "Hola";
        }

    }

}
