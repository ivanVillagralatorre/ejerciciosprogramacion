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
public class Empresa {
    
   private String nombre;
   private ArrayList<Empleado> listaemple;
   private ArrayList<Cliente> listaclien;
   
   public Empresa() {
    }

    public Empresa(String nombre, ArrayList<Empleado> listaemple, ArrayList<Cliente> listaclien) {
        this.nombre = nombre;
        this.listaemple = listaemple;
        this.listaclien = listaclien;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getListaemple() {
        return listaemple;
    }

    public void setListaemple(ArrayList<Empleado> listaemple) {
        this.listaemple = listaemple;
    }

    public ArrayList<Cliente> getListaclien() {
        return listaclien;
    }

    public void setListaclien(ArrayList<Cliente> listaclien) {
        this.listaclien = listaclien;
    }

   
   
    
}
