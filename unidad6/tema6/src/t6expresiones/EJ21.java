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
public class EJ21 {

    private static String codAlumno;
    private static String nombre;
    private static String domicilio;
    private static String telefono;
    private static String edad;
    private static String sexo;
    private static String fecha_nac;
    private static String correoPersonal;
    private static String correoClase;
    private static String paginaWeb;
    private static String Curso;
    private static ArrayList agenda = new ArrayList();
    private static boolean fin = true;
    private static String pregunta;

    public static void main(String[] args) {
        
        do{

        Alumno a1 = new Alumno();

        checkear(a1);
          
        agenda.add(a1);
        
        for(int x=0;x<agenda.size();x++){
        JOptionPane.showConfirmDialog(null, agenda.get(x).toString());}
        
        pregunta=JOptionPane.showInputDialog("¿quieres añadir otro alumno a la agenda?");
        }while(pregunta!="no");

    }

    public static void checkear(Alumno a1) {
        Cod(a1);
        nom(a1);
        eda(a1);
        dom(a1);
        tel(a1);
        sex(a1);
        fn(a1);
        cc(a1);
        cp(a1);
        pw(a1);
        Cur(a1);

    }

    public static void Cod(Alumno a1) {
        do{
        codAlumno = JOptionPane.showInputDialog("codalu");
        Pattern pat = Pattern.compile("^[0-9]{5}$");
        Matcher mat = pat.matcher(codAlumno);

        if (mat.matches()) {
            a1.setCodAlumno(codAlumno);
            fin=true;
            
        } else {
            JOptionPane.showConfirmDialog(null, "dato incorrecto de cod alu");
            fin=false;
        }
        }while(fin!=true);
    }

    public static void eda(Alumno a1) {
        do{
        edad = JOptionPane.showInputDialog("EDAd");
        Pattern pat = Pattern.compile("^[0-4][0-9]");
        Matcher mat = pat.matcher(edad);

        if (mat.matches()) {
            a1.setEdad(edad);
            fin=true;
        } else {
            JOptionPane.showConfirmDialog(null, "dato incorrecto de cod alu");
            fin=false;
        }
        
    }while(fin!=true);
    }

    public static void nom(Alumno a1) {
        
        do{
        nombre = JOptionPane.showInputDialog("nombre");
        Pattern pat = Pattern.compile("^([A-Z][a-z]+[\\s]?){1,2}$");
        Matcher mat = pat.matcher(nombre);

        if (mat.matches()) {
            a1.setNombre(nombre);
            fin=true;
        } else {
            JOptionPane.showConfirmDialog(null, "dato incorrecto de nombre");
            fin=false;
        }
        }while(fin!=true);
    }

    public static void dom(Alumno a1) {
        
        do{
        
        domicilio = JOptionPane.showInputDialog("domicilio");
        Pattern pat = Pattern.compile("^calle[ ][a-z]{5,10}[ ][0-9]{1,3}$");
        Matcher mat = pat.matcher(domicilio);

        if (mat.matches()) {
            a1.setDomicilio(domicilio);
            fin=true;
        } else {
            JOptionPane.showConfirmDialog(null, "dato incorrecto de domicilio");
            fin=false;
        }
        
        }while(fin!=true);
    }

    public static void tel(Alumno a1) {
        do{
        telefono = JOptionPane.showInputDialog("telefono");
        Pattern pat = Pattern.compile("^(945[0-9]{6}|[6,7][0-9]{8})$");
        Matcher mat = pat.matcher(telefono);

        if (mat.matches()) {
            a1.setTelefono(telefono);
            fin=true;
        } else {
            JOptionPane.showConfirmDialog(null, "dato incorrecto de telefono");
            fin=false;
        }
        
        }while(fin!=true);
    }

    public static void sex(Alumno a1) {
        do{
        sexo = JOptionPane.showInputDialog("sexo");
        Pattern pat = Pattern.compile("[H,M,O]");
        Matcher mat = pat.matcher(sexo);

        if (mat.matches()) {
            a1.setSexo(sexo);
            fin=true;
        } else {
            JOptionPane.showConfirmDialog(null, "dato incorrecto de telefono");
            fin=false;
        }
        
        }while(fin!=true);
    }

    public static void fn(Alumno a1) {
        
        do{
        fecha_nac = JOptionPane.showInputDialog("fecha nacimiento");
        Pattern pat = Pattern.compile("^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$");
        Matcher mat = pat.matcher(fecha_nac);

        if (mat.matches()) {
            a1.setFecha_nac(fecha_nac);
            fin=true;
        } else {
            JOptionPane.showConfirmDialog(null, "dato incorrecto de fecha de nacimiento");
            fin=false;
        }
        }while(fin!=true);
    }

    public static void cp(Alumno a1) {
        do{
        correoPersonal = JOptionPane.showInputDialog("correoPersonal");
        Pattern pat = Pattern.compile("[A-Za-z]+@[a-z]{5,8}\\.[a-z]{2,3}");
        Matcher mat = pat.matcher(correoPersonal);

        if (mat.matches()) {
            a1.setCorreoPersonal(correoPersonal);
            fin=true;
        } else {
            JOptionPane.showConfirmDialog(null, "dato incorrecto de correo personal");
            fin=false;
        }
        }while(fin!=true);
    }

    public static void cc(Alumno a1) {
        do{
            
        correoClase = JOptionPane.showInputDialog("correo clasel");
        Pattern pat = Pattern.compile("[A-Za-z]*@ikasle\\.egibide.com");
        Matcher mat = pat.matcher(correoClase);

        if (mat.matches()) {
            a1.setCorreoClase(correoClase);
            fin=true;
        } else {
            JOptionPane.showConfirmDialog(null, "dato incorrecto de correo de clase");
            fin=false;
        }
        }while(fin!=true);
    }

    public static void pw(Alumno a1) {
        do{
        paginaWeb = JOptionPane.showInputDialog("pagina web");
        Pattern pat = Pattern.compile("www\\.[A-Za-z0-9]+\\.[a-z]{2,3}");
        Matcher mat = pat.matcher(paginaWeb);

        if (mat.matches()) {
            a1.setPaginaWeb(paginaWeb);
            fin=true;
        } else {
            JOptionPane.showConfirmDialog(null, "dato incorrecto de correo personal");
            fin=false;
        }
        
        }while(fin!=true);
    }

    public static void Cur(Alumno a1) {
        do{
        codAlumno = JOptionPane.showInputDialog("curso");
        Pattern pat = Pattern.compile("^[1-4][1-4][1-4][A-G][ABD]$");
        Matcher mat = pat.matcher(codAlumno);

        if (mat.matches()) {
            a1.setCurso(Curso);
            fin=true;
        } else {
            JOptionPane.showConfirmDialog(null, "dato incorrecto de correo personal");
            fin=false;
        }
        
        }while(fin!=true);
    }

}
