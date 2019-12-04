/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u5;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw04
 */
public class ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numero = new ArrayList();
        llenar( numero);

        numero.add(10);
        int menu = 0;

        do {
            try {
                menu = men();

                opciones(numero, menu);

           
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, "errores genericos");
            }
        } while (menu != 10);
        // TODO code application logic here
    }

  public static void llenar(ArrayList<Integer> numero){
      for (int i = 0; i < 10; i++) {
            numero.add(i);
        }
  }
    
    public static void opciones(ArrayList<Integer> numero, int menu) throws Exception {
        switch (menu) {

            case 1:
                mayormenor(numero);
                break;
            case 2:
                buscar(numero);
                break;

            case 3:
                borrar(numero);
                break;

            case 4:
                array(numero);
                break;
            case 5:
                show(numero);
                break;
            case 6:
                add(numero);
                break;
            case 7:
                add2(numero);
                break;
            case 8:
                delete(numero);
                break;
            case 9:
                calc(numero);
                break;

        }

    }

    public static int men() throws Exception {

        int menu = 0;
      
            menu = Integer.parseInt(JOptionPane.showInputDialog("\n1-mayor y menor" + "\n2-buscar" + "\n3-borrar " + "\n4-convertir a array"
                    + "\n5-mostrar arraylist" + "\n6-añadir" + "\n7-añadir a posicion concreta"
                    + "\n8-norrar de posicion concreta" + "\n9-caclcular el total y el promedio del arraylist" + "\n-10"));
            
      
            
         
          return menu;
        }
        
    

    public static void mayormenor(ArrayList<Integer> numero) throws Exception {
        String a = "";

        do {

            numero.add(Integer.parseInt(JOptionPane.showInputDialog("introduce numeros")));

            a = JOptionPane.showInputDialog("¿Quieres continuar?");
        } while (!a.equals("no"));

        Integer[] numeroarray = numero.toArray(new Integer[numero.size()]);

        Arrays.sort(numeroarray);

        JOptionPane.showMessageDialog(null, "\n el numero menor es" + " " + numeroarray[0]
                + "\n el numero mayor es " + " " + numeroarray[numeroarray.length - 1]);

    }

    public static void buscar(ArrayList<Integer> numero) throws Exception {

        int n = Integer.parseInt(JOptionPane.showInputDialog("introduce el numero que quieres buscar"));

        if (numero.indexOf(n) != -1) {
            JOptionPane.showMessageDialog(null, "el numero si se encuentra en la lista");
        } else {
            JOptionPane.showMessageDialog(null, "el numero no se encuentra en la lista");

        }

    }

    public static void borrar(ArrayList<Integer> numero) throws Exception {
        int n = Integer.parseInt(JOptionPane.showInputDialog("introduce el numero que que quieres eliminar"));

        if (numero.indexOf(n) != -1) {
            numero.remove(numero.indexOf(n));
        } else {
            JOptionPane.showInputDialog("error no se encontro el numero que quieres borrrar");

        }

    }

    public static void array(ArrayList<Integer> numero) throws Exception {
        Integer[] numeroarray = numero.toArray(new Integer[numero.size()]);
        JOptionPane.showMessageDialog(null, "lo has transformado en un array");

    }

    public static void show(ArrayList<Integer> numero) throws Exception {
        String res = "";
        for (int x=0;x<numero.size();x++) {
            res += "\n" + numero.get(x);
        }

        if (!numero.isEmpty()) {
            JOptionPane.showMessageDialog(null, res);
        }

    }

    public static void add(ArrayList<Integer> numero) throws Exception {
        int n = Integer.parseInt(JOptionPane.showInputDialog("introduce el numero que que quieres añadir"));

        numero.add(n);

        JOptionPane.showMessageDialog(null, "añadiste el numero" + n + " " + "al arraylist");
    }

    public static void add2(ArrayList<Integer> numero) throws Exception {
        
         int b = Integer.parseInt(JOptionPane.showInputDialog("introduce el numero de en que posicion lo   quieres añadir"));
        int n = Integer.parseInt(JOptionPane.showInputDialog("introduce el numero  que quieres añadir"));
       

        numero.add(b, n);

        JOptionPane.showMessageDialog(null, "añadiste el numero" + numero.get(b) + " " + "al arraylist");
    }

    public static void delete(ArrayList<Integer> numero) throws Exception {

        int b = Integer.parseInt(JOptionPane.showInputDialog("introduce el numero de en que posicion lo   quieres añadir"));

        numero.remove(b);

        JOptionPane.showMessageDialog(null, "el numero ha sido eliminado");
    }

    public static void calc(ArrayList<Integer> numero) throws Exception {

        int suma = 0;
        int prom;

        for (int x : numero) {
            suma += numero.get(x);
        }

        prom = suma / numero.size();

        JOptionPane.showMessageDialog(null, "suma de la lista=" + suma
                + "  " + "el promedio es=" + prom);

    }

}

