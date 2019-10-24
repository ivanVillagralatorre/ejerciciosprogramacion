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
public class ejercicio17 {
     public static void main(String [] args){
   
       String cantidad = JOptionPane.showInputDialog("Escribe cuantas personas sois");
       int can = Integer.parseInt(cantidad);
       int acum = 0;
       int men= 11;
       int may= -1;
       int c = 0;
       String  mename="";
       String  maxname ="";
        
       
       for(int contador = 0;contador<40;contador++){
        String nm1 = JOptionPane.showInputDialog("Escribe tu nota");
        int n1= Integer.parseInt(nm1);
        String nombre = JOptionPane.showInputDialog("Escribe tu nombre");
       
        if(n1<men){men=n1;
          mename = nombre;
        }
        else{if(n1> may)
        {may=n1;   maxname=nombre;
                }
                }
         acum=acum+n1;
        c=c+1;
        }
        
         JOptionPane.showMessageDialog(null,"el numero mayor es");
              JOptionPane.showMessageDialog(null,may+ maxname);
             
                JOptionPane.showMessageDialog(null,"el numero manor es");
              JOptionPane.showMessageDialog(null,men+mename);
        
        
        
        
       
        }
        
      
      
 
}
