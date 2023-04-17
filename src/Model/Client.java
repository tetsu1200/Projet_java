/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

public class Client 
{
    private int id;
    private int age;
    
    private String nom;
    private String tel;
    private String mail;
    private String mdp;
    private String situation;
    private String photo;
    
    private boolean typeRegulier = false;
    
    private ClientDao cld = new ClientDao();

    public Client(int age, String nom, String tel, String mail, String mdp, String situation, String photo) {
        this.age = age;
        this.nom = nom;
        this.tel = tel;
        this.mail = mail;
        this.mdp = mdp;
        this.situation = situation;
        this.photo = photo;
    }

    public Client() {
    }
    
    

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

    public String getSituation() {
        return situation;
    }

    public boolean isTypeRegulier() {
        return typeRegulier;
    }

    public String getPhoto() {
        return photo;
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

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public void setTypeRegulier(boolean typeRegulier) {
        this.typeRegulier = typeRegulier;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    
    
    
    public Client clientActu(String n, String m) {
        List<Client> list = new ArrayList<>();

        try {
            list = cld.recuperer();
            for (Client client : list) {
                if (client.getMail().equals(n) && client.getMdp().equals(m)) {
                    return client;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
    
    
    
    
    
    
}
