/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clasesbarajas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 1gdaw04
 */
public class Vuelo {

    private int numero_de_vuelo;
    private String hora_de_salida;
    private String hora_de_llegada;
    private String lugar_de_origen;
    private String lugar_de_destino;
    private Date fecha_de_salida;
    private Date fecha_de_regreso;
    private String Tipo_de_vuelo;
    private ArrayList<Asiento> lista_asientos;
    private ArrayList<Pasajero> lista_pasajeros;
    private Ciudad c;
    private Avion a;
    private Piloto p;

    public Vuelo() {
    }

    public Vuelo(int numero_de_vuelo, String hora_de_salida, String hora_de_llegada, String lugar_de_origen, String lugar_de_destino, Date fecha_de_salida, Date fecha_de_regreso, String Tipo_de_vuelo, ArrayList<Asiento> lista_asientos, ArrayList<Pasajero> lista_pasajeros, Ciudad c, Avion a, Piloto p) {
        this.numero_de_vuelo = numero_de_vuelo;
        this.hora_de_salida = hora_de_salida;
        this.hora_de_llegada = hora_de_llegada;
        this.lugar_de_origen = lugar_de_origen;
        this.lugar_de_destino = lugar_de_destino;
        this.fecha_de_salida = fecha_de_salida;
        this.fecha_de_regreso = fecha_de_regreso;
        this.Tipo_de_vuelo = Tipo_de_vuelo;
        this.lista_asientos = lista_asientos;
        this.lista_pasajeros = lista_pasajeros;
        this.c = c;
        this.a = a;
        this.p = p;
    }

    public Avion getA() {
        return a;
    }

    public void setA(Avion a) {
        this.a = a;
    }

    public Ciudad getC() {
        return c;
    }

    public void setC(Ciudad c) {
        this.c = c;
    }

    public ArrayList<Pasajero> getLista_pasajeros() {
        return lista_pasajeros;
    }

    public void setLista_pasajeros(ArrayList<Pasajero> lista_pasajeros) {
        this.lista_pasajeros = lista_pasajeros;
    }

    public ArrayList<Asiento> getLista_asientos() {
        return lista_asientos;
    }

    public void setLista_asientos(ArrayList<Asiento> lista_asientos) {
        this.lista_asientos = lista_asientos;
    }

    public int getNumero_de_vuelo() {
        return numero_de_vuelo;
    }

    public void setNumero_de_vuelo(int numero_de_vuelo) {
        this.numero_de_vuelo = numero_de_vuelo;
    }

    public String getHora_de_salida() {
        return hora_de_salida;
    }

    public void setHora_de_salida(String hora_de_salida) {
        this.hora_de_salida = hora_de_salida;
    }

    public String getHora_de_llegada() {
        return hora_de_llegada;
    }

    public void setHora_de_llegada(String hora_de_llegada) {
        this.hora_de_llegada = hora_de_llegada;
    }

    public String getLugar_de_origen() {
        return lugar_de_origen;
    }

    public void setLugar_de_origen(String lugar_de_origen) {
        this.lugar_de_origen = lugar_de_origen;
    }

    public String getLugar_de_destino() {
        return lugar_de_destino;
    }

    public void setLugar_de_destino(String lugar_de_destino) {
        this.lugar_de_destino = lugar_de_destino;
    }

    public Date getFecha_de_salida() {
        return fecha_de_salida;
    }

    public void setFecha_de_salida(Date fecha_de_salida) {
        this.fecha_de_salida = fecha_de_salida;
    }

    public Date getFecha_de_regreso() {
        return fecha_de_regreso;
    }

    public void setFecha_de_regreso(Date fecha_de_regreso) {
        this.fecha_de_regreso = fecha_de_regreso;
    }

    public String getTipo_de_vuelo() {
        return Tipo_de_vuelo;
    }

    public void setTipo_de_vuelo(String Tipo_de_vuelo) {
        this.Tipo_de_vuelo = Tipo_de_vuelo;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "numero_de_vuelo=" + numero_de_vuelo + ", hora_de_salida=" + hora_de_salida + ", hora_de_llegada=" + hora_de_llegada + ", lugar_de_origen=" + lugar_de_origen + ", lugar_de_destino=" + lugar_de_destino + ", fecha_de_salida=" + fecha_de_salida + ", fecha_de_regreso=" + fecha_de_regreso + ", Tipo_de_vuelo=" + Tipo_de_vuelo + ", lista_asientos=" + lista_asientos + ", lista_pasajeros=" + lista_pasajeros + ", c=" + c + ", a=" + a + ", p=" + p + '}';
    }

    public void Reservar() {
    }

    public void Modificar() {
    }

    public void Eliminiar() {
    }

    public Vuelo Buscar() {
        return null;
    }

    public void setFecha_de_salida(LocalDate date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setFecha_de_regreso(LocalDate date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
