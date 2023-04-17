/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author PROBOOK 450 I7
 */
public class Reservation {
    
    private int id;
    private int idHeber;
    private int idClient;
    private int nbrAdulte;
    private int nbrEnfant;
    private int nbrChambre;
    
    
    private String destination;
    
    private String dateArr;
    private String dateDep;

    public int getId() {
        return id;
    }

    public int getIdHeber() {
        return idHeber;
    }

    public int getIdClient() {
        return idClient;
    }

    public int getNbrAdulte() {
        return nbrAdulte;
    }

    public int getNbrEnfant() {
        return nbrEnfant;
    }

    public int getNbrChambre() {
        return nbrChambre;
    }

    public String getDestination() {
        return destination;
    }

    public String getDateArr() {
        return dateArr;
    }

    public String getDateDep() {
        return dateDep;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdHeber(int idHeber) {
        this.idHeber = idHeber;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public void setNbrAdulte(int nbrAdulte) {
        this.nbrAdulte = nbrAdulte;
    }

    public void setNbrEnfant(int nbrEnfant) {
        this.nbrEnfant = nbrEnfant;
    }

    public void setNbrChambre(int nbrChambre) {
        this.nbrChambre = nbrChambre;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDateArr(String dateArr) {
        this.dateArr = dateArr;
    }

    public void setDateDep(String dateDep) {
        this.dateDep = dateDep;
    }
    
    
    
    
    
}
