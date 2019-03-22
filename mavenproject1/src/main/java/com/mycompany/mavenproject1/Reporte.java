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
public class Reporte {
    /**
     * variable id
     */
    int id;
    /**
     * variable tipo
     */
    String tipo;
    /**
     * variable desc
     */
    String descripcion;
    /**
     * variable persona
     */
    Persona persona;  
    /**
     * variable epmpresa
     */
    Empresa empresa;
    /**
     * constructor reporte
     * @param  id id
     * @param tipo tipo
     * @param descripcion desc
     * @param persona persona
     * @param empresa empresa
     */
    public Reporte(int id, String tipo, String descripcion, Persona persona, Empresa empresa) {
        this.id = id;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.persona = persona;
        this.empresa = empresa;
    }
    
    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Persona getPersona() {
        return persona;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public void mostrar(){
        System.out.println("id");
        System.out.println(this.getId());
        System.out.println("tipo de reporte");
        System.out.println(this.getTipo());
        System.out.println("nombre de la empresa");
        System.out.println(this.getEmpresa().getNombre());
        System.out.println("nit");
        System.out.println(this.getEmpresa().getNit());
        System.out.println("rut");
        System.out.println(this.getEmpresa().getRut());
        System.out.println("nombre de la persona");
        System.out.println(this.getPersona().getNombre());
        System.out.println("apelliido");
        System.out.println(this.getPersona().getApellido());
        System.out.println("cedula");
        System.out.println(this.getPersona().getCedula());
    }
}

