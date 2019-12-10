/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

/**
 *
 * @author 1gdaw04
 */
public class Figura {
    
    private double circunferencia;
    private double area;
    private double volumen;
    private double radio;

    public Figura() {
    }

    public Figura(double circunferencia, double area, double volumen, double radio) {
        this.circunferencia = circunferencia;
        this.area = area;
        this.volumen = volumen;
        this.radio = radio;
    }

    public double getCircunferencia() {
        return circunferencia;
    }

    public double getArea() {
        return area;
    }

    public double getVolumen() {
        return volumen;
    }

    public double getRadio() {
        return radio;
    }

    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void calcularCircunferencia()
    {   Double Calculo= 2* Math.PI *radio;
        setCircunferencia(Calculo);
    ;}
  
    
     public void calcularArea()
    {   Double Calculo=  Math.PI *radio*radio;
        setArea(Calculo);
    ;}
     
    
     
      public void calcularVolumen()
    {   Double Calculo=  (4 * Math.PI *radio*radio)/3;
        setVolumen(Calculo);
    ;}
     
    
    
}
