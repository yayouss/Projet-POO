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
public abstract class Employe {
    private String matricule;
    private String Nom;
    private String Prenom;
    private int Age;
    
    private String Date;
    
    public Employe(String matricule,String Prenom,String Nom,int Age,String Date){
        this.matricule=matricule;        
        this.Nom=Nom;
        this.Prenom=Prenom;
        
        this.Age=Age;
        this.Date=Date;
        
    }
    public abstract double calculersalaire();
    
    public String getTitre()
    {
        return " l'employe  ";
    
    }
    public String getNom(){
        return getTitre()+Prenom+ " "  +Nom;
    }
    
    
    
}
