/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.weba;

/**
 *
 * @author JOSUE
 */
public class Bebida {
    private String tipo;
    private String nombre;

    public Bebida() {
    }

    @Override
    public String toString() {
        return "Bebida{" + "tipo=" + tipo + ", nombre=" + nombre + '}';
    }

    public Bebida(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
