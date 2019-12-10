/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import MisClases.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author 1gdaw04
 */
public class ejmain {
    
    public static void main(String [] args){
        // creo objeto
        Persona p1;
        p1= new Persona();
        p1.setNombre("Famoso pepe");
        p1.setApellidos("jesusas");
        p1.setDni("111231A");
        p1.setEdad(20);
        
        Persona p2;
        p2= new Persona();
        p2.setNombre("bab");
        p2.setApellidos("ali");
        p2.setDni("111231g");
        p2.setEdad(10);
        
        
        
            
        Persona[] listapersonas = new Persona[3];
        listapersonas [0]=p1;
        listapersonas [0]=p2;
        
       
        for(int x=0;x<listapersonas.length;x++)
        {JOptionPane.showMessageDialog(null,listapersonas[x].getDni()  );}
        
        
        Coche c1= new Coche("111ssa","Blanco");
        Coche c2= new Coche("12222ssa","rgb");
        Coche c3= new Coche("ivenfmjs","primavera");
        
        p1.setUnCoche(c3);
      
        ArrayList<Coche> l= new ArrayList();
        l.add(c1);
        l.add(c2);
        p1.setLista(l);
        
        l.add(c3);
        
        p1.setUnCoche(c3);
       
        
     
        
        
               
    }
    
}
