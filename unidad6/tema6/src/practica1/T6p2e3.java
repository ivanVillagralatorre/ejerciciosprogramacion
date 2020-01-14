/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import Misclases2.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw04
 */
public class T6p2e3 {

    private static ArrayList<Empleado> lista1;
    private static ArrayList<Empleado> lista2;
    private static Empresa empre1;
    private static Empresa empre2;
    private static Directivo dir1;
    private static Directivo dir2;

    public static void main(String[] args) {
        empresas();
        empleados();
        directivos();
        res();
    
    }

    public static void res() {
        if (dir1.getListasub().size() < dir2.getListasub().size()) {
            JOptionPane.showConfirmDialog(null, " el director con mas subordinado es:"
                    + "  " + dir2.Mostrar());
        } else {
            JOptionPane.showConfirmDialog(null, " el director con mas subordinado es:"
                    + "  " + dir1.Mostrar());
        }

    }

    public static void empresas() {
        Empresa empre1 = new Empresa();
        Empresa empre2 = new Empresa();

        empre1.setNombre("logitech");
        empre2.setNombre("ubisoft");
    }

    public static void empleados() {
        Empleado emple1 = new Empleado();
        emple1.setEdad(13);
        emple1.setE(empre1);
        emple1.setNombre("jose");
        emple1.setSueldo_bruto(1400);

        Empleado emple2 = new Empleado();

        emple2.setEdad(13);
        emple2.setE(empre1);
        emple2.setNombre("pepe");
        emple2.setSueldo_bruto(1400);
        lista1 = new ArrayList();
        lista1.add(emple1);
        lista1.add(emple2);

        Empleado emple3 = new Empleado();
        emple3.setEdad(13);
        emple3.setE(empre2);
        emple3.setNombre("leo");
        emple3.setSueldo_bruto(1400);

        Empleado emple4 = new Empleado();
        emple4.setEdad(13);
        emple4.setE(empre2);
        emple4.setNombre("madre");
        emple4.setSueldo_bruto(1400);

        Empleado emple5 = new Empleado();
        emple5.setEdad(13);
        emple5.setE(empre2);
        emple5.setNombre("jokin");
        emple5.setSueldo_bruto(1400);
        lista2 = new ArrayList();
        lista2.add(emple3);
        lista2.add(emple4);
        lista2.add(emple5);
    }

    public static void directivos() {
        dir1 = new Directivo("superior", lista1, 1900, "julio", 13);

        dir2 = new Directivo("JEFE", lista2, 200, "molano", 19);
    }

}
