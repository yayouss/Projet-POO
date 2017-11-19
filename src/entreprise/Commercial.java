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
abstract class Commercial extends Employe {
    private double chiffreAffaire;
    
    public Commercial(String matricule,String Prenom,String Nom,int Age,String Date,double chiffreAffaire){
        super(matricule,Prenom,Nom,Age,Date);
        this.chiffreAffaire=chiffreAffaire;
    }
    public double getChiffreAffaire(){
       return chiffreAffaire;
    }
    
    
}
