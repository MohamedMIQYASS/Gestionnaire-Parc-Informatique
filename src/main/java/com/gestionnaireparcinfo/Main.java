package com.gestionnaireparcinfo;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ParcInformatique parc = new ParcInformatique();

        Scanner sc = new Scanner(System.in);

        System.out.println(" -- GESTIONNAIRE DE PARC INFORMATIQUE -- ");
        System.out.println(" 1 - Ajouter un ordinateur au parc");
        System.out.println(" 2 - Voir tous les ordinateurs");
        System.out.println(" 3 - Rechercher un ordinateur");
        System.out.println(" 4 - Modifier l'etat d'un ordinateur");
        System.out.println(" 5 - Supprimer un ordinateur");
        System.out.println(" 7 - Quitter");
        System.out.println("Votre choix");
        int rep = sc.nextInt();

        while(rep < 1 || rep > 7 ){
            System.out.println("Veuillez choisir une option valide");
            rep = sc.nextInt();
        } 
            switch (rep) {
                case 1:
                    AjouterOrdinateur();
                    break;
                case 2:
                    AfficherOrdinateurs();
                    break;
                case 3:
                    rechercherOrdinateur();
                    break;
                case 4:
                    modifierEtatOrdinateur();
                    break;
                case 5:
                    SupprimerOrdinateur();
                    break;
            }
        }

    public static void AjouterOrdinateur(){

    }

    public static void AfficherOrdinateurs(){
    }

    public static void rechercherOrdinateur(){
    }

    public static void modifierEtatOrdinateur(){
    }

    public static void SupprimerOrdinateur(){
    }





}