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
public class ejercicio9 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TO DO code application logic here
      String n1=  javax.swing.JOptionPane.showInputDialog("dime tu nota");
   
         int nm1 = Integer.parseInt(n1);   
         
     
     if(nm1>=0 && nm1<=3){
         JOptionPane.showMessageDialog(null,"muy deficiente ");
     }
     else     
     { if (nm1<5 && nm1>3){JOptionPane.showMessageDialog(null,"insuficiente");}
       }
     
    if (nm1>=5 && nm1<7){JOptionPane.showMessageDialog(null,"suficiente");}
    else{ if (nm1>=7 && nm1<9)
            {JOptionPane.showMessageDialog(null,"bien");} }
    
    if(nm1<10 && nm1>=9){JOptionPane.showMessageDialog(null,"notable");
        }
    else{ if (nm1<=10){JOptionPane.showMessageDialog(null,"sobresaliente");
        }}
    
   
      
 
    }
    
}
