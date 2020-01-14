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
public class EJ17 {
             private static  String name;
    
       public static void main(String[]args)
    { name =JOptionPane.showInputDialog("ingresa nombre"); 
       
       Pattern pat=Pattern.compile("^([A-Z]a-z]+[\\s]?){1,2}$");
       Matcher encaja = pat.matcher(name);
       
       if(encaja.matches())
       {JOptionPane.showConfirmDialog(null,"caracter valido");}
       else
            {JOptionPane.showConfirmDialog(null,"caracter no valido");}
    
    
    
    }
    
}
    

