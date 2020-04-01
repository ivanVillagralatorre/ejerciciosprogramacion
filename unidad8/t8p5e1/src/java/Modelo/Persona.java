
package Modelo;

import java.util.ArrayList;

public class Persona {
    
    private String dni;
    private String nombre;
    private ArrayList<Usuario> lista;

    public Persona(String dni, String nombre,ArrayList<Usuario> lista) {
        this.dni = dni;
        this.nombre = nombre;
        this.lista=lista;
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

    public ArrayList<Usuario> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Usuario> lista) {
        this.lista = lista;
    }
}
