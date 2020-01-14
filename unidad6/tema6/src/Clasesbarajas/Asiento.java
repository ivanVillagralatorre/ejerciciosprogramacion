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
public class Asiento {

    private int numero_asiento;
    private boolean estado;
    private String comportamiento;
    private Pasajero p;
    private Vuelo v;

    public Asiento() {
    }

    public Vuelo getV() {
        return v;
    }

    public void setV(Vuelo v) {
        this.v = v;
    }

    public Asiento(int numero_asiento, boolean estado, String comportamiento, Pasajero p, Vuelo v) {
        this.numero_asiento = numero_asiento;
        this.estado = estado;
        this.comportamiento = comportamiento;
        this.p = p;
        this.v = v;
    }

    public Pasajero getP() {
        return p;
    }

    public void setP(Pasajero p) {
        this.p = p;
    }

    public int getNumero_asiento() {
        return numero_asiento;
    }

    public void setNumero_asiento(int numero_asiento) {
        this.numero_asiento = numero_asiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }

    @Override
    public String toString() {
        return "Asiento{" + "numero_asiento=" + numero_asiento + ", estado=" + estado + ", comportamiento=" + comportamiento + ", p=" + p + ", v=" + v + '}';
    }

    public void reservar() {
    }

    public void comprar() {
    }

    public boolean mostrar_diponibilidad() {
        return true;
    }

    public void desbloquear() {
    }
}
