/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;
import java.sql.*;
/**
 *
 * @author iv
 */
public class conexionbd {
    
   private Connection con;
 
public  conexionbd(){}

   
public void conectar(){
       try{
               // Identificamos el driver
                Class.forName("com.mysql.jdbc.Driver");
                 //obtenemos la conexión
                 String bd="bdeproyecto11";
                 String url = "jdbc:mysql://localhost:3307/"+bd;
                 String login="root";
                 String password = "usbw";
                 con = DriverManager.getConnection(url,login,password);
 
                if (con==null){
                       throw new Exception("Problemas con la conexión");
                 }
          }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
   }


public void desconectar(){
    try{
        con.close();
    }catch(Exception E){System.out.print("error al cerrar");}
}

public Connection getCon()
        
{return con;}

}




