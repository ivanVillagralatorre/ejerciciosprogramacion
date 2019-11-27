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
public class ejercicio8 {

    public static void main(String[] args) {
        int[] codigos = new int[5];
        int[] faltas = new int[5];
        String resultado = "";
       

        ope( codigos,faltas);
        

        res(codigos, faltas, resultado);

    }

    public static void res(int[] codigos, int[] faltas, String resultado) {
        for (int l = 0; l < codigos.length && codigos[l] != 0; l++) {
         
                resultado += "\n" + "codigo del alumno:" + codigos[l] + "   " + "numero de faltas:" + faltas[l];
            
        }
        JOptionPane.showMessageDialog(null, "Faltas de el mes de noviembre"
                + resultado);
    }
   
    public static void ope(int[] codigos, int[] faltas){
      String pregunta="";
      int count=0;  

      
      
      
      
      do{
       count++;
              
                     codigos[count] = Integer.parseInt(JOptionPane.showInputDialog("introduce el numero de alumno"));
                    faltas[count] = Integer.parseInt(JOptionPane.showInputDialog("numero de faltas que a tenido"));
                     pregunta=JOptionPane.showInputDialog("¿Quieres continuar?");
               
            }while(!pregunta.equals("no"));
                  

}
 

}
 
    

