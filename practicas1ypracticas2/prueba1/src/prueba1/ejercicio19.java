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
public class ejercicio19 {
     public static void main(String[] args)  {
         
        String cantidad = JOptionPane.showInputDialog(null,"escribe un numero del cual quiere saber su cuadrado");
        int can = Integer.parseInt(cantidad);
         int impar = 1;
         int suma = 0 ;
       
         for(int i=0;i<can;i++)
         {   
             suma= suma + impar;
             impar=impar + 2; 
             
         }
         JOptionPane.showMessageDialog(null,"El cuadrado de"+can+"es"+suma);
        
       
         }
}
    

