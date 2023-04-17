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
public class EmployeDao {
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement pst ;
    ResultSet rs;
    
    public boolean  enregistrer(Employe em)
    {
        String sql = "insert into employes(nomEmpl,telEmpl,mailEmpl,ageEmpl,mdpClient) "
                + "values " + "(?,?,?,?,?)";
                                        
        try {
            con = cn.connnecterBD();
            pst = con.prepareStatement(sql);
            pst.setString(1, em.getNom());
            pst.setString(2, em.getTel());
            pst.setString(3, em.getMail());
            pst.setInt(4, em.getAge());
            pst.setString(5, em.getMdp());
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
        String sql = "SElECT * FROM employes WHERE mailEmpl = ? AND mdpEmpl = ?";
        
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
        List<Employe> list = new ArrayList<>();
        
        String sql  = "select * from employes";
        
        try {
            con = cn.connnecterBD();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while (rs.next()) {
                Employe em = new Employe();
                em.setId(rs.getInt("idEmpl"));
                em.setNom(rs.getString("nomEmpl"));
                em.setTel(rs.getString("telEmpl"));
                em.setMail(rs.getString("mailEmpl"));
                em.setAge(rs.getInt("ageEmpl"));
                em.setMdp(rs.getString("mdpEmpl"));
                list.add(em);
     
            }
        } catch (Exception e) 
        {
            e.getStackTrace();
        }
        
        
        return list;
        
    }

    
}
