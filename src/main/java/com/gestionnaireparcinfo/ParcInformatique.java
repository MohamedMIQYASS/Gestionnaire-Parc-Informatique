package com.gestionnaireparcinfo;

import java.util.ArrayList;
import java.util.List;

public class ParcInformatique {

    private List<Ordinateur> listeOrdinateur;

    public ParcInformatique(){
        this.listeOrdinateur = new ArrayList<>();
    }

    public void AjouterOrdi(Ordinateur newordi){
        for(Ordinateur o : this.listeOrdinateur){
            if(this.listeOrdinateur.contains(newordi)){
                System.out.println("Cet ordinateur est deja present dans le parc");
            } else {
                this.listeOrdinateur.add(newordi);
            }
        }

    }

    public void supprimerOrdi(Ordinateur ordi){
        for(Ordinateur o : this.listeOrdinateur){
            if(!(this.listeOrdinateur.contains(ordi))){
                System.out.println("Cet ordinateur n'est pas present dans le parc");
            } else {
                this.listeOrdinateur.remove(ordi);
            }
        }

    }



    


    
}
