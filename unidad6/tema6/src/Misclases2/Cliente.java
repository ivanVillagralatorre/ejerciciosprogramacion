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
public class Cliente extends Persona {

    private String telefono_de_contacto;

    public Cliente(String telefono_de_contacto) {
        this.telefono_de_contacto = telefono_de_contacto;
    }

    public Cliente(String telefono_de_contacto, String nombre, int edad) {
        super(nombre, edad);
        this.telefono_de_contacto = telefono_de_contacto;
    }

    public String getTelefono_de_contacto() {
        return telefono_de_contacto;
    }

    public void setTelefono_de_contacto(String telefono_de_contacto) {
        this.telefono_de_contacto = telefono_de_contacto;
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
    public String Mostrar() {
        return this.getNombre() + "" + this.getEdad() + "" + this.getTelefono_de_contacto();
    }

}
