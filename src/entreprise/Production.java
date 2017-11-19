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
public class Production extends Employe {
    private final static double FACTUR_UNITE=5.0;
    private int unites;
    
    public Production(String matricule,String Prenom,String Nom,int Age,String Date, int unites){
        super(matricule,Prenom,Nom,Age,Date);
        this.unites=unites;
    }
    @Override
    public double calculersalaire(){
        return FACTUR_UNITE*unites;
        
    }
    @Override
    public String getTitre()
    {
        return " le producteur  ";
    }
}
