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
public class PhotoAccueilDao {
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement pst ;
    ResultSet rs;
    
    public PhotoAccueil setPhotoInBD()
    {
        PhotoAccueil ph = new PhotoAccueil();
        
        String sql = "SELECT photoHeber FROM hebergement WHERE nbrEtoile = 0";
        
        try {
            con = cn.connnecterBD();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            
            
            while (rs.next()) {
                ph.setImgPrincipale(rs.getString("photoHeber"));
            }
            
            
            
            System.out.println("ok photo");
            return ph;
        } catch (Exception e) {
            e.getStackTrace();
            e.printStackTrace();
            System.err.println("Eroor photo");
            return ph;   
        }    
    }
    
}
