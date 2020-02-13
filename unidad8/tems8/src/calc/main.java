/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

/**
 *
 * @author 1gdaw04
 */
public class main {
    public static ventana v = new ventana();
    public static void main(String[]args){
 
    v.setVisible(true);
    }
    
    public static void salir(){
       v.dispose();
     System.exit(0);}
}
