/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.ArrayList;
import Clasesbarajas.*;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author 1gdaw04
 */
public class T6p3e4 {

    private static ArrayList<Ciudad> lciudades = new ArrayList();
    private static ArrayList<Vuelo> lvuelos = new ArrayList();
    private static ArrayList<Avion> laviones = new ArrayList();
    private static ArrayList<Piloto> lpilotos = new ArrayList();
    private static ArrayList<Pasajero> lpasajeros = new ArrayList();
    private static ArrayList<Asiento> lasiento = new ArrayList();
   

    public static void main(String[] args) {

        Ciudad c1 = new Ciudad();
        Ciudad c2 = new Ciudad();
        c1.setCodigo_ciudad("10110");
        c1.setNombre("tenerife");
        c2.setCodigo_ciudad("12310");
        c2.setNombre("vitoria");
        lciudades.add(c1);
        lciudades.add(c2);

        Avion a1 = new Avion();
        Avion a2 = new Avion();
        

        a1.setAreolinia("rayanair");
        a1.setCodigo_de_avion("12b");
        a1.setNumero_de_asientos(30);
        a1.setCompartimientos("9b123");

        a2.setAreolinia("aireuropa");
        a2.setCodigo_de_avion("124a");
        a2.setNumero_de_asientos(30);
        a2.setCompartimientos("90b123");
        laviones.add(a1);
        laviones.add(a2);

        Piloto p1 = new Piloto();
        Piloto p2 = new Piloto();

        p1.setCod_piloto("123k");
        p1.setNombre("lucas");
        p1.setApellido("fernandez");
        p1.setNumero_licencia("f123223k");

        p2.setCod_piloto("223g");
        p2.setNombre("pedro");
        p2.setApellido("fernandez");
        p2.setNumero_licencia("f199993k");
        lpilotos.add(p1);
        lpilotos.add(p2);

        Asiento as1 = new Asiento();

        as1.setNumero_asiento(1);
        as1.setEstado(true);
        as1.setComportamiento("9b123");
        lasiento.add(as1);
        

        Pasajero pas1 = new Pasajero();
        pas1.setCedula("123edde");
        pas1.setNombre("pablo");
        pas1.setApellido("lopez");
        pas1.setA(as1);
        lpasajeros.add(pas1);
        
        LocalDate date =  LocalDate.now();
       
        
        Vuelo v1 = new Vuelo();
       v1.setNumero_de_vuelo(12);
       v1.setFecha_de_salida(date);
       v1.setHora_de_llegada("12.00");
       v1.setLugar_de_origen("francia");
       v1.setLugar_de_destino("vitoria");
       v1.setFecha_de_salida(date);
       v1.setFecha_de_regreso(date);
       v1.setTipo_de_vuelo("transantlantico");
       
       lvuelos.add(v1);
       
       
       

        
        
    }
    
    public static void relaciones(Asiento as1,Pasajero pas1)
    {as1.setP(pas1);
    
    
    
    }

}
