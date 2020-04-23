
package t9p1e2;

import base.aconbd;
import base.gbd;

import GUI.VentanaPrincipal;
import clases.acon;
import java.time.LocalDate;
import java.time.LocalTime;

public class Controlador {

    private static aconbd abd;
    private static gbd bdCon;
    private static acon acontecimiento;
    
    private static VentanaPrincipal vp;

    
    public static void main(String[] args) {      
        try
        {
            bdCon = new gbd();
            bdCon.abrirBD();
            abd = new aconbd(bdCon.getCon());
            
            vp = new VentanaPrincipal();
            vp.setVisible(true);
         }
        catch(Exception e)
        {
             System.out.println("Problemas en el main");
        }
    }
    
  
    
    public static void volver(javax.swing.JFrame v){
        v.dispose();
    }
    
    public static void grabarAcontecimiento(String nombre, String lugar, LocalDate localDate, LocalTime localTimeInicio, LocalTime localTimeFin, int nro) throws Exception{
        // Crear objeto e insertarlo en la base de datos
        acontecimiento = new acon(nombre,lugar, localDate,localTimeInicio,localTimeFin,nro);
        
        abd.alta(acontecimiento);
    }
    
   public static void terminar() throws Exception{
       bdCon.cerrarBD();
       System.exit(0);
   }
    
}
