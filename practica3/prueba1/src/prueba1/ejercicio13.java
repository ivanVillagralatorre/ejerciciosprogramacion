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
public class ejercicio13 {
   
     public static void main(String[] args)  {
         int cont = 0;
          int countchicas=0;
          int countchicos=0;
        
      while (cont<2){
      
         String peso = JOptionPane.showInputDialog(null,"peso");
         int p = Integer.parseInt(peso);
         String edad = JOptionPane.showInputDialog(null,"edad");
         int e = Integer.parseInt(edad); 
         String nombre= JOptionPane.showInputDialog(null,"nombre");
         String sexo =  JOptionPane.showInputDialog(null,"sexo");
         String estatura = JOptionPane.showInputDialog(null,"estatura");
         int est = Integer.parseInt(estatura); 
           
          if (sexo.equals("femenino"))       
         {
             if(est>=160 && p > 60)
             { 
                countchicas=countchicas+1;
             }}
        
         else
         {if(est >170 && p>70 )
         { countchicos=countchicos+1;}};
          cont ++;
          }
      JOptionPane.showMessageDialog(null," pincha siguiente para ver el numero de chicas validas");
      JOptionPane.showMessageDialog(null,countchicas);
      JOptionPane.showMessageDialog(null," pincha siguiente para ver el numero de chicos validas");
      JOptionPane.showMessageDialog(null,countchicos);
      }
     
     

       
   
         
     }
     
                     
         
     
     
     
     
     
     
     

    
    
    
    
    
    
    
    
    
    
    
    
    
    

