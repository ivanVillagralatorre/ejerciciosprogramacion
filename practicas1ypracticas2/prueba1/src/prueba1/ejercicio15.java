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
public class ejercicio15 {
    
    
     public static void main(String[] args)  {
         int cn =0;
         int count = 0;
        
         
         while(count<10){
         String nm1 = JOptionPane.showInputDialog(null,"escribe tu nota");
         int n1 = Integer.parseInt(nm1);
 
         if(n1>=6 && n1<11){cn = cn+1; }
         
         
         count=count+1; 
         }
         
         JOptionPane.showMessageDialog(null,"numero de aprobados clicka a siguiente");
         JOptionPane.showMessageDialog(null,cn);
     }
    
}
