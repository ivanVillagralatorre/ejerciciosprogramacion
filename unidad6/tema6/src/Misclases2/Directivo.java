/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misclases2;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw04
 */
public class Directivo extends Empleado {
    
    private String categoria;
    
    private ArrayList<Empleado> listasub;

    public Directivo(String categoria, ArrayList<Empleado> listasub, int sueldo_bruto, String nombre, int edad) {
        super(sueldo_bruto, nombre, edad);
        this.categoria = categoria;
        this.listasub = listasub;
    }



    

  
    
    
    
    
    public Directivo(int sueldo_bruto, String nombre, int edad) {
        super(sueldo_bruto, nombre, edad);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Empleado> getListasub() {
        return listasub;
    }

   

    public void setListasub(ArrayList<Empleado> listasub) {
        this.listasub = listasub;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    @Override
    public String Mostrar()
    {return "Con nombre:  "+this.getNombre()+"   posicion:  "+this.getCategoria()+"   edad:   "+this.getEdad();}
   
    
    
   

   
    
    
    

    

  
    
  
    
    
    
    
}
