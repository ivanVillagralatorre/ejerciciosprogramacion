/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;


import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 * 
 * @author 1GDAW04
 */

public class ejercicio27 {
     
    public static void main (String [] args){
 int muerto=0;
 int herido=0;
  String  r = null ;
  String m ="";
  boolean cont = false;
  boolean l= false;
 

 
    while(!cont==true){ 
      try{
  int n =(int) (Math.random()*899+100);
  JOptionPane.showMessageDialog(null,n);
    m = Integer.toString(n);
    if (m.charAt(0)!= m.charAt(1) && m.charAt(0)!= m.charAt(2)&&m.charAt(1)!= m.charAt(0) && m.charAt(1)!= m.charAt(2))
            {cont=true;}
    else{JOptionPane.showConfirmDialog(null,"chaval que se va a generar otro que este se repite mas que tu en segundo de la eso");}
    
      }
      catch(NumberFormatException e){JOptionPane.showConfirmDialog(null,"Introduce un valor int"+"" +e.getMessage());}
      catch(Exception a){JOptionPane.showConfirmDialog(null,"Error generico"+"" +a.getMessage());}
   
    }
  
   
  do{
      
 
  
  r = JOptionPane.showInputDialog("Adivina el numero");
   if(r.length()!=3)
       
  
   

        r=r;
        herido=0;
        muerto=0;
        for(int x=0; r.charAt(x)<r.charAt(2);x++){
        { if(r.charAt(x)== m.charAt(x)){muerto++;}
        }}
        if(r.charAt(0)==m.charAt(1)||r.charAt(0)==m.charAt(2))
                            {
                                herido++;}
        if(r.charAt(1)==m.charAt(0)||r.charAt(1)==m.charAt(2))
                            {herido++;}
        if(r.charAt(2)==m.charAt(0)||r.charAt(2)==m.charAt(1))
                            {herido++;}
  
   
    JOptionPane.showMessageDialog(null,"numero de muertos"+""+muerto+
          "\numero de heridos"+""+herido);}while(!r.equals(m));
  JOptionPane.showConfirmDialog(null,"Enorabuena has acertado"+""+LocalDate.now());
  
 

    
  }}









        
    


