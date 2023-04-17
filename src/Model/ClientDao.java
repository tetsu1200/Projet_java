/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author PROBOOK 450 I7
 */
public class ClientDao 
{
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement pst ;
    ResultSet rs;
    
    public boolean  enregistrer(Client cl)
    {
        String sql = "insert into clients(nomClient,telClient,mailClient,ageClient,situationClient,"
                + "typeRegulier,mdpClient,photo) values " + "(?,?,?,?,?,?,?,?)";
                                        
        try {
            con = cn.connnecterBD();
            pst = con.prepareStatement(sql);
            pst.setString(1, cl.getNom());
            pst.setString(2, cl.getTel());
            pst.setString(3, cl.getMail());
            pst.setInt(4, cl.getAge());
            pst.setString(5, cl.getSituation());
            pst.setBoolean(6, cl.isTypeRegulier());
            pst.setString(7, cl.getMdp());
            pst.setString(8, cl.getPhoto());
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
    
    public ResultSet authentification(String mail, String mdp)
    {
        String sql = "SElECT * FROM clients WHERE mailClient = ? AND mdpClient = ?";
        
        try {
            con = cn.connnecterBD();
            pst = con.prepareStatement(sql);
            
            pst.setString(1, mail);
            pst.setString(2, mdp);  
            
            rs = pst.executeQuery();
            
            return rs;
        } catch (Exception e) {
            e.getStackTrace();
            return null;
        }
    }
    
    public List recuperer()
    {
        List<Client> list = new ArrayList<>();
        
        String sql  = "select * from clients";
        
        try {
            con = cn.connnecterBD();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while (rs.next()) {
                Client cl = new Client();
                cl.setId(rs.getInt("idClient"));
                cl.setNom(rs.getString("nomClient"));
                cl.setTel(rs.getString("telClient"));
                cl.setMail(rs.getString("mailClient"));
                cl.setAge(rs.getInt("ageClient"));
                cl.setSituation(rs.getString("situationClient"));
                cl.setTypeRegulier(rs.getBoolean("typeRegulier"));
                cl.setMdp(rs.getString("mdpClient"));
                cl.setPhoto(rs.getString("photo"));
                list.add(cl);
     
            }
        } catch (Exception e) 
        {
            e.getStackTrace();
        }
        
        
        return list;
        
    }
    
}
