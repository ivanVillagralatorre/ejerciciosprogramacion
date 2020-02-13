/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ2.clases;

/**
 *
 * @author 1gdaw04
 */
public class Persona {

    private String dni;
    private String nombre;
    private String apellidos;

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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }

}
