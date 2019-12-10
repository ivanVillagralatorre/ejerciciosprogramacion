/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import MisClases.*;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw04
 */
public class ejercicio1 {

    public static void main(String[] args) {

        try {
            Figura f1;
            f1 = new Figura();

            Double r = radio();
            f1.setRadio(r);
            f1.calcularCircunferencia();
            f1.calcularArea();
            f1.calcularVolumen();

            res(f1);

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }

    }

    public static double radio() {
        double r = Double.parseDouble(JOptionPane.showInputDialog("escribe el radio"));

        return r;

    }

    public static void res(Figura f1) {
        JOptionPane.showConfirmDialog(null, "\n" + "La circunferencia es:  " + f1.getCircunferencia()
                + "\n" + "La area es:  " + f1.getArea()
                + "\n" + "El volumen es:  " + f1.getVolumen());
    }

}
