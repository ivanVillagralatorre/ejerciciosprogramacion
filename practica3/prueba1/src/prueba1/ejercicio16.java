/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw04
 */
public class ejercicio16 {
    public static void main(String [] args){
   
       String cantidad = JOptionPane.showInputDialog("Escribe cuantas personas sois");
       int can = Integer.parseInt(cantidad);
       int acum = 0;
       int c = 0;
        while(c<can){
        String nm1 = JOptionPane.showInputDialog("Escribe tu edad");
        int n1= Integer.parseInt(nm1);
        acum=acum+n1;
        c=c+1;
        }
        
        int r;
        r= acum/can;
     
        JOptionPane.showMessageDialog(null,r);
}
}

