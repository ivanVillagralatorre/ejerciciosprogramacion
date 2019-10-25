/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios3;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 *
 * @author 1gdaw04
 */
public class ejercicio5 {
    
  public static void main (String[] args){
     
     DateTimeFormatter.ofPattern("dd/mm/yy");
       try{
   int año1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el el dia de la primera fecha"));
   int mes1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el el mes de la primera fecha"));
   int dia1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el el año de la primera fecha"));
   
   LocalDate date1 =LocalDate.of(dia1, mes1, año1);
    

 JOptionPane.showMessageDialog(null,date1.plusDays(100));
 
}
catch(Exception e) {JOptionPane.showMessageDialog(null,e.getMessage());}
      
      
      
      
      
      
    }
       
}
