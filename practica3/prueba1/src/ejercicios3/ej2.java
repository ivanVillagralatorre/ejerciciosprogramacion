/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios3;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw04
 */
public class ej2 {
    public static   void main (String [] args){
        String cadenainvertida="";
        String cadena="";
        
        cadena=JOptionPane.showInputDialog(null,"escribe una frase");
        
        for (int x=cadena.length()-1;x>=0;x--){
         cadenainvertida =cadenainvertida + cadena.charAt(x);}
            
    
    JOptionPane.showMessageDialog(null,cadenainvertida);
    
    
    }
    
}
