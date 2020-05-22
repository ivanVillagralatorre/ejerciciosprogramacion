/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author iv
 */
public class Cliente {
    private int codclie;
    private String dni;
     private String nombre;

    public Cliente() {
    }

    public Cliente(int codclie, String dni, String nombre) {
        this.codclie = codclie;
        this.dni = dni;
        this.nombre = nombre;
    }

    public int getcodclie() {
        return codclie;
    }

    public void setcodclie(int codclie) {
        this.codclie = codclie;
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

}