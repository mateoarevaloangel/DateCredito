/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author daniel
 * @author MateoG
 * @version 1.0
 */
public class Empresa {
    /**
     * Variable para nombre
     */   
    String nombre;
    /**
     * Variable para nit
     */ 
    int nit;
    /**
     * Variable para rut
     */ 
    int rut;
    
    /**
     * Constructor con nombre nit y rut
     * @param nombre guarda nombre
     * @param nit guarda nit
     * @param rut guarda rut
     */   
    
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

