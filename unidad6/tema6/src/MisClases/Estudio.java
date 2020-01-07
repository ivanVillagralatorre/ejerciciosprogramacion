
import java.util.ArrayList;
import java.util.Date;

public class Estudio {

    private String nombre;
    private String ciudad;
    private String direccion;
    private String dirWeb;
    // LocalDate
    private Date fechaFundacion;
    private String pais;
    private ArrayList<String> telefonos;
    private ArrayList<Pelicula> lista;

    public ArrayList<Pelicula> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Pelicula> lista) {
        this.lista = lista;
    }

    // Estudio NO se relaciona con película
    // nuevoEstudio
    // Constructor sobrecargado
    public Estudio() {
    }

    public Estudio(String nombre, String ciudad, String direccion, String dirWeb, Date fechaFundacion, String pais, ArrayList<String> telefonos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.dirWeb = dirWeb;
        this.fechaFundacion = fechaFundacion;
        this.pais = pais;
        this.telefonos = telefonos;
        this.lista = lista;
    }

    // Métodos set y get 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDirWeb() {
        return dirWeb;
    }

    public void setDirWeb(String dirWeb) {
        this.dirWeb = dirWeb;
    }

    public Date getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(Date fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<String> telefonos) {
        this.telefonos = telefonos;
    }

    // Resto de métodos
    public void modificarEstudio() {
    }

    public void cierraEstudio() {
    }

    public Estudio[] despliegueEstudio() {
        return null;
    }

    public void setPeliculas(Pelicula aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPelicula(Pelicula p) {
        lista.add(p);
    }
}
