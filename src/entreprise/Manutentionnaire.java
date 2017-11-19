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
public class Manutentionnaire extends Employe{
    private final static double SALAIRE_HORAIRE=65.0;
    private int heures;
    
    public Manutentionnaire(String matricule,String Prenom,String Nom,int Age,String Date,int heures){
        super(matricule,Prenom,Nom,Age,Date);
        this.heures=heures;
        
    }
    public double calculersalaire(){
        return SALAIRE_HORAIRE*heures;
    }
    public String getTitre()
    {
        return" le manutent ";
    }
    
}
