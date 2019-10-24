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
public class ejercicio11{


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TO DO code application logic here
      String n1=  javax.swing.JOptionPane.showInputDialog("n1");
      int nm1  = Integer.parseInt(n1);
       String n2=  javax.swing.JOptionPane.showInputDialog("n2");
      int nm2  = Integer.parseInt(n2);
       String n3=  javax.swing.JOptionPane.showInputDialog("n3");
      int nm3  = Integer.parseInt(n3);
      
      if(nm1>nm3 && nm1>nm2){JOptionPane.showMessageDialog(null,nm1);
      JOptionPane.showMessageDialog(null," nm1 es el mayor");
      }
      else{if(nm2>nm1 && nm2>nm3){JOptionPane.showMessageDialog(null,nm2);
      JOptionPane.showMessageDialog(null," nm2 es el mayor");}}
      
      if(nm3>nm1 && nm3>nm2){JOptionPane.showMessageDialog(null,nm3);
      JOptionPane.showMessageDialog(null," nm3 es el mayor");}
      
        
      }
      

    }

   
    
  
         
         

    
    

