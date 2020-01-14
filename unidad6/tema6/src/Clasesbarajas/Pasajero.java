/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clasesbarajas;

/**
 *
 * @author 1gdaw04
 */
public class Pasajero {

    private String Cedula;
    private String nombre;
    private String apellido;
    private String sexo;
    private int edad;
    private Asiento a;
    private Vuelo vn;

    public Pasajero() {
    }

    public Pasajero(String Cedula, String nombre, String apellido, String sexo, int edad, Asiento a, Vuelo vn) {
        this.Cedula = Cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.a = a;
        this.vn = vn;
    }

    public Vuelo getVn() {
        return vn;
    }

    public void setVn(Vuelo vn) {
        this.vn = vn;
    }

    public Asiento getA() {
        return a;
    }

    public void setA(Asiento a) {
        this.a = a;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "Cedula=" + Cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", edad=" + edad + ", a=" + a + ", vn=" + vn + '}';
    }

    public void agregar_nuevo() {
    }

    public void modificar() {
    }

    public void asignar_vuelo() {
    }

    public Pasajero buscar() {
        return null;
    }

}
