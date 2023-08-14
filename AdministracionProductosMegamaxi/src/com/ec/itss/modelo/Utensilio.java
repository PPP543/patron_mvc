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
public class Utensilio extends Producto{
    
    private Boolean esPlastico;
    
    private Boolean esMetal;
    
    private Boolean esImportado;

    public Boolean getEsPlastico() {
        return esPlastico;
    }

    public void setEsPlastico(Boolean esPlastico) {
        this.esPlastico = esPlastico;
    }

    public Boolean getEsMetal() {
        return esMetal;
    }

    public void setEsMetal(Boolean esMetal) {
        this.esMetal = esMetal;
    }

    public Boolean getEsImportado() {
        return esImportado;
    }

    public void setEsImportado(Boolean esImportado) {
        this.esImportado = esImportado;
    }

    public Utensilio(Boolean esPlastico, Boolean esMetal, Boolean esImportado, String nombre, String identificador, Integer cantidad, Double precio, Integer fechaCaducidad, Integer idCategoria, Integer idProveedor) {
        super(nombre, identificador, cantidad, precio, fechaCaducidad, idCategoria, idProveedor);
        this.esPlastico = esPlastico;
        this.esMetal = esMetal;
        this.esImportado = esImportado;
    }
    
    
    
}
