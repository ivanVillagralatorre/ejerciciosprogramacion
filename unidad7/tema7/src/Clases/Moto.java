/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author 1gdaw04
 */
public class Moto extends Vehiculo {
    private   Menum marca;
    

    public Moto() {
    }

    public void setMarca(Menum marca) {
        this.marca = marca;
    }

    
    public Menum getMarca() {
        return marca;
    }
    
    
}
