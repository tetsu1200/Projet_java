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
    
    
    
    public boolean  enregistrer(Hebergement he)
    {
        String sql = "INSERT INTO hebergement(nomHeber, adresseHeber, photoHeber, descriptionHeber, avisHeber, "
                + "categorieHeber, nbrChambre, nbrEtoile, tarifHeber, ville) values " + "(?,?,?,?,?,?,?,?,?,?)";
                                        
        try {
            con = cn.connnecterBD();
            pst = con.prepareStatement(sql);
            pst.setString(1, he.getNom());
            pst.setString(2, he.getAdresse());
            pst.setString(3, he.getPhoto());
            pst.setString(4, he.getDescription());
            pst.setString(5, he.getAvis());
            pst.setString(6, he.getCategorie());
            pst.setInt(7, he.getNbrChambre());
            pst.setInt(8, he.getNbrEtoile());
            pst.setInt(9, he.getTarif());
            pst.setString(10, he.getVille());
            pst.execute();
            
            return true;
            
        } catch (Exception e) 
        {
            e.printStackTrace();
            return false;
            
        }finally{
            try 
            {
                con.close();
            } catch (Exception e) 
            {
                e.getStackTrace();
            }
        }
    }
    
    
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
    
    
    public void supprimer(Hebergement he)
    {
        List<Hebergement> list = new ArrayList<>();
        
        String sql  = "DELETE FROM hebergement WHERE idHeber = ? ";
        
        try {
            con = cn.connnecterBD();
            pst = con.prepareStatement(sql);
            
            
            pst.setInt(1, he.getId());
            pst.execute();
                        
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        
    }
    
    
    public boolean  Modifier(Hebergement he)
    {
        String sql = "UPDATE hebergement SET nomHeber=?, adresseHeber=?, photoHeber=?, descriptionHeber=?, avisHeber=?, "
            + "categorieHeber=?, nbrChambre=?, nbrEtoile=?, tarifHeber=?, ville=? WHERE idHeber=?";
                                        
        try {
            con = cn.connnecterBD();
            pst = con.prepareStatement(sql);
            
            pst.setString(1, he.getNom());
            System.err.println(he.getId());
            pst.setString(2, he.getAdresse());
            pst.setString(3, he.getPhoto());
            pst.setString(4, he.getDescription());
            pst.setString(5, he.getAvis());
            pst.setString(6, he.getCategorie());
            pst.setInt(7, he.getNbrChambre());
            pst.setInt(8, he.getNbrEtoile());
            pst.setInt(9, he.getTarif());
            pst.setString(10, he.getVille());
            pst.setInt(11, he.getId());
            pst.executeUpdate();
            
            return true;
            
        } catch (Exception e) 
        {
            e.printStackTrace();
            return false;
            
        }finally{
            try 
            {
                con.close();
            } catch (Exception e) 
            {
                e.getStackTrace();
            }
        }
    }
    
}
