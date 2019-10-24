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
public class ejercicio22 {
      public static void main(String[] args)  {
      String nm =  JOptionPane.showInputDialog(null,"Introduce el numero primo");
      int n = Integer.parseInt(nm);
      int divisor = n - 1;
     int resto ;
      
     for(int i=n;i<=n;i--){
          if(i<=3){{if(i==1){JOptionPane.showMessageDialog(null,n+" no Es número primo");}
          else{JOptionPane.showMessageDialog(null,i+"  Es número primo");}
    }
          
    }
          else{do {    resto = n %divisor;
			divisor = divisor-1;
		} while (!(resto==0 || divisor==1));
     
       if(resto==0){JOptionPane.showMessageDialog(null,i+" no Es número primo");
          }
        else{JOptionPane.showMessageDialog(null,i+"  Es número primo");}}
    }
      }
}
    

