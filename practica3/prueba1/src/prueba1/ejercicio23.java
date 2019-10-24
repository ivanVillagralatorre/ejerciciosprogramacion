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
public class ejercicio23 {
       public static void main(String[] args)  {

         int hb=10;
         int he=15;
         String estado="...";
         String estudios="...";

        String horas = JOptionPane.showInputDialog(null,"Introduzca numero de horas trabajadas");
        int h = Integer.parseInt(horas);
        
      
        do{ estado = JOptionPane.showInputDialog(null,"Introduzca su estado civil(s),(c) , (v) o (d)");
            
        }while(!estado.equalsIgnoreCase("s") && !estado.equalsIgnoreCase("c") && !estado.equalsIgnoreCase("v") && !estado.equalsIgnoreCase("d") );
        
         do{ estudios = JOptionPane.showInputDialog(null,"Introduzca sus estudios (p) , (m) o (s)");
            
        }while(!estudios.equalsIgnoreCase("p") && !estudios.equalsIgnoreCase("m") && !estudios.equalsIgnoreCase("s"));
         if(estado.equalsIgnoreCase("s") && estudios.equalsIgnoreCase("p") || estado.equalsIgnoreCase("v") && estudios.equalsIgnoreCase("s") || estado.equalsIgnoreCase("s") &&
                 estudios.equalsIgnoreCase("m") || estado.equalsIgnoreCase("c") && estudios.equalsIgnoreCase("s") || estado.equalsIgnoreCase("v") &&
                 estudios.equalsIgnoreCase("p") || estado.equalsIgnoreCase("s") && estudios.equalsIgnoreCase("s")||estado.equalsIgnoreCase("d") && estudios.equalsIgnoreCase("s"))
         {if(h<40){
             int sueldobase1 = h * hb + 100;
             JOptionPane.showMessageDialog(null, sueldobase1+"es tu sueldo essueldo");
         }else
         {if(h>40){int hi=h-40;
                   int  sueldototal1=(hi*15)+(h*hb)+100-hi;
                   JOptionPane.showMessageDialog(null, sueldototal1+"es tu sueldo essueldo");             }
         }
         }
         else{if(h<40){
             int sueldobase2 = h * hb ;
             JOptionPane.showMessageDialog(null, sueldobase2+"es tu sueldo essueldo");
         }else{if(h>40){int hii=h-40;
                   int  sueldototal2=(hii*15)+(h*hb)-hii;
                   JOptionPane.showMessageDialog(null, sueldototal2+"es tu sueldo essueldo");}
         
         
        
    
        
         
         
         
         }
        
         }
         
         
    
             
        
         
        
    
    
    
    
    
    
    
    }
    
}
