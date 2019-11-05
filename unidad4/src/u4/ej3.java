/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u4;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw04
 */
public class ej3 {
     public static void main (String[]args){
         char[] arraycar = new char [26];
         int m=0;
         abcd(arraycar);
         String cadena=null;
         
         do{
           m=pedir();
           
           if(m==0){cadena=cadena+arraycar[0];}
           else{if(m==5){cadena=cadena+arraycar[5];}
           else{if(m==25){cadena=cadena+arraycar[25];}
           else{if(m==50){JOptionPane.showMessageDialog(null,"Error,Escriba otro numero");}}
           
           }}
           
           
           
           
         }while(m!=-1);
         
         JOptionPane.showMessageDialog(null,"Cadena resultante:"+cadena);
         
         
     }
     
     public static void abcd(char[] arraycar){
         for(int i=0; i<arraycar.length;i++)
         {arraycar[i]=(char)('A'+i);
         
         }
     
     }
     public static int pedir(){
     int n = Integer.parseInt(JOptionPane.showInputDialog("escribe un numero"));
     return n;
     }
     
     public static void fianl(int n){
         
     
     }
     
     
    
}





