/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author 1gdaw04
 */
public class ejercicio25 {
    
    static boolean correcto = false;
     static int op;
    static int n1;
    static int n2;
    
     public static void main(String[] args)  {
      
         while(!correcto){
      try{
       n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
       if(n1<=0)
           throw new n1Exception();
     
       n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
       if(n1<=0)
           throw new n2Exceptions();
       
       correcto=true;
       
        }
      catch(NumberFormatException e){JOptionPane.showMessageDialog(null,"El error de formato" +e.getMessage());}
      catch(n1Exception j){JOptionPane.showMessageDialog(null,"n1 error");}
      catch(n2Exceptions k){JOptionPane.showMessageDialog(null,"n1 error");}
      catch(Exception f){JOptionPane.showMessageDialog(null,"El error de generico" +f.getMessage());}
      
         }
        
       do{ 
       String operacion = JOptionPane.showInputDialog(null,"Que operacion vas a elegir"
               +"\n1,-sumardosnumeros."
                +"\n2,restar dos numeros."
               +"\n3,Multiplicar."
               +"\n4,dividion"
               +"\n5,cerrar aplicacion."
               );
     op = Integer.parseInt(operacion);
        
      
       
       switch(op){
           case 1: if(op==1){int resultado = n1+n2;
                    JOptionPane.showMessageDialog(null,"suma es"+" "+resultado);}
                    
                    break;
           case 2: if(op==2){int resultado2 = n1-n2;
                    JOptionPane.showMessageDialog(null,"resta es"+" "+resultado2);}
                    break;  
            case 3:if (op==3){ int resultado3 = n1 * n2;
                    JOptionPane.showMessageDialog(null,"multiplicacion es es"+" "+resultado3);}
                    break;   
                    
             case 4: if (op==4){ int coc =  n1/n2;
                      int resto=n1%n2;
                    JOptionPane.showMessageDialog(null,"cociente es"+" "+coc+" "+"resto es"+" "+resto);}
                    break;       
       
       }
           
         }while(!(op==5));    
}    
}
        
        
        
        
        
        
    
    

