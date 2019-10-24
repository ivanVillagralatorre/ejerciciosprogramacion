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
public class ej3 {
    public static void main(String [] args){
    int x;
    String a="";
    int repetidas =0;
    String letra1="";
        
        
       a = JOptionPane.showInputDialog(null,"Escribe una palabra");
       letra1=JOptionPane.showInputDialog(null,"Escribe la  letra");
        
        
        
     for (x=0;x <a.length();x++){
               
             if(a.charAt(x) == letra1.charAt(0))
              { repetidas++;   }   } 
    
    
    
    
    JOptionPane.showMessageDialog(null,repetidas);
    
    
    
    
    
    
    
    }
    
}
