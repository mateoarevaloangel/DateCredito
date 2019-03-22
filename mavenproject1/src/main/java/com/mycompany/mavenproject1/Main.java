/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.IOException;

/**
 *
 * @author daniel
 */
public class Main {
    //static Reporte re= new Reporte();
    static MetodoPincipal me= new MetodoPincipal();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //me.escrbir(me.crearReporte());
        //me.leerArchivo();
        me.menu();
        
    }
}
