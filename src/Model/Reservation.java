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
public class Reservation {
    
    private int id;
    private int idHeber;
    private int idClient;
    private int nbrAdulte;
    private int nbrEnfant;
    private int nbrChambre;
    
    
    private String dateArr;
    private String dateDep;
    
    private ReservationDao red = new ReservationDao();

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


    public void setDateArr(String dateArr) {
        this.dateArr = dateArr;
    }

    public void setDateDep(String dateDep) {
        this.dateDep = dateDep;
    }
    
    
    public List Aff(int idC){
        
        List<Reservation> list = new ArrayList<>();
        List<Reservation> newList = new ArrayList<>();
        
        
        try {
            list = red.recuperer();
            
            if (!list.isEmpty()) {
                
                for (int i = 0; i < list.size(); i++) 
                {
                    if (list.get(i).getIdClient() == idC) {
                            newList.add(list.get(i));   
                    }
                }             
            }else{
                newList = null;
                
            }
            
            
        } catch (Exception e) {
            //e.getStackTrace();
            e.printStackTrace();
        }
        
        return newList;
        
    }

    public Reservation rechercherById(int idR) {
        List<Reservation> list = new ArrayList<>();
        int j = -2;
        
        try {
            list = red.recuperer();
            
            if (!list.isEmpty()) {
                
                for (int i = 0; i < list.size(); i++) 
                {
                    if (list.get(i).getId() == idR) 
                    {
                        j=i;
                       
                    }      
                }              
            }          
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list.get(j);
    }
    
    
    
    
    
}
