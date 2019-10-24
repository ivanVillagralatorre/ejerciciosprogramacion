/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;
import javax.swing.JOptionPane;

/**
 * 
 *
 * @author 1gdaw04
 */
public class ejercicio24 {
    
    static String v1="";
     static String v2="";
    static  String v3="";
     static String v4="";
     static  boolean correcto=false;
     public static void main(String[] args) {
     while(!correcto){    
     try{
       v1 = JOptionPane.showInputDialog(null,"v1 visual");
            if (!v1.equals("apto") && !v1.equals("no"))
                throw new v1Exception();
       v2 = JOptionPane.showInputDialog(null,"v2 cobol");
        if (!v2.equals("apto")&& !v2.equals("no"))
                throw new v1Exception();
       v3 = JOptionPane.showInputDialog(null,"v3 java");
        if (!v3.equals("apto")&& !v3.equals("no"))
                throw new v1Exception();
       v4 =  JOptionPane.showInputDialog(null,"v4 sql");
        if (!v4.equals("apto")&& !v4.equals("no"))
                throw new v1Exception();
        correcto = true;
     }
     catch(NumberFormatException a){JOptionPane.showMessageDialog(null,"hijo de puta mataron a kenny");}
     catch(v1Exception r){JOptionPane.showConfirmDialog(null,"prueba");}
     
     catch(Exception e){JOptionPane.showMessageDialog(null,"griezman");}
     
     finally {correcto=true;}
     
     }
     
       
     
     
     if(v1.equalsIgnoreCase("apto") && v2.equalsIgnoreCase("apto")  && v3.equalsIgnoreCase("apto") && v4.equalsIgnoreCase("apto") )
     {JOptionPane.showMessageDialog(null, "sobresaliente");}
     
     else
     
     {if(v2.equalsIgnoreCase("apto") && v4.equalsIgnoreCase("apto")  &&    v3.equalsIgnoreCase("apto") || v1.equalsIgnoreCase("apto"))
            {JOptionPane.showMessageDialog(null,"notable");}else
     {if(v2.equalsIgnoreCase("apto") && v4.equalsIgnoreCase("apto") &&  v3.equalsIgnoreCase("no") && v1.equalsIgnoreCase("no"))
            {JOptionPane.showMessageDialog(null,"bien");}
     else { if(v4.equalsIgnoreCase("apto") && v2.equals("no")  && v3.equalsIgnoreCase("apto") || v1.equalsIgnoreCase("apto"))
        {JOptionPane.showMessageDialog(null,"suficiente");}
     else{ if (v2.equalsIgnoreCase("apto") && v4.equalsIgnoreCase("no") && v3.equalsIgnoreCase("apto") || v1.equalsIgnoreCase("apto"))
        {JOptionPane.showMessageDialog(null,"suficiente");}
     else{JOptionPane.showConfirmDialog(null,"insuficiente");}
     }
     }
     } 
     
     }
     
       }
           
    }
     
         
       
        
        
        
        
    
    

