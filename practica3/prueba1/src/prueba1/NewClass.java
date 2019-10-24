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
public class NewClass {
    
    public static void main(String[] args)  {
     int count=0;
     int suma = 0;
        while (count<10){
        String nm1 =  JOptionPane.showInputDialog(null,"numeros");
        int n1=Integer.parseInt(nm1);
            
        suma = suma + n1;
      
        count=count+1;
        
        
    }
        JOptionPane.showMessageDialog(null,suma);
}
}