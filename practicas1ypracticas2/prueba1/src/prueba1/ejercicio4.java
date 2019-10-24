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
public class ejercicio4 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TO DO code application logic here
     String n1=  javax.swing.JOptionPane.showInputDialog("D");
     String n2=  javax.swing.JOptionPane.showInputDialog("d");
     
    int nm1 = Integer.parseInt(n1);
    int nm2 = Integer.parseInt(n2);        
     
     int multi = nm1 * nm2 /2;
     
    JOptionPane.showMessageDialog(null, multi);
     
    
         
      
 
    }
    
}
