
package Modelo;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String correo;
    private String telefono;
    
    private ArrayList<Reserva> listaReservas;

    public Cliente(String nombre, String correo, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        listaReservas = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setReserva(Reserva r) {
        this.listaReservas.add(r);
    }
    
    
    
}
