/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw04
 */
public class Persona {
    private String dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private ArrayList<Vehiculo> lista;

   

    public Persona() {
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
     public ArrayList<Vehiculo> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Vehiculo> lista) {
        this.lista = lista;
    }

  public void setpersonalista(ArrayList<Vehiculo> lista,Vehiculo v){
  
      this.lista.add(v);
  
  }

   public int getNmotos(Vehiculo V)
   { int contador = 0;
   contador = lista.stream().filter((v) -> (v instanceof Moto)).map((_item) -> 1).reduce(contador, Integer::sum);
    
    return contador;
   
   }
  
  
  @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", telefono=" + telefono + ", lista=" + lista + '}';
    }
          
    
    
    
}
