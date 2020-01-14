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
public class EJ19 {
    
                 private static  String usuario;

        public static void main(String[]args)
    { usuario =JOptionPane.showInputDialog("ingresa nombre"); 
       
       Pattern pat=Pattern.compile("^@[a-zA-Z_-]*?");
       Matcher encaja = pat.matcher(usuario);
       
       if(encaja.matches())
       {JOptionPane.showConfirmDialog(null,"caracter valido");}
       else
            {JOptionPane.showConfirmDialog(null,"caracter no valido");}
    
    
    
    }
    
}
