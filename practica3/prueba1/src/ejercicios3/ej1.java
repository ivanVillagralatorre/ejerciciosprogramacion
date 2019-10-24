/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios3;
  import javax.swing.JOptionPane;
/**
 *
 * @author 1gdaw04
 */
public class ej1 {
  

public static void main(String[] args){
  String a = "";
  String res="";
  boolean r=false;
  char v1 ='a';
  char v2 = 'e';
  char v3 = 'i';
  char v4 = 'o';
  char v5 = 'u';
  int nvocales = 0;
   int x = 0;
  
    do{
   
        
    a=JOptionPane.showInputDialog(null,"escribe");
   
    
    
    nvocales=0;
   for (x=0;x <a.length();x++){
               
             if(a.charAt(x)== v1 || a.charAt(x)== v2 ||  a.charAt(x)== v3 || a.charAt(x)== v4 || a.charAt(x) == v5)
              { nvocales++;   }   } 
           
         
           
  
    JOptionPane.showMessageDialog(null,"numero de vocales"+""+nvocales);
   
    res=JOptionPane.showInputDialog(null,"escribe fin si quieres finalizar");
    
    }while(!res.equalsIgnoreCase("fin"));




}
    
}
