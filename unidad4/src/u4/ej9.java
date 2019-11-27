/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u4;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw04
 */
public class ej9 {

    public static void main(String[] args) throws Exception {
        int[] productos = {10, 23, 30, 47, 55, 65, 135, 256, 526, 663};
        int[] unidades = new int[10];
        int eleccion;
        String res = "";
        String pregunta = "";
        int suma;
        int v = 0;
	int b =0;

        do {
            try {

                eleccion = ele(productos);

                fun1(productos, eleccion, unidades);

                pregunta = pregunta();

            } catch (NullPointerException a){JOptionPane.showMessageDialog(null, "salida");}
            catch (Exception e) {
                JOptionPane.showConfirmDialog(null, "error generico");
            }
        } while (!pregunta.equals("no"));

        for (int x = 0; x < arrayUnidades.length - 1; x++)
            {
                for (int y = x+1 ;y <unidades.length; y++)
                {
                        if (unidades[x] < unidades[y])
                        {
                          v = unidades[x];
                          unidades[x] = unidades[y];
                         unidades[y] = v ;

                          b  = productos[x];
                          productos[x] = productos[y];
                          productos[y] = b;                  
                        }
                }
             }

        res = resultado(productos, unidades);
        JOptionPane.showMessageDialog(null, res);

     
    }

    public static int ele(int[] productos) throws Exception {
        String menu="";
        int ele = 0;
        for (int x = 0; x < productos.length; x++) {
            menu+= "\n" + productos[x];
 
        }
        
        ele=Integer.parseInt(JOptionPane.showInputDialog("\n"+"NUMERO DE PRODUCTOS"+menu));
        return ele;
    }

    public static void fun1(int[] productos, int eleccion, int[] unidades) throws Exception {
        for (int x = 0; x < productos.length; x++) {
            if (eleccion == productos[x]) {
                unidades[x] += Integer.parseInt(JOptionPane.showInputDialog("cuantas unidades vendidas"));

            }
        }

    }
    
     public static String pregunta()throws Exception
     {String  pregu = JOptionPane.showInputDialog(null, "¿Quieres continuar?");
     return pregu;}

    public static String resultado(int[] productos, int[] unidades) throws Exception {
        String resu = "";
        for (int l = 0; l < productos.length; l++) {
            resu += "\n" + "Producto:" + productos[l] + "   " + "   " + "vendidos:" + "  " + unidades[l];
        }
        return resu;

    }

 public static void ordeb()
 {;}


}
