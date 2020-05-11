package Modelo.BD;

import java.sql.Connection;
import java.sql.DriverManager;

public class GenericoBD {
    /* Clase que contiene los método necesarios para trabajar
    con la base de datos */
    
    private Connection con;
        
    public void abrirBD() throws Exception
    { 
        /
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3307/"+"bdacontecimientos";
            con = DriverManager.getConnection(url,"root","usbw");
    }
    
    public void cerrarBD() throws Exception
    {    
        con.close();
    }

    public Connection getCon() 
    {
        return con;
    }
}
