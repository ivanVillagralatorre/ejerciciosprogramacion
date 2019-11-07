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
public class ej5 {

    public static void main(String[] args) {
        String continuar = "  ";
        int[] agua = new int[12];

        do {
            int mes = Integer.parseInt(JOptionPane.showInputDialog("mes"));

            agua[mes - 1] = Integer.parseInt(JOptionPane.showInputDialog("agua"));
            

            

            continuar = JOptionPane.showInputDialog("¿Quieres continuar?");
        } while (!continuar.equalsIgnoreCase("n"));

        JOptionPane.showMessageDialog(null, "\n" + "enero"+agua[0] +"L" + "\n" +"febrero"+ agua[1]+ "L"  + "\n" +"marzo"+ agua[2]+ "L"   + "\n" +"abril"+ agua[3]+ "L" + 
                                            "\n"+ "mayo"+ + agua[4]+ "L" + "\n" + "junio"+ + agua[5]+ "L" + "\n"+"julio"+ + agua[6]+ "L" + "\n"+"agosto" + agua[7]+ "L" + "\n" + 
                                               "septiembre"+ agua[8]+ "L" + "\n" + "octubre"+ agua[9]+ "L" + "\n"+"novembre" + agua[10]+ "L" + "\n" +"diciembre"+ agua[11]+ "L");

    }
}
