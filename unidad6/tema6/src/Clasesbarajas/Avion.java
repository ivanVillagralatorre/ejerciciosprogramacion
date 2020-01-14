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
public class Avion {

    private String areolinia;
    private String codigo_de_avion;
    private int numero_de_asientos;
    private String compartimientos;
    private ArrayList<Vuelo> lista_de_vuelos;

    public Avion() {
    }

    public Avion(String areolinia, String codigo_de_avion, int numero_de_asientos, String compartimientos, ArrayList<Vuelo> lista_de_vuelos) {
        this.areolinia = areolinia;
        this.codigo_de_avion = codigo_de_avion;
        this.numero_de_asientos = numero_de_asientos;
        this.compartimientos = compartimientos;
        this.lista_de_vuelos = lista_de_vuelos;
    }

    public String getAreolinia() {
        return areolinia;
    }

    public void setAreolinia(String areolinia) {
        this.areolinia = areolinia;
    }

    public String getCodigo_de_avion() {
        return codigo_de_avion;
    }

    public void setCodigo_de_avion(String codigo_de_avion) {
        this.codigo_de_avion = codigo_de_avion;
    }

    public int getNumero_de_asientos() {
        return numero_de_asientos;
    }

    public void setNumero_de_asientos(int numero_de_asientos) {
        this.numero_de_asientos = numero_de_asientos;
    }

    public String getCompartimientos() {
        return compartimientos;
    }

    public void setCompartimientos(String compartimientos) {
        this.compartimientos = compartimientos;
    }

    @Override
    public String toString() {
        return "Avion{" + "areolinia=" + areolinia + ", codigo_de_avion=" + codigo_de_avion + ", numero_de_asientos=" + numero_de_asientos + ", compartimientos=" + compartimientos + ", lista_de_vuelos=" + lista_de_vuelos + '}';
    }

    public void asignar_a_vuelo() {
    }

    public Avion obtener() {
        return null;
    }

    public void cancelar_vuelo() {
    }

}
