/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author PROBOOK 450 I7
 */
public class Hebergement {
    
    private int id;
    private int nbrChambre;
    private int nbrEtoile;
    private int tarif;
    
    private String nom;
    private String adresse;
    private String photo;
    private String description;
    private String avis;
    private String categorie;

    public Hebergement() {
    }

    public int getId() {
        return id;
    }

    public int getNbrChambre() {
        return nbrChambre;
    }

    public int getNbrEtoile() {
        return nbrEtoile;
    }

    public int getTarif() {
        return tarif;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getPhoto() {
        return photo;
    }

    public String getDescription() {
        return description;
    }

    public String getAvis() {
        return avis;
    }

    public String getCategorie() {
        return categorie;
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public void setNbrChambre(int nbrChambre) {
        this.nbrChambre = nbrChambre;
    }

    public void setNbrEtoile(int nbrEtoile) {
        this.nbrEtoile = nbrEtoile;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAvis(String avis) {
        this.avis = avis;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
    
    
    
    
    
    
}
