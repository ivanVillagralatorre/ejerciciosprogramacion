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
public class Habitacion {
    
    private int codhab;
    private Enumtipo tipo;
    private String capacidad;

    public Habitacion() {
    }

    public Habitacion(int codhab, Enumtipo tipo, String capacidad) {
        this.codhab = codhab;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public int getCodhab() {
        return codhab;
    }

    public void setCodhab(int codhab) {
        this.codhab = codhab;
    }

    public Enumtipo getTipo() {
        return tipo;
    }

    public void setTipo(Enumtipo tipo) {
        this.tipo = tipo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "codhab=" + codhab + ", tipo=" + tipo + ", capacidad=" + capacidad + '}';
    }
    
    
    
    
    
}
