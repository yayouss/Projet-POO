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
public  class Representant extends Commercial {
    private final static double POURCENT_REPRESENTANT=0.2;
    private static int BONUS_REPRESENTANT=200;
    
    public Representant(String matricule,String Prenom,String Nom,int Age,String Date,double chiffreAffaire){
        super(matricule,Prenom,Nom,Age,Date,chiffreAffaire);
    }
    public double calculersalaire(){
        return(POURCENT_REPRESENTANT*getChiffreAffaire())+BONUS_REPRESENTANT;
    }
    public String getTitre()
    {
        return " le representant ";
    }

    
}
