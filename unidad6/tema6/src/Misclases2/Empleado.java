/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misclases2;

/**
 *
 * @author 1gdaw04
 */
public class Empleado extends Persona {

    private int sueldo_bruto;
    private Directivo d;
    private Empresa e;

    public Empleado() {
    }

    public Empleado(int sueldo_bruto, Directivo d, Empresa e) {
        this.sueldo_bruto = sueldo_bruto;
        this.d = d;
        this.e = e;
    }

    public Empresa getE() {
        return e;
    }

    public void setE(Empresa e) {
        this.e = e;
    }

    public Empleado(int sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }

    public Empleado(int sueldo_bruto, Directivo d) {
        this.sueldo_bruto = sueldo_bruto;
        this.d = d;
    }

    public Directivo getD() {
        return d;
    }

    public void setD(Directivo d) {
        this.d = d;
    }

    public Empleado(int sueldo_bruto, String nombre, int edad) {
        super(nombre, edad);
        this.sueldo_bruto = sueldo_bruto;
    }

    public int getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(int sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
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
        return this.getNombre() + "" + this.getSueldo_bruto();
    }

    public void Calcular_salario_neto() {
    }

}
