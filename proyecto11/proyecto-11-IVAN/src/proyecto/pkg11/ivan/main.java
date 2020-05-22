/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg11.ivan;

import BD.TablaClientes;
import BD.conexionbd;
import javax.swing.JOptionPane;
import modelo.Cliente;
import ventanas.*;
import ventanas.Ventanareservas;

/**
 *
 * @author iv
 */
public class main {

    /**
     * @param args the command line arguments
     */
    private static int random = (int) (Math.random() * 9999);
    private static conexionbd bd;
    private static TablaClientes tc;
    private static Ventanaprincipal vp;
    private static Ventanareservas vr;
    private static VentanaClientes vc;
    private static VentanaClienteBorrar vcb;
    private static String dnivalidar = null;
    private static Cliente c;
    
    

    public static void main(String[] args) throws Exception {
        try {
            bd = new conexionbd();
            bd.conectar();
            tc = new TablaClientes(bd.getCon());
            Vprincipal();
           ingresarcliente(c);
         Borrarcliente(c);
        } catch (Exception e) {
               System.out.print(e);
        }

      

    }

    public static void Vprincipal() {

        vp = new Ventanaprincipal();
        vp.setVisible(true);
        vc.dispose();
        vr.dispose();
    }

    public static void VClientesinsertar() {
        vp.dispose();
        vc = new VentanaClientes();
        vc.setVisible(true);
        vc.VisibleInsertar();

    }
    
    public static void Vclientesborrar() {
        vp.dispose();
        vcb = new VentanaClienteBorrar();
        vcb.setVisible(true);
    
    }
     public static void Vclientesborrarcerrar() {
        vcb.dispose();
    }

    public static void Vreservas() {
        vp.dispose();
        vr = new Ventanareservas();
        vr.setVisible(true);
    }

    
    
    public static Cliente buscarDni(String dnivalidar) throws Exception {
        Cliente c = tc.BuscarClie(dnivalidar);
        return c;
    }

    public static void ingresarcliente(Cliente c) throws Exception {
       try{
       
       tc.insertar(c);
       JOptionPane.showMessageDialog(null, "Insertado de forma correcta");
       }catch(Exception e){JOptionPane.showConfirmDialog(null,"fallo inexplicable");} 

    }
    
     public static void Borrarcliente(Cliente c) throws Exception {
       try{
       tc.borrar(c);
       JOptionPane.showMessageDialog(null, "Se ha borrado exitosamente el usuario con dni: "+c.getDni());
       }catch(Exception e){JOptionPane.showConfirmDialog(null,"fallo inexplicable");} 

    }

}
