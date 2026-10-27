package com.gestionnaireparcinfo;

import org.apache.commons.validator.routines.InetAddressValidator;

public class Ordinateur {
    private String nom;
    private int ID;
    private String adresseIP;
    private String OS;
    private String etat;

    public Ordinateur(String nom , int ID , String adresseIP , String OS ,String etat  ){
        this.nom = nom;
        this.ID = ID;
        this.adresseIP = adresseIP;
        this.OS = OS;
        this.etat = etat;
    }

    public String getNom(){ return this.nom;}
    public int getID(){ return this.ID;}
    public String getAdresseIP(){ return this.adresseIP;}
    public String getOS(){ return this.OS;}
    public String getEtat(){ return this.etat;}

    public void setNom(String NouveauNom){
        if (NouveauNom == null || !NouveauNom.matches("[\\p{L}]+")) {
            System.out.println("Format invalide");
            return;
        } else {
            if(this.nom == NouveauNom){
                System.out.println("Nom deja mis");
            } else {
                this.nom  = NouveauNom;
            }
        }
    }

    public void setAdresseIP(String nouvelleIP){
        if(InetAddressValidator.getInstance().isValidInet4Address(nouvelleIP) == false){
            System.out.println("Format Invalide");
        } else {
            if(this.adresseIP == nouvelleIP){
                System.out.println("Adresse ip deja mise");
            } else {
            this.adresseIP = nouvelleIP;
            }
        }
    }

    public void setOS(String NouveauOS){
        if (NouveauOS == null || !NouveauOS.matches("[\\p{L}]+")) {
            System.out.println("Format invalide");
            return;
         } else {
            if(this.OS == NouveauOS){
                System.out.println("Nom deja mis");
            } else {
                this.OS  = NouveauOS;
            }
        }
    }

    public void setEtat(String nouveuEtat){
        if(nouveuEtat != "Disponible" && nouveuEtat != "En panne" && nouveuEtat != "En mainetance"){
            System.out.println("Format Invalide");
        } else {
            if(this.etat == nouveuEtat){
                System.out.println("Etat déja configuré");
            } else {
                this.etat = nouveuEtat;
            }
        }
    } 
    
    @Override 
    public String toString() {
        return "NOM : " + this.nom + "ID : " + this.ID + "Adresse IP : " + this.adresseIP + "OS : " + this.OS + "ETAT: " + this.etat; 
    }    
}
