/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author daniel
 */
public class Empresa {
    String nombre;
    int nit;
    int rut;

    public Empresa(String nombre, int nit, int rut) {
        this.nombre = nombre;
        this.nit = nit;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNit() {
        return nit;
    }

    public int getRut() {
        return rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }
}

