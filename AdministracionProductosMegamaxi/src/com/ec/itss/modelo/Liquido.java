/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.itss.modelo;

/**
 *
 * @author ppucha
 */
public class Liquido extends Producto{
    
    private Double capacidadEnvase;
    
    private Boolean esLacteo;

    public Double getCapacidadEnvase() {
        return capacidadEnvase;
    }

    public void setCapacidadEnvase(Double capacidadEnvase) {
        this.capacidadEnvase = capacidadEnvase;
    }

    public Boolean getEsLacteo() {
        return esLacteo;
    }

    public void setEsLacteo(Boolean esLacteo) {
        this.esLacteo = esLacteo;
    }   

    public Liquido(Double capacidadEnvase, Boolean esLacteo, String nombre, String identificador, Integer cantidad, Double precio, Integer fechaCaducidad, Integer idCategoria, Integer idProveedor) {
        super(nombre, identificador, cantidad, precio, fechaCaducidad, idCategoria, idProveedor);
        this.capacidadEnvase = capacidadEnvase;
        this.esLacteo = esLacteo;
    }
}
