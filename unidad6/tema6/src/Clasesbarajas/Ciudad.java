/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clasesbarajas;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw04
 */
public class Ciudad {

    private String codigo_ciudad;
    private String nombre;
    private ArrayList<Vuelo> lista_de_vuelos;

    public Ciudad() {
    }

    public Ciudad(String codigo_ciudad, String nombre, ArrayList<Vuelo> lista_de_vuelos) {
        this.codigo_ciudad = codigo_ciudad;
        this.nombre = nombre;
        this.lista_de_vuelos = lista_de_vuelos;
    }

    public ArrayList<Vuelo> getLista_de_vuelos() {
        return lista_de_vuelos;
    }

    public void setLista_de_vuelos(ArrayList<Vuelo> lista_de_vuelos) {
        this.lista_de_vuelos = lista_de_vuelos;
    }

    public String getCodigo_ciudad() {
        return codigo_ciudad;
    }

    public void setCodigo_ciudad(String codigo_ciudad) {
        this.codigo_ciudad = codigo_ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "codigo_ciudad=" + codigo_ciudad + ", nombre=" + nombre + ", lista_de_vuelos=" + lista_de_vuelos + '}';
    }

    public void agregar_nuevo() {
    }

    public Ciudad obtener() {
        return null;
    }

}
