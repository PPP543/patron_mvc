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
public class Proveedor {
    
    private Integer idProveedor;
    
    private String nombre;
    
    private String ruc;
       
    private Integer cantidadEntregaAlMes;
    
    private String tipo_proveedor;
    
    public Proveedor(){
    }

    public Proveedor(String nombre, String ruc, Integer cantidadEntregaAlMes, String tipo_proveedor ) {
        this.nombre = nombre;
        this.ruc=ruc;
        this.tipo_proveedor=tipo_proveedor;
        this.cantidadEntregaAlMes = cantidadEntregaAlMes;
        
    }

    public Proveedor(Integer idProveedor, String nombre) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    public Integer getCantidadEntregaAlMes() {
        return cantidadEntregaAlMes;
    }

    public void setCantidadEntregaAlMes(Integer cantidadEntregaAlMes) {
        this.cantidadEntregaAlMes = cantidadEntregaAlMes;
    }
    
    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTipo_proveedor() {
        return tipo_proveedor;
    }

    public void setTipo_proveedor(String tipo_proveedor) {
        this.tipo_proveedor = tipo_proveedor;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
    
}
    

