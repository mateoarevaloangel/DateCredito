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
public class Persona {
    /**
     * variable cedula
     */
    int cedula;
    /**
     * variable nombre
     */
    String nombre;
    /**
     * variable apellido
     */
    String apellido;
    /**
     * variable correo
     */
    String correo;
/**
     * constructor de persona
     * @param cedula cedula
     * @param nombre nombre
     * @param apellido apellido
     * @param correo correo
     */
    public Persona(int cedula, String nombre, String apellido, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }
    
    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
