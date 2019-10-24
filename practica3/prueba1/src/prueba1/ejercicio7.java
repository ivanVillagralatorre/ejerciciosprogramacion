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
public class ejercicio7 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TO DO code application logic here
      String n1=  javax.swing.JOptionPane.showInputDialog("cateto");
      String n2=  javax.swing.JOptionPane.showInputDialog("cateto");
   double nm1 = Double.parseDouble(n1);   
   double nm2 = Double.parseDouble(n2);
     
    double multi = nm1*nm1 + nm2*nm2;
    multi = Math.rint(multi);
     
    JOptionPane.showMessageDialog(null, multi);

     

         
      
 
    }
    
}
