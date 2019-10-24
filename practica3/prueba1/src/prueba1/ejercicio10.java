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
public class ejercicio10 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TO DO code application logic here
      String n1=  javax.swing.JOptionPane.showInputDialog("dime un numero del 1 al 7 y  te digo un dia");
      int nm1  = Integer.parseInt(n1);
     
   
     switch ( nm1){ case 1: JOptionPane.showInputDialog("lunes");
     break;
     case 2: JOptionPane.showInputDialog("MARTES");
      break;
      case 3: JOptionPane.showInputDialog("Miercoles");
       break;
       case 4: JOptionPane.showInputDialog("jueves");
        break;
        case 5: JOptionPane.showInputDialog("viernes");
         break;
         case 6: JOptionPane.showInputDialog("sabado");
          break;
         case 7: JOptionPane.showInputDialog("domingo");
          break;
 
         
     }
     
             

     

         
      
 
    }
    
}
