/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Modelo.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nieves
 */
public class Controlador extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
       String fecha=request.getParameter("fecha");
       
       // Convertir a LocalDate
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
      LocalDate f = LocalDate.parse(fecha, formatter);
       
       String franjaHoraria = request.getParameter("franja");
       
       // ¿ Hay sitio? Máximo diez personas por franja y día
       boolean hayCapacidad = comprobarCapacidad(f,franjaHoraria,Integer.parseInt(request.getParameter("comensales")));
       if (hayCapacidad)
       {
           // Si hay sitio. Guardamos la reserva
            Reserva r = new Reserva(f,franjaHoraria,Integer.parseInt(request.getParameter("comensales")),request.getParameter("color"),request.getParameter("demandas"));
            listaReservas.add(r);
            
            // Cliente nuevo?
            String telefono = request.getParameter("telefono");
            if (hayCliente(telefono))
            {
                // Añadir reserva. Relación Bidireccional
                c.setReserva(r);
                r.setC(c);
            }
            else
            {
                // Crear cliente y relacionar
                c= new Cliente(request.getParameter("nombre"),request.getParameter("email"),request.getParameter("telefono"));
                c.setReserva(r);
                r.setC(c);
                listaClientes.add(c);
            }
            
            // Mostrar reserva confirmada
                     response.setContentType("text/html;charset=UTF-8");
                       try (PrintWriter out = response.getWriter()) {
                       /* TODO output your page here. You may use following sample code. */
                       out.println("<!DOCTYPE html>");
                       out.println("<html>");
                       out.println("<head>");
                       out.println("<title>Enhorabuena</title>");            
                       out.println("</head>");
                       out.println("<body>");
                       out.println("<h1>Reserva realizada con éxito </h1>");
                       out.println("</body>");
                       out.println("</html>");
                   }
       }
       else
       {
           // No hay sitio. Mensaje de no reserva
                        response.setContentType("text/html;charset=UTF-8");
                       try (PrintWriter out = response.getWriter()) {
                       /* TODO output your page here. You may use following sample code. */
                       out.println("<!DOCTYPE html>");
                       out.println("<html>");
                       out.println("<head>");
                       out.println("<title>Lo sentimos</title>");            
                       out.println("</head>");
                       out.println("<body>");
                       out.println("<h1>El local está lleno. Elige otro día u otra franja horaria </h1>");
                       out.println("</body>");
                       out.println("</html>");
                   }
           
       }
       
    }
    
    private boolean comprobarCapacidad(LocalDate f, String franjaHoraria,int comensales){
        int x,nro=comensales;
        for(x=0; x < listaReservas.size() && nro <=10;x++)
        {
            if (listaReservas.get(x).getFecha().isEqual(f) && listaReservas.get(x).getFranjaHoraria().equals(franjaHoraria))
                nro += listaReservas.get(x).getComensales();
        }
        if (nro >10)
            return false;
        
        return true;
    }
    
     private boolean hayCliente(String telefono){
         int x;
         for(x = 0; x < listaClientes.size() && !listaClientes.get(x).getTelefono().equals(telefono);x++){}
         if (x == listaClientes.size())
             return false;
         c=listaClientes.get(x);
        return true;
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    // Variables globales
    private ArrayList<Reserva> listaReservas=new ArrayList();
    private ArrayList<Cliente> listaClientes = new ArrayList();
    private Cliente c;
    

}
