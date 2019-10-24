/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios3;

import java.time.LocalDate;
import java.time.Month;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw04
 */
public class ej4 {
   public static void main(String[] args){
       int diasdif1;
       int diasdif2 ;
   
   int año1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el el dia de la primera fecha"));
   int mes1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el el mes de la primera fecha"));
   int dia1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el el año de la primera fecha"));
   
   LocalDate date1 =LocalDate.of(dia1, mes1, año1);
   
   JOptionPane.showMessageDialog(null,date1);
   int año2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el el dia de la segunda fecha"));
   int mes2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el el mes de la segunda fecha"));
   int dia2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el el año  de la segunda fecha"));
   
   LocalDate date2 =LocalDate.of(dia2, mes2, año2);
 JOptionPane.showMessageDialog(null,date2);
   
   
  if(date1.getDayOfYear()>date2.getDayOfYear())
  {diasdif1=date1.getDayOfYear()+ date2.getDayOfYear();
    diasdif1= diasdif1 - date2.getDayOfYear();
    JOptionPane.showMessageDialog(null,date2.getDayOfYear()+""+date1.getDayOfYear()2);
     
  JOptionPane.showMessageDialog(null,diasdif1+""+"dias de diferencia de la fecha 1 a la 2");}
  
  else{if(date2.getDayOfYear()>date1.getDayOfYear())
  {   diasdif2=date2.getDayOfYear()+date1.getDayOfYear();
       diasdif2= diasdif2 -date1.getDayOfYear();
        JOptionPane.showMessageDialog(null,diasdif2+""+"dias de diferencia de la fecha 2 a la 1");}}
   
    
    
    
    

   
   
   
   
   
   }
    
}
