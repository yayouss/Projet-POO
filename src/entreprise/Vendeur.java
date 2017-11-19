package entreprise;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arnold
 */
public class Vendeur extends Commercial {
     private final static double POURCENT_VENDEUR=0.2;
     private final static int BONUS_VENDEUR=100;
     
     public Vendeur(String matricule,String Prenom,String Nom,int Age,String Date,double chiffreAffaire){
         super(matricule,Prenom,Nom,Age,Date,chiffreAffaire);}
         
                 
     @Override
                 public double calculersalaire(){
                     return(POURCENT_VENDEUR*getChiffreAffaire())+BONUS_VENDEUR;
                 }
     @Override
                     public String getTitre(){
                         return"le vendeur";
                 }

     
    
}


