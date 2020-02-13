/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;
import Clases.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author 1gdaw04
 */
public class t7ej1 {

    private static ArrayList<Persona> listp;
    private static ArrayList<Vehiculo> v;

    public static void main(String[] args) {
        listp = new ArrayList();
        v = new ArrayList();
        do {
            crearpersona();

            do {

                vehiculo(listp.get(listp.size() - 1));

            } while ((JOptionPane.showConfirmDialog(null, "¿Quieres ingresar otro vehiculo?") != 1));

            listp.get(listp.size() - 1).setLista(v);

        } while (JOptionPane.showConfirmDialog(null, "¿Quieres ingresar otro cliente?") != 1);
        mostrar();
    }

    public static void mostrar() {
        int opcion = 0;
        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog("que opcion quieres:"
                    + "\n-1" + "- Nombre de las personas con mas de un vehıculo."
                    + "\n-2" + "-  Nombre de la persona que mas vehıculos tiene."
                    + "\n-3" + "-  Nombre con las personas con mas motos."
                    + "\n-4" + "-  Nombre con las personas con mas motos."
                    + "\n-5" + "- Nombre con las personas con mas motos."
                    + "\n-6" + "- Salir"));

            switch (opcion) {
                case 1:
                    int i;
                    String resultado = "";
                    for (i = 0; i < listp.size() && listp.get(i).getLista().size() >= 2; i++) {
                        resultado += "\n-" + listp.get(i).getNombre();
                    }
                 
                     //listp.stream().filter(p -> p.getLista().size()>1).forEach(p -> System.out.print(p.getNombre())); //
                    


                    JOptionPane.showConfirmDialog(null, resultado);

                    break;
                case 2:
                    int y;
                    int max = -1;
                    Persona pmax2 = null;
                    String np = "";
                    for (Persona p  : listp) {
                        if (p.getLista().size()>max) 
                        {
                            max = p.getLista().size();
                            pmax2 = p;
                        }
                     // 
                     //Optional<Persona> pmax = listp.stream().max(Comparator.comparingInt(p -> p.getLista().size()));
                    }

                    JOptionPane.showConfirmDialog(null, pmax2);

                    break;
                   
                case 3: 
              
 
                    

                    break;
                case 4:
                    int count = 0;
                    for (int x = 0; x < listp.size(); x++) {
                        for (int u = 0; u < listp.get(x).getLista().size(); u++) {
                            Moto mot = (Moto) listp.get(x).getLista().get(u);

                            if (mot.getMarca().equals("Ducate")) {
                                count += 1;
                            }

                        }
                    }

                    JOptionPane.showConfirmDialog(null, count + "  " + "es el numero de personas con una ducate");

                    break;
                case 5:
                    listp.stream().sorted(Comparator.comparing(p -> p.getNombre())).forEach(p-> System.out.print(p.getNombre()));

                    break;

            }
        } while (opcion != 6);

    }

    public static void crearpersona() {
        Persona p = new Persona();
        p.setDni(validardni());
        p.setNombre(validarnombre());
        p.setApellido(apellido());
        p.setDireccion(direccion());
        p.setTelefono(telfono());

        listp.add(p);

    }

    public static void vehiculo(Persona p) {

        String pre = JOptionPane.showInputDialog("que tipo de vehiculo").toLowerCase();

        switch (pre) {
            case "camion":
                Camion c1 = new Camion();
                c1.setMarca(validarmarcacamion());
                c1.setMatricula(matricula());
                c1.setP(p);
                v.add(c1);

                break;

            case "coche":
                Coche co1 = new Coche();
                co1.setMarca(validarmarcacoche());
                co1.setMatricula(matricula());
                co1.setP(p);
                v.add(co1);

                break;

            case "moto":
                Moto m1 = new Moto();
                m1.setMarca(validarmarcamoto());
                m1.setMatricula(matricula());
                m1.setP(p);
                v.add(m1);

                break;

        }

    }

    public static String matricula() {
        boolean r = false;
        String matricula = "";
        do {
            try {
                matricula = JOptionPane.showInputDialog("inserta numero de matricula");
                final String matricula2 = matricula;
                Pattern p = Pattern.compile("[0-9]{4}[A-Z]{3}");
                Matcher m = p.matcher(matricula);

                if (!m.matches()) {
                    r = false;
                    throw new DataoNovalido();
                } else if (v.stream().anyMatch(ve -> ve.getMatricula().equals(matricula2))) {
                    r = false;
                    throw new DataoNovalido();
                } else {
                    r = true;
                }

            } catch (DataoNovalido a) {
                JOptionPane.showConfirmDialog(null, "dato no valido");
            }
        } while (r != true);
        return matricula;
    }

    public static Camenum validarmarcacamion() {
        boolean r = false;
        String marca = "";
        do {
            try {
                marca = JOptionPane.showInputDialog("inserta el nombre de la marca de camion");

                Pattern p = Pattern.compile("(Scania)|(Man)|(Volvo)|(Mercedes)");
                Matcher m = p.matcher(marca);

                if (!m.matches()) {
                    r = false;
                    throw new DataoNovalido();
                } else {
                    r = true;
                }

            } catch (DataoNovalido a) {
                JOptionPane.showConfirmDialog(null, "dato no valido");
            }
        } while (r != true);
        return Camenum.valueOf(marca);

    }

    public static Cenum validarmarcacoche() {
        boolean r = false;
        String marca = "";
        do {
            try {
                marca = JOptionPane.showInputDialog("inserta el nombre de la marca de coche");

                Pattern p = Pattern.compile(" (Audi)|(BMW)|(Renault)|(Hyundai)|(Citroen)");
                Matcher m = p.matcher(marca);

                if (!m.matches()) {
                    r = false;
                    throw new DataoNovalido();
                } else {
                    r = true;
                }

            } catch (DataoNovalido a) {
                JOptionPane.showConfirmDialog(null, "dato no valido");
            }
        } while (r != true);
        return Cenum.valueOf(marca);

    }

    public static Menum validarmarcamoto() {
        boolean r = false;
        String marca = "";
        do {
            try {
                marca = JOptionPane.showInputDialog("inserta el nombre de la marca de moto");

                Pattern p = Pattern.compile("(Kawasaki)|(Ducate)|(HarleyDavidson)");
                Matcher m = p.matcher(marca);

                if (!m.matches()) {
                    r = false;
                    throw new DataoNovalido();
                } else {
                    r = true;
                }

            } catch (DataoNovalido a) {
                JOptionPane.showConfirmDialog(null, "dato no valido");
            }
        } while (r != true);
        return Menum.valueOf(marca);

    }

    public static String validarnombre() {
        boolean r = false;
        String nombre = "";
        do {
            try {
                nombre = JOptionPane.showInputDialog("inserta el nombre");

                Pattern p = Pattern.compile("([A-Z][a-z]+ ?){1,2}");
                Matcher m = p.matcher(nombre);

                if (!m.matches()) {
                    r = false;
                    throw new DataoNovalido();
                } else {
                    r = true;
                }

            } catch (DataoNovalido a) {
                JOptionPane.showConfirmDialog(null, "dato no valido");
            }
        } while (r != true);
        return nombre;
    }

    public static String validardni() {
        boolean r = false;
        String dni = "";
        do {
            try {
                dni = JOptionPane.showInputDialog("inserta el dni");
                final String dni2 = dni;

                Pattern p = Pattern.compile("[0-9]{8}[A-Z]");
                Matcher m = p.matcher(dni);

                if (!m.matches()) {
                    r = false;
                    throw new DataoNovalido();
                } else if (listp.stream().anyMatch(pe -> pe.getDni().equals(dni2))) {
                    r = false;
                    throw new DataoNovalido();
                } else {
                    r = true;
                }

            } catch (DataoNovalido a) {
                JOptionPane.showConfirmDialog(null, "dato no valido");
            }

        } while (r != true);
        return dni;
    }

    public static String apellido() {
        boolean r = false;
        String ape = "";
        do {
            try {
                ape = JOptionPane.showInputDialog("inserta el apellido");

                Pattern p = Pattern.compile("([A-Z][a-z]+ ?){1,2}");
                Matcher m = p.matcher(ape);

                if (!m.matches()) {
                    r = false;
                    throw new DataoNovalido();
                } else {
                    r = true;
                }

            } catch (DataoNovalido a) {
                JOptionPane.showConfirmDialog(null, "dato no valido");
            }
        } while (r != true);
        return ape;
    }

    public static String direccion() {
        boolean r = false;
        String dir = "";
        do {
            try {
                dir = JOptionPane.showInputDialog("inserta la direccion");

                Pattern p = Pattern.compile("calle [A-Za-z]+ [1-9]{1,3}");
                Matcher m = p.matcher(dir);

                if (!m.matches()) {
                    r = false;
                    throw new DataoNovalido();
                } else {
                    r = true;
                }

            } catch (DataoNovalido a) {
                JOptionPane.showConfirmDialog(null, "dato no valido");
            }
        } while (r != true);
        return dir;
    }

    public static String telfono() {
        boolean r = false;
        String tel = "";
        do {
            try {
                tel = JOptionPane.showInputDialog("inserta el tlfno");

                Pattern p = Pattern.compile("^(6[0-9]{6})|(7[0-9]{6})|(945[0-9]{6})$");
                Matcher m = p.matcher(tel);

                if (!m.matches()) {
                    r = false;
                    throw new DataoNovalido();
                } else {
                    r = true;
                }

            } catch (DataoNovalido a) {
                JOptionPane.showConfirmDialog(null, "dato no valido");
            }
        } while (r != true);
        return tel;
    }

}
