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
public class ejercicio26 {
   
    public static void main(String[] args) {
         String pre = "..";
         int count = 0;
        String nombre ="..";
        int i=0;
        int  prom;
        
        int prome;
        
     
     
       do{    

          nombre  =  JOptionPane.showInputDialog("nombre de alumno");
          
        String not1= JOptionPane.showInputDialog("nota1");
        int n1 = Integer.parseInt(not1);
         String not2= JOptionPane.showInputDialog("nota2");
        int n2 = Integer.parseInt(not2);
          String not3=JOptionPane.showInputDialog("nota3");
          int n3 = Integer.parseInt(not3);
          String not4=JOptionPane.showInputDialog("nota4");
          int n4 = Integer.parseInt(not4);
          String not5= JOptionPane.showInputDialog("nota5");
          int n5 = Integer.parseInt(not5);
         String not6=JOptionPane.showInputDialog("nota6");
         int n6 = Integer.parseInt(not6);
         count++;
       
      
        
          
       prom =(n1+n2+n3+n4+n5+n6) /6;
        prome=(0+prom)/count;
        JOptionPane.showMessageDialog(null,"El PROMEDIO de "+" "+nombre+" "+"es"+ prom);
         pre =JOptionPane.showInputDialog("quieres continuar");
          }while (!pre.equalsIgnoreCase("final"));
    
     
       
       JOptionPane.showConfirmDialog(null,"promedio total de la clase"+""+prome);
        }
    }
     
      
     
    

         
         
       
    
     
     
     


    
    
    
    
    
    
    
    
    
    




