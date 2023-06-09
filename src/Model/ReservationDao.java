/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PROBOOK 450 I7
 */
public class ReservationDao {
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement pst ;
    ResultSet rs;
    
    
    public boolean  enregistrer(Reservation re)
    {
        String sql = "INSERT INTO reservation(dateArr, dateDep, nbrAdulte, nbrEnfant, "
                + "nbrChambre, idHeber, idClient) values " + "(?,?,?,?,?,?,?)";
                                        
        try {
            con = cn.connnecterBD();
            pst = con.prepareStatement(sql);
            pst.setString(1, re.getDateArr());
            pst.setString(2, re.getDateDep());
            pst.setInt(3, re.getNbrAdulte());
            pst.setInt(4, re.getNbrEnfant());
            pst.setInt(5, re.getNbrChambre());
            pst.setInt(6, re.getIdHeber());
            pst.setInt(7, re.getIdClient());
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
        List<Reservation> list = new ArrayList<>();
        
        String sql  = "select * from reservation";
        
        try {
            con = cn.connnecterBD();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while (rs.next()) {
                Reservation re = new Reservation();
                re.setId(rs.getInt("idReser"));
                re.setDateArr(rs.getString("dateArr"));
                re.setDateDep(rs.getString("dateDep"));
                re.setIdClient(rs.getInt("idClient"));
                re.setIdHeber(rs.getInt("idHeber"));
                re.setNbrAdulte(rs.getInt("nbrAdulte"));
                re.setNbrChambre(rs.getInt("nbrChambre"));
                re.setNbrEnfant(rs.getInt("nbrEnfant"));
                list.add(re);
     
            }
        } catch (Exception e) 
        {
            
            e.printStackTrace();
        }
        
        
        return list;
        
    }
    
    public void supprimer(Reservation re)
    {
        
        
        String sql  = "DELETE FROM reservation WHERE idReser = ? ";
        
        try {
            con = cn.connnecterBD();
            pst = con.prepareStatement(sql);
            
            
            pst.setInt(1, re.getId());
            pst.execute();
                        
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        
    }
    
}
