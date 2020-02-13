/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ2;

import EJ2.clases.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.util.regex.Pattern.matches;
import javax.swing.JOptionPane;




/**
 *
 * @author 1gdaw04
 */
public class main {

    public static ArrayList<Persona> listp;
    public static Persona p;
    public static Ventana v = new Ventana();
    public static void main(String[] args) {
       
       v.setVisible(true);
        listp = new ArrayList();
       

    }
    
   public static  void rellenar(String dni,String nombre,String apellido){
      p = new Persona();
      p.setDni(dni);
      
      
      p.setNombre(nombre);
      
     
      p.setApellidos(apellido);
      
      listp.add(p);
    
    
    }

    public static void salir() {
        String resultado="";
        for(int x = 0;x<listp.size();x++)
        {resultado += "\n"+listp.get(x).toString();}
        
        JOptionPane.showConfirmDialog(null, resultado);
            
        
        System.exit(0);
    }
}