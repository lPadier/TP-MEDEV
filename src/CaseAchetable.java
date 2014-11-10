/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author mhamadi
 */
public class CaseAchetable {
    private int prix;
    private Joueur proprietaire;
    
    public CaseAchetable(String nom, String logo, int position, PlateauJeu plateau, int p, Joueur j){
        super(nom,logo,position,plateau);
        this.prix=p;
        this.proprietaire=j;
    }
    
    public CaseAchetable(int p){
        super(nom,logo,position,plateau);
    
        this.prix=p;
        
    }   
    
   public int getPrix(){
       return prix;
   }
   
   public Joueur getProprietaire(){
       return proprietaire;
   }
    
   
   
   public void acheter(Joueur j){
       //this.proprietaire=j; 
       try {
           
           j.depenser(prix);
       }
       
       }
    
}
