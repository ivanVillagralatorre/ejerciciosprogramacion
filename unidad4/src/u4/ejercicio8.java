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

        ope( codigos,  faltas);
        

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
while(!pregunta.equals("no")){
        for (int x = 0; x < codigos.length; x++) {
      try {   
                   codigos[x] = Integer.parseInt(JOptionPane.showInputDialog("introduce el numero de alumno"));
                } catch (NumberFormatException o) {JOptionPane.showMessageDialog(null, "tipo int");}
                catch (NullPointerException a) {JOptionPane.showMessageDialog(null, "exit");}
                catch (Exception e) {JOptionPane.showMessageDialog(null, "errores genericos");}
      
   }   
           

for (int i = 0; i < faltas.length; i++) {
                try {
                    
                    faltas[i] = Integer.parseInt(JOptionPane.showInputDialog("numero de faltas que a tenido"));
                     pregunta=JOptionPane.showInputDialog("¿Quieres continuar?");
                } catch (NumberFormatException o) {JOptionPane.showMessageDialog(null, "tipo int");}
                catch (NullPointerException a) {JOptionPane.showMessageDialog(null, "exit");}
                catch (Exception e) {JOptionPane.showMessageDialog(null, "errores genericos");}
            }
  }
        }
    }

