package ejercicios3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1gdaw04
 */
public class ej6 {

    public static void main(String[] args) {

        DateTimeFormatter.ofPattern("dd/MMM/yy");

        int año1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el el dia de la primera fecha"));
        int mes1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el el mes de la primera fecha"));
        int dia1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el el año de la primera fecha"));

        LocalDate date1 = LocalDate.of(dia1, mes1, año1);

        int a = date1.getDayOfYear();

        if (a == 80 && a <= 171) {
            JOptionPane.showMessageDialog(null, "primavera");
        } else {
            if (a == 172 && a <= 265) {
                JOptionPane.showMessageDialog(null, "verano");
            } else {
                if (a == 266 && a <= 356) {
                    JOptionPane.showMessageDialog(null, "otoño");
                } else {
                    JOptionPane.showMessageDialog(null, "invierno");
                }
            }
        }

    }
}
