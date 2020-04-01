/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Modelo.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    private ArrayList<Persona> listaPersonas;
    
    @Override
    public void init() throws ServletException{
        // Cuando un servidor carga un servlet, ejecuta el método init del servlet
        
        // Nos inventamos dos personas con dos y tres usuarios de login respectivamente
        // En vez de listaPersonas podríamos crear listaUsuarios.
        listaPersonas= new ArrayList();
        
        ArrayList<Usuario> lista = new ArrayList();
        lista.add(new Usuario("pr09","12345Abcde"));
        lista.add(new Usuario("pepito","Abcde12345"));
        
        Persona p = new Persona("11111111A","Pepe",lista);
        listaPersonas.add(p);
        
        lista = new ArrayList();
        lista.add(new Usuario("ana10","12345Abcde"));
        lista.add(new Usuario("aaa","Abcde12345"));
        lista.add(new Usuario("nnn","qwerty"));
        
        p = new Persona("11111111B","Ana",lista);
        listaPersonas.add(p);
        
        
    }
    
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
            out.println("<h1>Se está ejecutando el método doGet </h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
        // El objeto request contiene los datos enviados por el formulario
        String usuario = request.getParameter("user");
        
        // Buscar el usuario a partir de la lista de personas.
        int x,y=0;
        boolean encontrado = false;
        for(x = 0; x < listaPersonas.size() && !encontrado;x++){
            for(y=0;y< listaPersonas.get(x).getLista().size() && !listaPersonas.get(x).getLista().get(y).getUsuario().equals(usuario);y++){}
            if (y< listaPersonas.get(x).getLista().size() )
                encontrado = true;
        }
        
        if (encontrado)
        {
            // Hay una persona con ese nombre de usuario. ¿ La contraseña es correcta?
            Usuario u = listaPersonas.get(x-1).getLista().get(y);
            if(u.getContraseña().equals(request.getParameter("con")))
                  responder("Bienvenidx " + listaPersonas.get(x-1).getNombre(),response);
            else
                 responder("Usuario o contraseña no válido.",response);
        }
        else
        {
                 responder("Usuario o contraseña no válido.",response);
        }
        
   }
   
    private void responder(String mensaje,HttpServletResponse response)  throws ServletException, IOException
    {
          // El objeto response sirve para enviar datos al cliente
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + mensaje + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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

}
