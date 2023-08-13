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
public class Carnico extends Producto {
    
    private String tipoCarnico;
    
    private Double peso;

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getTipoCarnico() {
        return tipoCarnico;
    }

    public void setTipoCarnico(String tipoCarnico) {
        this.tipoCarnico = tipoCarnico;
    }

    public Carnico(String tipoCarnico, Double peso, String nombre, String identificador, Integer cantidad, Double precio, Integer fechaCaducidad, Integer idCategoria) {
        super(nombre, identificador, cantidad, precio, fechaCaducidad, idCategoria);
        this.tipoCarnico = tipoCarnico;
        this.peso = peso;
    }
 
}
