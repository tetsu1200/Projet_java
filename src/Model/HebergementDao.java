/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PROBOOK 450 I7
 */
public class HebergementDao {
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement pst ;
    ResultSet rs;
    
    
    public List recuperer()
    {
        List<Hebergement> list = new ArrayList<>();
        
        String sql  = "select * from hebergement";
        
        try {
            con = cn.connnecterBD();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while (rs.next()) {
                Hebergement he = new Hebergement();
                he.setId(rs.getInt("idHeber"));
                he.setNom(rs.getString("nomHeber"));
                he.setAdresse(rs.getString("adresseHeber"));
                he.setPhoto(rs.getString("photoHeber"));
                he.setDescription(rs.getString("descriptionHeber"));
                he.setAvis(rs.getString("avisHeber"));
                he.setCategorie(rs.getString("categorieHeber"));
                he.setNbrEtoile(rs.getInt("nbrEtoile"));
                he.setNbrChambre(rs.getInt("nbrChambre"));
                he.setTarif(rs.getInt("tarifHeber"));
                he.setVille(rs.getString("ville"));
                list.add(he);
     
            }
            System.out.println("recup ok");
        } catch (Exception e) 
        {
            e.getStackTrace();
            e.printStackTrace();
            System.err.println("reup erro");
        }
        
        
        return list;
        
    }
    
    public List recupererVille()
    {
        List<Hebergement> list = new ArrayList<>();
        
        String sql  = "SELECT DISTINCT ville from hebergement";
        
        try {
            con = cn.connnecterBD();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while (rs.next()) {
                Hebergement he = new Hebergement();
                he.setVille(rs.getString("ville"));
                list.add(he);
     
            }
            System.out.println("recup ok");
        } catch (Exception e) 
        {
            e.getStackTrace();
            e.printStackTrace();
            System.err.println("reup erro");
        }
        
        
        return list;
        
    }
    
}
