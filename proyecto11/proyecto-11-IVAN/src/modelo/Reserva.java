/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;



/**
 *
 * @author iv
 */
public class Reserva {
    private String codres;
    private LocalDate f_entrada;
    private LocalDate f_salida;
    private ArrayList<Habitacion> h;
    private Cliente c;

    public Reserva() {
    }

    public Reserva(String codres, LocalDate f_entrada, LocalDate f_salida, ArrayList<Habitacion> h, Cliente c) {
        this.codres = codres;
        this.f_entrada = f_entrada;
        this.f_salida = f_salida;
        this.h = h;
        this.c = c;
    }

    public String getCodres() {
        return codres;
    }

    public void setCodres(String codres) {
        this.codres = codres;
    }

    public LocalDate getF_entrada() {
        return f_entrada;
    }

    public void setF_entrada(LocalDate f_entrada) {
        this.f_entrada = f_entrada;
    }

    public LocalDate getF_salida() {
        return f_salida;
    }

    public void setF_salida(LocalDate f_salida) {
        this.f_salida = f_salida;
    }

    public ArrayList<Habitacion> getH() {
        return h;
    }

    public void setH(ArrayList<Habitacion> h) {
        this.h = h;
    }

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }
    
    
    
}



