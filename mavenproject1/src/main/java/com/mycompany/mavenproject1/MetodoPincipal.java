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
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class MetodoPincipal {
    public String leerArchivo() throws FileNotFoundException, IOException{
        try{
        String cadena,resultado="";
        FileReader f;
        File archivo ;
        archivo=new File("datacredito.txt");
        f= new FileReader(archivo);
        BufferedReader b= new BufferedReader(f);
        while((cadena=b.readLine())!=null){
            resultado += cadena;
        }
        b.close();
        return resultado;
        }catch(FileNotFoundException e){
            System.out.println("errror en la lectura");
            return "";
        }catch(IOException e){
            System.out.println("errror en algo mas");
            return "";
        }
    }
    public void escrbir(Reporte re) throws IOException{
        try{
            String cadena ="";
            String resultado="";
            cadena= leerArchivo();
            cadena=cadena+re.getPersona().getNombre()+","+re.getPersona().getApellido()+","+re.getPersona().getCedula()+","+re.getPersona().getCorreo()+","+re.getTipo()+","+re.getDescripcion()+","+re.getEmpresa().getNombre()+","+re.getEmpresa().getNit()+","+re.getEmpresa().getRut()+"-";
            FileWriter f;
            File archivo ;
            archivo=new File("datacredito.txt");
            f= new FileWriter(archivo);
            BufferedWriter b= new BufferedWriter(f);
            b.write(cadena);
            b.close();
        }catch(FileNotFoundException e){
            System.out.println("errror en la lectura");
        }catch(IOException e){
            System.out.println("errror en algo mas");
        }
    }
    public Reporte crearReporte(){
        Reporte re= new Reporte(1,"adas","sadas",null,null);
        int cedula;
        int nit;
        String nombre;
        String apellido;
        String correo;
        String entradaTexto;
        System.out.println ("ingrese 'p' para un reporte positivo o 'n' para negativo");
        Scanner entradaEscaner = new Scanner (System.in);
        entradaTexto=entradaEscaner.nextLine ();
        if(entradaTexto.equals("p")){
            re.setTipo("positivo");
        }else{
            if(entradaTexto.equals("n")){
                re.setTipo("negativo");
            }else{
                System.out.println("opcion erronea");
            }
        } 
        System.out.println ("ingrese la descripcion del reporte");
        entradaTexto=entradaEscaner.nextLine ();
        re.setDescripcion(entradaTexto);
        System.out.println ("ingrese el nombre de la persona");
        entradaTexto=entradaEscaner.nextLine ();
        nombre=entradaTexto;
        System.out.println ("ingrese la cedula");
        entradaTexto=entradaEscaner.nextLine ();
        cedula= Integer.parseInt(entradaTexto);
        System.out.println ("ingrese apellido");
        entradaTexto=entradaEscaner.nextLine ();
        apellido=entradaTexto;
        System.out.println ("ingrese correo");
        entradaTexto=entradaEscaner.nextLine ();
        correo=entradaTexto;
        re.setPersona(new Persona(cedula,nombre,apellido,correo));
        System.out.println ("ingrese el nombre de la empresa");
        entradaTexto=entradaEscaner.nextLine ();
        nombre=entradaTexto;
        System.out.println ("ingrese el rut de la empresa");
        entradaTexto=entradaEscaner.nextLine ();
        cedula= Integer.parseInt(entradaTexto);
        System.out.println ("ingrese el nit de la empresa");
        entradaTexto=entradaEscaner.nextLine ();
        nit= Integer.parseInt(entradaTexto);
        re.setEmpresa(new Empresa(nombre,cedula,nit));
        return re;
    }
    public HashMap<Integer, Reporte> comvertir() throws IOException{
        String cadena;
        String cadena1;
        String[] cadena2;
        String cadena3[];
        String reportes[];
        cadena=leerArchivo(); 
        HashMap<Integer, Reporte> map = new HashMap<Integer, Reporte>();
        reportes=cadena.split("-");
        int i=0;
        int j=0;
        Integer a=0;
        for (i = 0; i < reportes.length; i++){
            cadena2=reportes[i].split(",");
            map.put(i+1,new Reporte(i+1,cadena2[4],cadena2[5],new Persona((Integer.parseInt(cadena2[2])),cadena2[0],cadena2[1],cadena2[3]),new Empresa(cadena2[6],(Integer.parseInt(cadena2[7])),(Integer.parseInt(cadena2[8])))));
        }
        return map;
    }
    public void menu() throws IOException{
        String entradaTexto;
        HashMap<Integer, Reporte> map = new HashMap<Integer, Reporte>();
        while(1==1){
            System.out.println ("Ingrese 'v' para ver los reportes 'i' ingresar reporte 'b' borrar reporte 'x'cerrar");
            Scanner entradaEscaner = new Scanner (System.in);
            entradaTexto=entradaEscaner.nextLine ();
            switch (entradaTexto) {
                case "v":
                    map=comvertir();
                    mostrar(map);
                    break;
                case "i":
                    escrbir(crearReporte());
                    break;
                case "b":
                    escrbirMap(borrarReporte(map));
                    break;
                case "x":
                    System.exit(0);
                    break;
            }
        }
    }
    public void mostrar(HashMap<Integer, Reporte> map){
        for(Reporte re:map.values()){
            re.mostrar();
        }
    }
    public void escrbirMap(HashMap<Integer, Reporte> map) throws IOException{
        try{
            String cadena ="";
            String resultado="";
            for(Reporte re:map.values()){               
            cadena=cadena+re.getPersona().getNombre()+","+re.getPersona().getApellido()+","+re.getPersona().getCedula()+","+re.getPersona().getCorreo()+","+re.getTipo()+","+re.getDescripcion()+","+re.getEmpresa().getNombre()+","+re.getEmpresa().getNit()+","+re.getEmpresa().getRut()+"-";
            }  
            FileWriter f;
            File archivo ;
            archivo=new File("datacredito.txt");
            f= new FileWriter(archivo);
            BufferedWriter b= new BufferedWriter(f);
            b.write(cadena);
            b.close();
        }catch(FileNotFoundException e){
            System.out.println("errror en la lectura");
        }catch(IOException e){
            System.out.println("errror en algo mas");
        }
    }
    public HashMap<Integer, Reporte> borrarReporte(HashMap<Integer, Reporte> map){
        String entradaTexto;
        int clave=0;
        System.out.println ("Ingrese el id del reporte que desea eliminar");
        Scanner entradaEscaner = new Scanner (System.in);
        entradaTexto=entradaEscaner.nextLine();
        clave= Integer.parseInt(entradaTexto);
        map.remove(clave);
        return map;
    }
}
