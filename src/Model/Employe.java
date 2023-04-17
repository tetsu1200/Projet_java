/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PROBOOK 450 I7
 */
public class Employe {
    
    private int id;
    private int age;
   
    private String nom;
    private String tel;
    private String mail;
    private String mdp;
    private EmployeDao emd = new EmployeDao();

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getNom() {
        return nom;
    }

    public String getTel() {
        return tel;
    }

    public String getMail() {
        return mail;
    }

    public String getMdp() {
        return mdp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    
    public Employe EmplActu(String n, String m) {
        List<Employe> list = new ArrayList<>();

        try {
            list = emd.recuperer();
            for (Employe em : list) {
                if (em.getMail().equals(n) && em.getMdp().equals(m)) {
                    return em;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
    
}
