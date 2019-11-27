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
public class ej10 {
    

    public static void main(String[] args) throws Exception {
        int[][] arraybidimensional = new int[4][4];
        String menu = "";

        do {
            try{
            menu = menu1();

            switch (menu) {

                case "a":
                    rellen(arraybidimensional);

                    break;
                case "b":
                    sumfil(arraybidimensional);

                    break;
                case "c":
                    sumcol(arraybidimensional);

                    break;
                case "d":
                    diag1(arraybidimensional);
                    break;

                case "e":
                    diag2(arraybidimensional);
                    break;
                case "f":
                    prom(arraybidimensional);
                    break;

            }
            }catch(Exception e){JOptionPane.showMessageDialog(null,"errores genericos" );}
        } while (!menu.equals("salir"));

    }

    public static void rellen(int[][] arraybidimensional) {
        String res = "";

        for (int x = 0; x < arraybidimensional.length; x++) {
            for (int i = 0; i < arraybidimensional[x].length; i++) {
                arraybidimensional[x][i] = (int) (Math.random() * 10 + 1);
            }
        }

        for (int x = 0; x < arraybidimensional.length; x++) {
            for (int i = 0; i < arraybidimensional[x].length; i++) {
                res += "\n" + "fila y columna" + arraybidimensional[x][i];

            }
        }

        JOptionPane.showMessageDialog(null, res);

    }

    public static void sumfil(int[][] arraybidimensional) {

        int suma = 0;
        int fila = Integer.parseInt(JOptionPane.showInputDialog("que fila quieres sumar"));
        for (int x = 0; x < arraybidimensional[fila].length; x++) {

            suma += arraybidimensional[fila][x];
        }
        JOptionPane.showMessageDialog(null, "la suma total del numero de lasfilas es:" + suma);

    }

    public static void sumcol(int[][] arraybidimensional) {
        int suma1 = 0;
        int columna = Integer.parseInt(JOptionPane.showInputDialog("que columna quieres sumar"));
        for (int x = 0; x < arraybidimensional[columna].length; x++) {

            suma1 += arraybidimensional[x][columna];
        }
        JOptionPane.showMessageDialog(null, "la suma total del numero de lasfilas es:" + suma1);
    }

    public static void diag1(int[][] arraybidimensional) {
        int diagonal1 = 0;
        for(int x=0;x<arraybidimensional.length;x++)
        {diagonal1+=arraybidimensional[x][x];}
        JOptionPane.showMessageDialog(null, diagonal1);
    }

    public static void diag2(int[][] arraybidimensional) {
        int diagonal2 = 0;
       for(int x=0, y=3 ;x<=0 ;x++,y--)
       {
           diagonal2+=arraybidimensional[x][y];
       }
        JOptionPane.showMessageDialog(null, diagonal2);
    }

    public static String menu1() {
        String menu = JOptionPane.showInputDialog("elige una opcion"
                + "\na  -" + "rellenar la matriz de numeros"
                + "\nb  -" + "suma de los numeros de  una fila"
                + "\nc  -" + "sume de los numeros de una columna"
                + "\nd - " + "sumar diagonal principal"
                + "\ne-" + "sumar diagonal inversa"
                + "\nf-" + "la media de todos los valores de la mtriz"
                + "\nsalir");

        return menu;

    }

    public static void prom(int[][] arraybidimensional) {
        int suma3 = 0;
        for (int x = 0; x < arraybidimensional.length; x++) {
            for (int i = 0; i < arraybidimensional[x].length; i++) {
                suma3 += arraybidimensional[x][i];
            }
        }
        int prom = suma3 / 16;
        JOptionPane.showMessageDialog(null, "promedio" + prom);

    }

}
