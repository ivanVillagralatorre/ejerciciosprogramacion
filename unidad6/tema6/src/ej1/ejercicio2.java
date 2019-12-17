/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import MisClases.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw04
 */
public class ejercicio2 {

    public static void main(String[] args) {
        String p = "";
        int c;
        String n;
        String d;
        String t;
        int c2;

        ArrayList<Alumno> lista = new ArrayList();
        do {
            Alumno alu = new Alumno();

            c = Integer.parseInt(JOptionPane.showInputDialog("codigo alumno"));
            n = JOptionPane.showInputDialog("nombre alumno");
            d = JOptionPane.showInputDialog("domicilio alumno");
            t = JOptionPane.showInputDialog("telefono alumno");

            alu.setCod(c);
            alu.setNombre(n);
            alu.setDomicilio(d);
            alu.setTlfn(t);

            lista.add(alu);

            p = JOptionPane.showInputDialog("¿quieres contiunar?");
        } while (!p.equals("no"));

        c2 = codigo2();
        res(lista, c2);

    }

    public static int codigo2() {
        int c = Integer.parseInt(JOptionPane.showInputDialog("codigo del alumno que quieres sacar los datos"));
        return c;
    }

    public static void res(ArrayList<Alumno> lista, int c2) {
        for (Alumno alu : lista) {
            if (c2 == alu.getCod()) {
                JOptionPane.showConfirmDialog(null, "nombre del alumno: " + alu.getNombre() + "  domicilio:" + alu.getDomicilio() + "   tlfn:  " + alu.getTlfn());
            }
        }
    }

}
