
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
public class RegistrarProveedor {
    
    ConexionMySql connectionMySql = new ConexionMySql();
    Connection con = connectionMySql.conectar();
    public void registrar(Proveedor r){
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO proveedor(nombre, ruc, cantidadEntregaAlMes, tipo_proveedor) VALUES (?,?,?,?)");
            ps.setString(1,r.getNombre());
            ps.setString(2, r.getRuc());
            ps.setInt(3,r.getCantidadEntregaAlMes());
            ps.setString(4, r.getTipo_proveedor());
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL REGISTAR PROVEEDOR\n"+ ex);
        }
    } 
}
