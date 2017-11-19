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
class Personnel {
    private Employe[] staff;
    
    private int nbreEmploye;
    private final static int MAXEMPLOYE=200;
    private double somme=0.0;
    
    public Personnel(){
        staff=new Employe[MAXEMPLOYE];
        nbreEmploye=0;
        }
    public void ajouterEmploye(Employe a){
        ++nbreEmploye;
        if(nbreEmploye<=MAXEMPLOYE){
            staff[nbreEmploye-1]=a;
        }else{
            System.out.println("pas plus de" +MAXEMPLOYE+" employés");
        }
    }
    public double salaireMoyen(){
        for(int i=0;i<nbreEmploye;i++){
        somme+=staff[i].calculersalaire();
        }
        return somme/nbreEmploye;
    }
    public void afficherSalaires(){
        int i = 0;
        for( i=0; i< nbreEmploye; i++){
        System.out.println(staff[i].getNom()+ " gagne "  +staff[i].calculersalaire()+ " francs.");
    }
    }
    }
    

