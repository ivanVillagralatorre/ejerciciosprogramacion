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
public class ej4 {
    public static void main (String[]args){
        String[] meses = new String [12];
       
            boolean valor=false;
           dar(meses);
           
         
           do{
          String m=JOptionPane.showInputDialog("introduce el mes");
           
            df(valor,meses,m);
           if(valor==false)
          JOptionPane.showMessageDialog(null,"Mes incorrecto");
            
           }while(valor!=true);
           
           if(valor==true)
           {JOptionPane.showMessageDialog(null,"Mes correcto");}

    
    
    
    
    }
    
     public static void dar(String[] meses){
         //llenando
          meses[0]="enero";
          meses[1]="febrero";
          meses[2]="marzo";
          meses[3]="abril";
          meses[4]="mayo";
          meses[5]="junio";
          meses[6]="julio";
          meses[7]="agosto";
          meses[8]="septiembre";
          meses[9]="octubre";
          meses[10]="noviembre";
          meses[11]="diciembre";
     
     
     }
     
     public static void df(boolean valor,String[]meses,String m){
         for(int  i=0;i< meses.length  ; i++){
           if(m.equalsIgnoreCase(meses[i]))
           {valor=true;}
     
     }
     }
     
    
    
}
