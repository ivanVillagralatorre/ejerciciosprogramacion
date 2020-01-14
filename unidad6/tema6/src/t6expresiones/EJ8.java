/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6expresiones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw04
 */
public class EJ8 {
    
        private static  String octal;
    
       public static void main(String[]args)
    { octal =JOptionPane.showInputDialog("ingresa numero entero"); 
       
       Pattern pat=Pattern.compile("^[0-7]+");
       Matcher encaja = pat.matcher(octal);
       
       if(encaja.matches())
       {JOptionPane.showConfirmDialog(null,"caracter valido");}
       else
            {JOptionPane.showConfirmDialog(null,"caracter no valido");}
    
    
    
    }
    
}
