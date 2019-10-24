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
public class ejercicio5 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TO DO code application logic here
      String n1=  javax.swing.JOptionPane.showInputDialog("grados");
    
    float nm1 = Float.parseFloat(n1);   
    float nm2  = 1.8f;
     
     float multi = (nm1  * nm2 ) + 32;
     
    JOptionPane.showMessageDialog(null, multi);

     

         
      
 
    }
    
}
