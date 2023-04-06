/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class Client 
{
    private int id;
    private int age;
    
    private String nom;
    private String tel;
    private String mail;
    private String mdp;
    private String situation;
    
    private boolean typeRegulier = false;

    public Client(int age, String nom, String tel, String mail, String mdp, String situation) {
        this.age = age;
        this.nom = nom;
        this.tel = tel;
        this.mail = mail;
        this.mdp = mdp;
        this.situation = situation;
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

    public void setMail(String email) {
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
    
    
    
    
    
    
}
