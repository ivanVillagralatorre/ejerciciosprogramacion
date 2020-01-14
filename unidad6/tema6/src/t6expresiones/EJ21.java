/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6expresiones;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import t6expresiones.clases.*;

/**
 *
 * @author 1gdaw04
 */
public class EJ20 {

    private static String codAlumno;
    private static String nombre;
    private static String domicilio;
    private static String telefono;
    private static int edad;
    private static String sexo;
    private static String fecha_nac;
    private static String correoPersonal;
    private static String correoClase;
    private static String paginaWeb;
    private static String Curso;
    private static ArrayList agenda = new ArrayList();

    public static void main(String[] args) {
        nombre = JOptionPane.showInputDialog("nombre");
        domicilio = JOptionPane.showInputDialog("domicilio");
        telefono = JOptionPane.showInputDialog("telefono");
        edad = Integer.parseInt(codAlumno = JOptionPane.showInputDialog("edad"));
        sexo = JOptionPane.showInputDialog("sexo");
        fecha_nac = JOptionPane.showInputDialog("fecha_nac");
        correoPersonal = JOptionPane.showInputDialog("correoPersonal");
        correoClase = JOptionPane.showInputDialog("correoClase");
        paginaWeb = JOptionPane.showInputDialog("paginaweb");
        Curso = JOptionPane.showInputDialog("paginaweb");
          Alumno a1 = new Alumno();
        
    }


       
    
    
    public static void Cod(Alumno a1) {
    codAlumno = JOptionPane.showInputDialog("codalu");
        Pattern pat = Pattern.compile("^[1-4][1-4][1-4][A-G][ABD]$");
        Matcher mat = pat.matcher(codAlumno);
        
        if(mat.matches())
        { a1.setCodAlumno(codAlumno);}
    } 
    

}
