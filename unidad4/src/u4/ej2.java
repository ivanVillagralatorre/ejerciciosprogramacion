/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u4;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw04
 */
public class ej2 {
      public static void main (String[]args){
    
    try{
          int n = Integer.parseInt( JOptionPane.showInputDialog("de cuanto sera el arraid de numero")) ;
    
          int[] numeros = new int [n];
          
          
          formula(n,numeros);
   
  
    }
    catch (Exception e){JOptionPane.showMessageDialog(null,"error"+e.getMessage());}
            
      }
   
   public static void formula(int n,int[] numeros){
          int suma = 0;

    for(int i : numeros){
   numeros [i] =  (int)(Math.random()*10);
   JOptionPane.showMessageDialog(null, numeros[i]);
   suma=numeros[i]+suma;}
   
    JOptionPane.showMessageDialog(null, suma);
   
     }
    
    
      }

