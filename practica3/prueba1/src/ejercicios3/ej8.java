/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios3;

import java.awt.HeadlessException;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import javax.swing.JOptionPane;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author 1gdaw04
 */
public class ej8 {

    public static void main(String[] args) {
        String menu = "..";

        do {
            try {
                menu = JOptionPane.showInputDialog("\na-calcular edad de una persona"
                        + "\nb-sumar dos números"
                        + "\nc-contar vocales en una cadena"
                        + "\nd-salir");
                if (!menu.equals("a") && !menu.equals("b") && !menu.equals("c") && !menu.equals("d")) {
                    throw new menuNoValido();
                }

                switch (menu) {
                    case "a":
                        calcfecha();
                        break;
                    case "b":
                        suma2n();
                        break;
                    case "c":
                        contarvoc();
                        break;
                    case "d":
                        menu = "salir";
                        break;
                }
            } catch (menuNoValido f) {
                JOptionPane.showMessageDialog(null, "Solo acepta las opciones a b c y d en minuscula");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            };
        } while (!menu.equalsIgnoreCase("salir"));

    }

    public static int calcfecha() {
        LocalDate date1 = LocalDate.now();
        int año1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el el dia de la primera fecha"));
        int mes1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el el mes de la primera fecha"));
        int dia1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el el año de la primera fecha"));

        LocalDate date2 = LocalDate.of(dia1, mes1, año1);
        long año = date1.getYear();

        long edad = 0;

        JOptionPane.showMessageDialog(null, año - año1);

        return 0;

    }

    public static int suma2n() {
        try {
            int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
            int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo  numero"));

            JOptionPane.showMessageDialog(null, n1 + n2);
            return 0;

        } catch (NumberFormatException a) {
            JOptionPane.showMessageDialog(null, a.getMessage());
        } catch (HeadlessException s) {
            JOptionPane.showMessageDialog(null, s.getMessage());
        }
        return 0;
    }

    public static int contarvoc() {
        try {
            String cadena = JOptionPane.showInputDialog("Introduce la cedena de caracteres palabra o frase");
            char v1 = 'a';
            char v2 = 'e';
            char v3 = 'i';
            char v4 = 'o';
            char v5 = 'u';
            int numchar = 0;

            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) == v1 || cadena.charAt(i) == v2 || cadena.charAt(i) == v3 || cadena.charAt(i) == v4 || cadena.charAt(i) == v5) {
                    numchar++;
                }
            }

            JOptionPane.showMessageDialog(null, "numero de vocales" + " " + numchar);
            return 0;
        } catch (HeadlessException s) {
            JOptionPane.showMessageDialog(null, s.getMessage());
        } catch (Exception b) {
            JOptionPane.showMessageDialog(null, b.getMessage());
        }
        return 0;
    }

}
