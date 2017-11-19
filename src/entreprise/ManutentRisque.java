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
class ManutentRisque extends Manutentionnaire implements Risque {
    public ManutentRisque(String matricule,String Prenom,String Nom,int Age,String Date,int heures){
        super(matricule,Prenom,Nom,Age,Date,heures);
    }
    public double caculersalaire(){
        return  super.calculersalaire()+PRIME;
    }
    
}
