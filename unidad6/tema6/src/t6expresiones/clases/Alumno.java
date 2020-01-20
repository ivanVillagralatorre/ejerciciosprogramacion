/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6expresiones.clases;

/**
 *
 * @author 1gdaw04
 */
public class Alumno {

    private String codAlumno;
    private String nombre;
    private String domicilio;
    private String telefono;
    private String edad;
    private String sexo;
    private String fecha_nac;
    private String correoPersonal;
    private String correoClase;
    private String paginaWeb;
    private String Curso;

    public Alumno() {
    }

    public Alumno(String codAlumno, String nombre, String domicilio, String telefono, String edad, String sexo, String fecha_nac, String correoPersonal, String correoClase, String Curso) {
        this.codAlumno = codAlumno;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.edad = edad;
        this.sexo = sexo;
        this.fecha_nac = fecha_nac;
        this.correoPersonal = correoPersonal;
        this.correoClase = correoClase;
        this.Curso = Curso;
    }

    public String getCodAlumno() {
        return codAlumno;
    }

    public void setCodAlumno(String codAlumno) {
        this.codAlumno = codAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getCorreoPersonal() {
        return correoPersonal;
    }

    public void setCorreoPersonal(String correoPersonal) {
        this.correoPersonal = correoPersonal;
    }

    public String getCorreoClase() {
        return correoClase;
    }

    public void setCorreoClase(String correoClase) {
        this.correoClase = correoClase;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    @Override
    public String toString() {
        return "Agenda{" + "codAlumno=" + codAlumno + ", nombre=" + nombre + ", domicilio=" + domicilio + ", telefono=" + telefono + ", edad=" + edad + ", sexo=" + sexo + ", fecha_nac=" + fecha_nac + ", correoPersonal=" + correoPersonal + ", correoClase=" + correoClase + ", paginaWeb=" + paginaWeb + ", Curso=" + Curso + '}';
    }

}
