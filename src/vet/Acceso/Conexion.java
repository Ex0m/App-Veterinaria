 package vet.Acceso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
private static final String url="jdbc:mariadb://localhost/";
private static String DB="veterinaria";
private static String usuario="root";
private static String password=""; 
private static Conexion conexion=null;
    
     private Conexion() {
         
          try {
                 Class.forName("org.mariadb.jdbc.Driver");   
                 
               } catch (ClassNotFoundException ex) {
                   
                       JOptionPane.showMessageDialog(null, "Clase Conexion: Error al cargar Driver");
        }
    }
     
     public static Connection getConexion() {
         
             Connection con=null;
             
            if(conexion == null){         
                
            conexion= new Conexion();
            
        }
        try {
           
                 con = DriverManager.getConnection(url + DB + "?useLegacyDatetimeCode=false&serverTimezone=UTC" + "&user=" + usuario + "&password=" + password);           
           
             }catch (SQLException ex) {
                 
                    JOptionPane.showMessageDialog(null, "Error de conexion ");
        }       
        return con;
    } 
}