/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u4;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw04
 */
public class ej1 {
    
    public static void main (String[]args){
    
    
    int[] numeros = new int 
            [10] ;
    
    for(int i : numeros){
   numeros [i] = Integer.parseInt(JOptionPane.showInputDialog("introduce numeros"));
    }
    
    
  Arrays.sort(numeros);
    
    JOptionPane.showMessageDialog(null,"el mayor " +numeros[0]+ "  "+ "El menor"+numeros[9]);
    
    }
    
}
