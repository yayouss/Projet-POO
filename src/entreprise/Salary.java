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
public class Salary {
    
    public static void main(String[]args){
        
        Personnel p=new Personnel();
        
        p.ajouterEmploye(new Vendeur("133hfg4","yaya","business",34,"1994",30000));
        p.ajouterEmploye(new Representant("32gj76","pipi","vendtout",17,"2002",20000));
        p.ajouterEmploye(new Production("87nbcc","Baba","Bosseur",13,"1995",1000));
        p.ajouterEmploye(new Manutentionnaire("108vrsl4","Yvette","Stoketout",36,"1968",50000));
        p.ajouterEmploye(new ProducteurARisque("54vhc34","Toto","Flippe",28,"2007",98));
        p.ajouterEmploye(new ManutentRisque("58ffd43","Ali","Abordage",32,"2000",67));
        
        p.afficherSalaires();
        System.out.println("le salaire moyen dans l'entreprise est de "+p.salaireMoyen()+ " francs.");
        
        
    }
    
}
