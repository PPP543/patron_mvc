/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.itss.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Date;
import java.time.LocalDate;


/**
 *
 * @author ppucha
 */
public class Producto {
    
    private String nombre;
    
    private String identificador;
    
    private Integer cantidad;
    
    private Double precio;
    
    private Double precioComercializacion;
    
    private Double total;
    
    private Integer fechaCaducidad;
    
    private Date fechaRegistro;
    
    private Integer idCategoria;
 
    private Integer idProveedor;
    
    public Producto(){
    
    }

    public Producto(String nombre, String identificador, Integer cantidad, Double precio, Integer fechaCaducidad, Integer idCategoria, Integer idProveedor) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.cantidad = cantidad;
        this.precio = precio;
        this.fechaCaducidad = fechaCaducidad;
        this.idCategoria = idCategoria;
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
    public Double calcularTotal(){
        return new BigDecimal(cantidad*precio).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Integer getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Integer fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Double getPrecioComercializacion() {
        return new BigDecimal(this.precio + 0.12).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public void setPrecioComercializacion(Double precioComercializacion) {
        this.precioComercializacion = precioComercializacion;
    }

    public Date getFechaRegistro() {
        return Date.valueOf(LocalDate.now());
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    
}
