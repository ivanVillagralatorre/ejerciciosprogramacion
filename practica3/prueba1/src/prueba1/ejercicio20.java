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
public class ejercicio20 {
      public static void main(String[] args)  {
       int n =(int) (Math.random()*100+1);
       JOptionPane.showMessageDialog(null,n);
       boolean h=false;
       
      String pregunta= "...";
      while(h==false && !pregunta.equals("stop") ){String res = JOptionPane.showInputDialog(null,"Escribe un numero del 1 al 100");
       int r = Integer.parseInt(res);
       if(r<n){JOptionPane.showMessageDialog(null,"El numero que buscas es mayor");
       pregunta = JOptionPane.showInputDialog("Quieres seguir jugando");}
       else
       {if(r>n){JOptionPane.showMessageDialog(null,"El numero que buscas es menor");
       pregunta = JOptionPane.showInputDialog("Quieres seguir jugando");}}
       if(r==n){
           h=true;
       }

       }
    if(h==true){
       JOptionPane.showMessageDialog(null,"has acertado");  }
    else{JOptionPane.showMessageDialog(null,"Gracias por jugar"); 
    }
      
      }
}

      

    
    

