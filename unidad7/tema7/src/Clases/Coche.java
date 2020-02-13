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
public class Coche extends Vehiculo {
    
    private Cenum marca;

    public Coche(Cenum marca) {
        this.marca = marca;
    }

    public Coche(Cenum marca, String matricula, Persona p) {
        super(matricula, p);
        this.marca = marca;
    }

    public Coche() {
   
    }
    
    
    

    public Cenum getMarca() {
        return marca;
    }

    public void setMarca(Cenum marca) {
        this.marca = marca;
    }
    
    
}
