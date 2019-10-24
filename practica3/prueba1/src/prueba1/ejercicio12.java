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
public class ejercicio12{


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TO DO code application logic here
      String n1=  javax.swing.JOptionPane.showInputDialog("Cuantos minutos has gastado");
      double nm1  = Double.parseDouble(n1);
      
      
      if(nm1<=300){ double resultado1 = nm1*0.04;
      JOptionPane.showConfirmDialog(null,resultado1);
       }
      else{if(nm1>300 && nm1<=500){double resultado2 = nm1*0.03;
      JOptionPane.showConfirmDialog(null,resultado2);
      }}
      
      if(nm1>500 && nm1<=800){ double resultado3 = (nm1-300)*0.02+(300*0.03);
      JOptionPane.showConfirmDialog(null,resultado3);
      }
      else{if(nm1>800){
          double resultado0 = (nm1-300)*0.02+(300*0.03);
          double resultado4 = resultado0-(nm1*1.25/100);
      JOptionPane.showConfirmDialog(null,resultado4);
      }}
      
      }
      

    }


   
    
  
         
         

    
    

