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
public class ej11 {

    public static void main(String[] args) {
        boolean apagar = false;
        int menu = 0;
        String[][] nombre = new String[4][4];
        double[][] precio = new double[4][4];
        int[][] can = new int[4][4];
      arrais( nombre, precio, can);
       

        do {

            menu = menu();
          switchh(apagar,  menu, nombre, precio, can);
        } while (menu!=3);

    }

    public static void arrais(String[][] nombre,double[][] precio, int[][] can) {
        nombre[0][0] = "kitkat";
        nombre[0][1] = "chicles de fresa";
        nombre[0][2] = "lacasitos";
        nombre[0][3] = "palotes";
        nombre[1][0] = "kinder bueno";
        nombre[1][1] = "haribo";
        nombre[1][2] = "chetos";
        nombre[1][3] = "twins";
        nombre[2][0] = "kbuennono";
        nombre[2][1] = "m&m";
        nombre[2][2] = "papadelta";
        nombre[2][3] = "chicles de menta";
        nombre[3][0] = "lacasitos";
        nombre[3][1] = "crunch";
        nombre[3][2] = "milkybar";
        nombre[3][3] = "barra chocolate generica";

        precio[0][0] = 1.1;
        precio[0][1] = 0.8;
        precio[0][2] = 1.5;
        precio[0][3] = 0.9;
        precio[1][0] = 1.8;
        precio[1][1] = 1;
        precio[1][2] = 1.2;
        precio[1][3] = 1;
        precio[2][0] = 1.8;
        precio[2][1] = 1.3;
        precio[2][2] = 1.2;
        precio[2][3] = 0.8;
        precio[3][0] = 1.5;
        precio[3][1] = 1.1;
        precio[3][2] = 1.1;
        precio[3][3] = 1.1;

        can[0][0] = 5;
        can[0][1] = 5;
        can[0][2] = 5;
        can[0][3] = 5;
        can[1][0] = 5;
        can[1][1] = 5;
        can[1][2] = 5;
        can[1][3] = 5;
        can[2][0] = 5;
        can[2][1] = 5;
        can[2][2] = 5;
        can[2][3] = 5;
        can[3][0] = 5;
        can[3][1] = 5;
        can[3][2] = 5;
        can[3][3] = 5;

    }

    public static int menu() {

        int opcion = Integer.parseInt(JOptionPane.showInputDialog("\n0-" + "Pedir golosina"
                + "\n1-" + "mostrar golosinas"
                + "\n2-" + "rellenar golosinas"
                + "\n3-" + "apagar maquina"));

        return opcion;

    }

    public static void switchh(boolean apagar, int menu,String[][] nombre,double[][] precio,int[][] can) {

        switch (menu) {

            case 0:  String codigo=JOptionPane.showInputDialog("introduce el codigo");
                    int fila=Integer.parseInt(Character.toString(codigo.charAt(0)));
                    int columna=Integer.parseInt(Character.toString(codigo.charAt(1)));
                    
                   
                    can[fila][columna]= can[fila][columna]-1;
                    
                     if(can[fila][columna]==0){
                     JOptionPane.showMessageDialog(null,"el producto se ha agotado" );
                     }
                     else
                   JOptionPane.showMessageDialog(null,"Has pedido la golosina:"+"    "+nombre[fila][columna]+
                                                "a un precio de  " + "   "+precio[fila][columna]+"€");
                   
                break;
            case 1:
                String res="";
                for(int x=0;x<nombre.length;x++)
                   { for(int y=0;y<nombre[x].length;y++)
                {res+="\n"+"producto"+" "+nombre[x][y]+"precio:"+"  "+precio[x][y]+"cantidad "+"  "+" "+can[x][y] ;
                }}
                
                JOptionPane.showMessageDialog(null,"\n"+"PRODUCTOS"+"\n"+res);
                
                
                break;
            
                case 2: String pass=JOptionPane.showInputDialog("contraseña");
                        if(pass.equals("maquinaexpendedora2019"))
                            
                        { String cod=JOptionPane.showInputDialog("introduce el codigo del producto que quieres rellenar");
                           int fil=Integer.parseInt(Character.toString(cod.charAt(0)));
                           int col=Integer.parseInt(Character.toString(cod.charAt(1)));
                           
                          int c= Integer.parseInt(JOptionPane.showInputDialog("cuanta cantidad quieres añadir"));
                          
                          can[fil][col]+=c;
                       
                        }
                        else{JOptionPane.showMessageDialog(null,"contraseña incorrecta");}
                
                break;

            

        }

    }

}
