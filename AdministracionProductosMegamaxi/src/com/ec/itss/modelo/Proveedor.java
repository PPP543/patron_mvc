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
    
    private String nombre;
    
    //private String ruc;
    
    private Integer cantidadEntregaAlMes;

    //private String tipo_prov;
    
    public Proveedor(){
    }

    public Proveedor(String nombre, Integer cantidadEntregaAlMes) {
        this.nombre = nombre;
        this.cantidadEntregaAlMes = cantidadEntregaAlMes;
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
    //to String
}
