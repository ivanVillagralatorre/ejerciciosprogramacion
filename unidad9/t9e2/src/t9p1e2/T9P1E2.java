/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t9p1e2;

/**
 *
 * @author iv
 */
public class T9P1E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static void volver(javax.swing.JFrame v){
        v.dispose();
    }
    
    public static void grabarAcontecimiento(String nombre, String lugar, LocalDate localDate, LocalTime localTimeInicio, LocalTime localTimeFin, int nro) throws Exception{
        // Crear objeto e insertarlo en la base de datos
        acontecimiento = new Acontecimiento(nombre,lugar, localDate,localTimeInicio,localTimeFin,nro);
        
        AcontecimientoBD.alta(acontecimiento);
    }
    
}
