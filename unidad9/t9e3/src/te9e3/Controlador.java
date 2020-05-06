
package t9p1e34;

import GUI.VentanaAcontecimientos;
import GUI.VentanaPrincipal;
import Modelo.BD.*;
import Modelo.UML.Acontecimiento;
import java.time.LocalDate;
import java.time.LocalTime;

public class Controlador {

    private static AcontecimientoBD abd;
    private static GenericoBD bdCon;
    private static Acontecimiento acontecimiento;
    
    private static VentanaPrincipal vp;
    private static VentanaAcontecimientos ve;
    
    public static void main(String[] args) {      
        try
        {
            bdCon = new GenericoBD();
            bdCon.abrirBD();
            abd = new AcontecimientoBD(bdCon.getCon());
            
            vp = new VentanaPrincipal();
            vp.setVisible(true);
         }
        catch(Exception e)
        {
             System.out.println("Problemas en el main");
        }
    }
    
    public static void visualizarVentanaAlta(){
        // Dejo por debajo la principal
         ve = new VentanaAcontecimientos("alta");
         ve.setVisible(true);
    }
    
   public static void visualizarVentanaEliminar(){
         // Dejo por debajo la principal
         ve = new VentanaAcontecimientos("baja");
         ve.setVisible(true);
   }
   
   public static void visualizarVentanaEditar(){
         // Dejo por debajo la principal
         ve = new VentanaAcontecimientos("modificacion");
         ve.setVisible(true);
   }
    
    public static void volver(javax.swing.JFrame v){
        v.dispose();
    }
    
    public static void grabarAcontecimiento(String nombre, String lugar, LocalDate localDate, LocalTime localTimeInicio, LocalTime localTimeFin, int nro) throws Exception{
        // Crear objeto e insertarlo en la base de datos
        acontecimiento = new Acontecimiento(nombre,lugar, localDate,localTimeInicio,localTimeFin,nro);
        abd.alta(acontecimiento);
    }
    
    public static void buscarAcontecimiento(String nombre) throws Exception
    {
       acontecimiento =  abd.consultaPorNombre(nombre);
    }
    
    public static String getLugar(){
        return acontecimiento.getLugar();
    }
    
     public static String getFecha(){
        return acontecimiento.getFecha().toString();
    }
     
      public static String getHoraInicio(){
        return acontecimiento.getHoraI().toString();
    }
      
       public static String getHoraFin(){
        return acontecimiento.getHoraF().toString();
    }
       
        public static String getAforo(){
        return acontecimiento.getAforo().toString();
    }
     
   public static void terminar() throws Exception{
       bdCon.cerrarBD();
       System.exit(0);
   }
   
   public static void borrarAcontecimiento() throws Exception{
       abd.baja(acontecimiento.getNombre());
   }
   
    public static void modificarAcontecimiento(String lugar, LocalDate localDate, LocalTime localTimeInicio, LocalTime localTimeFin, int nro) throws Exception
    {
        acontecimiento.setLugar(lugar);
        acontecimiento.setFecha(localDate);
        acontecimiento.setHoraI(localTimeInicio);
        acontecimiento.setHoraF(localTimeFin);
        acontecimiento.setAforo(nro);
        abd.modificar(acontecimiento);
    }
    
}
