package t5p1e2;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import Excepciones.*;

public class T5p1e2 {
    
    private static String[] todosIdiomas; // array para validar el idioma
    private static String[] todosNiveles; // array para validar el nivel.
    private static ArrayList<ArrayList<Integer>> alumnos; // ArrayList que contendrá el número de alumnos por idioma y nivel
    private static ArrayList<String> idiomas; // ArrayList con los idiomas que se imparten este curso.
    private static ArrayList<ArrayList<String>> niveles; // ArrayList con los niveles por idioma que se impartirán este curso.

    public static void main(String[] args) {
        try{
            crearEstructuras();
            entradaDatos();
            listados();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas " + e.getMessage());
        }
    }
    
    public static void crearEstructuras() throws Exception{
        todosIdiomas=new String[4];
        todosIdiomas[0] = "Inglés";
        todosIdiomas[1] = "Francés";
        todosIdiomas[2] = "Alemán";
        todosIdiomas[3] = "Ruso";
        
        todosNiveles = new String[3];
        todosNiveles[0] = "Básico";
        todosNiveles[1] = "Medio";
        todosNiveles[2] = "Perfeccionamiento";
        
        alumnos = new ArrayList();
        idiomas = new ArrayList();
        niveles = new ArrayList();
        
        // Ojo que la segunda dimensión en el caso de los alumnos y niveles no está creada.
    }

    public static void entradaDatos() throws Exception{
        boolean correcto;
        do
        {
            do
            {
                String idioma = introducirDato("idioma", todosIdiomas);
                String nivel = introducirDato("nivel", todosNiveles);

                correcto = introducirAlumnos(idioma,nivel);
            }
            while(!correcto);
            
        }
        while(JOptionPane.showConfirmDialog(null, "¿ Quieres continuar?")==0);
    }
    
    public static String introducirDato(String dato, String[] array) throws Exception{
        //  String idioma = introducirDato("idioma", todosIdiomas);
        // String nivel = introducirDato("nivel", todosNiveles);
        boolean correcto;
        String datoEntrada="";
        do
        {
            try
            {
                datoEntrada = JOptionPane.showInputDialog("Teclea un " + dato);
                // Convierto el array en arrayList para usar el contains
                if (!Arrays.asList(array).contains(datoEntrada))
                    throw new DatoNoValidoException();
                correcto = true;
            }
            catch(DatoNoValidoException e)
            {
                JOptionPane.showMessageDialog(null, dato + " no válido");
                correcto = false;
            }
        }
        while(!correcto);
        return datoEntrada;
    }

    public static boolean introducirAlumnos(String idioma, String nivel)
    {
            boolean correcto;
            try
            {
                int posIdioma,posNivel;
                if (!idiomas.isEmpty())
                {
                    // Si ya hay algún idioma busco
                    posIdioma= idiomas.indexOf(idioma);
                    if (posIdioma== -1)
                    {
                        // Añadir el idioma al final
                        idiomas.add(idioma);
                        posIdioma = idiomas.size() - 1;
                        // Añadir el nivel tras crear la segunda dimensión
                        niveles.add(new ArrayList());
                        niveles.get(niveles.size()-1).add(nivel);
                        
                        alumnos.add(new ArrayList());
                        
                    }
                    else
                    {
                        // El idioma y la fila existen.
                        // ¿ El nivel?
                        posNivel = niveles.get(posIdioma).indexOf(nivel);
                        if (posNivel == -1)
                        {
                            niveles.get(posIdioma).add(nivel);
                        }
                        else
                            throw new DatoNoValidoException();
                    }
                }
                else
                {
                    // Es el primer idioma
                    posIdioma = 0;
                    // Guardamos el idioma
                    idiomas.add(idioma);
                    // Guardamos el nivel
                    niveles.add(new ArrayList());
                    niveles.get(0).add(nivel);
                    alumnos.add(new ArrayList());
                }
                int nroAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Indica el número de alumnos"));
                // Guardamos alumnos
                alumnos.get(posIdioma).add(nroAlumnos);
                correcto = true;
            }
            catch(DatoNoValidoException e)
            {
                JOptionPane.showMessageDialog(null,"Ya has indicado alumnos para ese idioma y nivel");
                correcto = false;
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"Problemas con el tipo de dato");
                correcto = false;
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Problemas");
                correcto = false;
            }
        return correcto;
    }
    public static void listados() throws Exception{
        String datos = "";
        for (int x = 0; x < alumnos.size(); x++)
        {
            datos += "Idioma: " + idiomas.get(x) + "\n";
            for ( int y = 0; y < niveles.get(x).size(); y++)
                datos += "Nivel: "+ niveles.get(x).get(y) + " " + alumnos.get(x).get(y) + "\n";
        }
        JOptionPane.showMessageDialog(null, datos);
        
        // Totales por idioma
        datos = "";
        for(int x = 0; x < idiomas.size(); x++)
        {
             datos += "Idioma: " + idiomas.get(x) + " Total alumnos: ";
             int suma = 0;
             for (int y = 0; y < alumnos.get(x).size(); y++)
                 suma += alumnos.get(x).get(y);
             datos += suma + "\n";
        }
        JOptionPane.showMessageDialog(null, datos);
        
        // Totales por nivel
        datos = "";
        for(int x = 0; x < todosNiveles.length; x++)
        {
             datos += "Nivel: " + todosNiveles[x] + " Total alumnos: ";
             int suma = 0;
             for(int z = 0;z < niveles.size(); z++){
                   int y = niveles.get(z).indexOf(todosNiveles[x]);
                   if (y != -1){
                       suma += alumnos.get(z).get(y);
                   }
          }
           datos += suma + "\n";
    }
    JOptionPane.showMessageDialog(null, datos);
    }
}
