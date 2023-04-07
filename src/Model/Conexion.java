/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.*;
/**
 *
 * @author PROBOOK 450 I7
 */
public class Conexion {

    Connection con;
    
    
    public Connection connnecterBD()
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver ok!");
            String url ="jdbc:mysql://localhost:3306/bdbooking";
            String user  ="root";
            String password="root";
            con = DriverManager.getConnection(url,user,password);
            System.out.println("Connection ok!");
            return con;      
        } 
        catch (Exception e) 
        {
            //System.err.println("Connection err!");
            e.printStackTrace();
            
            
        }
        return null;
    }
    
}
