/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw04
 */
public class Persona {
    //Atributos

    private String nombre;
    private int edad;
    private String dni;
    private String apellidos;
    
    //relacion con carnidalidad 1 a 1 
    //private Coche c;//

    
     //relacion con carnidalidad 1 a m
    
    private ArrayList<Coche> lista;

    
    
    public ArrayList<Coche> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Coche> lista ) {
        this.lista = lista;
    }
    
    
    public void setUnCoche(Coche c)
    {   
        lista.add(c);
    }
    
    
    
    
    
    //constructor
    public Persona() {
    }

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    //getter
    public String getNombre() {
        return nombre;
    }

    //public Coche getC() {
       // return c;
    //}

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public String getApellidos() {
        return apellidos;
    }
    
    //setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
   //* public void setC(Coche c) {
     //   this.c = c;}

    //metodos
    


}
