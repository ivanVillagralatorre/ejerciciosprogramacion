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
public class Piloto {

    private String cod_piloto;
    private String nombre;
    private String apellido;
    private String numero_licencia;
    private ArrayList<Vuelo> lista_de_vuelo;

    public Piloto() {
    }

    public Piloto(String cod_piloto, String nombre, String apellido, String numero_licencia, ArrayList<Vuelo> lista_de_vuelo) {
        this.cod_piloto = cod_piloto;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero_licencia = numero_licencia;
        this.lista_de_vuelo = lista_de_vuelo;
    }

    public ArrayList<Vuelo> getLista_de_vuelo() {
        return lista_de_vuelo;
    }

    public void setLista_de_vuelo(ArrayList<Vuelo> lista_de_vuelo) {
        this.lista_de_vuelo = lista_de_vuelo;
    }

    public String getCod_piloto() {
        return cod_piloto;
    }

    public void setCod_piloto(String cod_piloto) {
        this.cod_piloto = cod_piloto;
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

    public String getNumero_licencia() {
        return numero_licencia;
    }

    public void setNumero_licencia(String numero_licencia) {
        this.numero_licencia = numero_licencia;
    }

    @Override
    public String toString() {
        return "Piloto{" + "cod_piloto=" + cod_piloto + ", nombre=" + nombre + ", apellido=" + apellido + ", numero_licencia=" + numero_licencia + ", lista_de_vuelo=" + lista_de_vuelo + '}';
    }

    public void agregar_nuevo() {
    }

    public void asignar_vuelo() {
    }

    public void cancelar_vuelo() {
    }

    public Piloto buscar() {
        return null;
    }

    public void modificar() {
    }

}
