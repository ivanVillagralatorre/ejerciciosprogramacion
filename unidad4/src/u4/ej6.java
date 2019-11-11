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
public class ej6 {
    
    public static void main(String[]args){
        String resultado="";
      String texto =  JOptionPane.showInputDialog("introduce un texto");
    char[] abecedario = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','u','v','w','x','y','z'};
            
    int[] contador = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
     
     
     

     texto.toLowerCase();
     for(int x=0;x<texto.length();x++){
         for(int i=0;i<abecedario.length;i++)
         {if(texto.charAt(x)==abecedario[i])
         {contador[i]+=1;}}
     
     }
      
      
    for(int l=0;l<abecedario.length;l++)
    {resultado+="letra "+abecedario[l]+" esta "+contador[l]+'\n';}
    JOptionPane.showMessageDialog(null,resultado);
    
   
    }
}
