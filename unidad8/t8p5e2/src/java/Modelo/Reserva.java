
package Modelo;

import java.time.LocalDate;

public class Reserva {
    private LocalDate fecha;
    private String franjaHoraria;  
    private int comensales;
    private String color; 
    private String demandas;
    private Cliente c;

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }

    public Reserva(LocalDate fecha, String franjaHoraria, int comensales, String color, String demandas) {
        this.fecha = fecha;
        this.franjaHoraria = franjaHoraria;
        this.comensales = comensales;
        this.color = color;
        this.demandas = demandas;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getFranjaHoraria() {
        return franjaHoraria;
    }

    public void setFranjaHoraria(String franjaHoraria) {
        this.franjaHoraria = franjaHoraria;
    }

    public int getComensales() {
        return comensales;
    }

    public void setComensales(int comensales) {
        this.comensales = comensales;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDemandas() {
        return demandas;
    }

    public void setDemandas(String demandas) {
        this.demandas = demandas;
    }
    
    
    
    
}
