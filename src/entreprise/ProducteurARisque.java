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
class ProducteurARisque extends Production implements Risque {
    public ProducteurARisque(String matricule,String Prenom,String Nom,int Age,String Date,int unites){
        super(matricule,Prenom,Nom,Age,Date,unites);}
        
            public double calculerSalaire(){
                return super.calculersalaire()+PRIME;
            }
        
  
    
    
}
