/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.*;
import modelo.*;

/**
 *
 * @author iv
 */
public class TablaClientes {
    
    private  Connection con;
    

    public TablaClientes(Connection con) {
        this.con = con;
    }
    
   
    
     public void insertar(Cliente c) throws Exception
    {
        // Preparar y ejecutar la sentencia sql.
        
        String plantilla = "INSERT INTO clientes VALUES (?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
         ps.setInt(1, c.getcodclie());
         ps.setString(2, c.getDni());
         ps.setString(3, c.getNombre());
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
     public void borrar(Cliente c) throws Exception
    {
        // no es necesario todo el objeto con el dni es suficiente
        
        String plantilla = "Delete from clientes where dni=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, c.getDni());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
     
     
     
     
     
       public Cliente  BuscarClie(String dni) throws Exception
    {
        
        String plantilla = "select * from clientes where dni =?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, dni);
       

      ResultSet resultado = ps.executeQuery();
       if (resultado.next())
       {
           Cliente c = new Cliente();
           // resultado.get para coger el contenido de la columna dni
           c.setcodclie(resultado.getInt("codclie"));
           c.setDni(resultado.getString("dni"));
           c.setNombre(resultado.getString("nombre"));
           return c;
           
       }
       else
           return null;
       
       
       
    }
     
     
  
}
     
