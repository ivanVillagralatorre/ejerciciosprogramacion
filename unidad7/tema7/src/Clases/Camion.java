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
public class Camion extends Vehiculo {
    private Camenum marca;

    public Camion() {
    }
    
    

    public Camion(Camenum marca) {
        this.marca = marca;
    }
    
    

    public Camenum getMarca() {
        return marca;
    }

    public void setMarca(Camenum marca) {
        this.marca = marca;
    }
    
    
}
