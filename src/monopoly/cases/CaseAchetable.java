
package monopoly.cases;


import monopoly.Joueur;
import monopoly.PlateauJeu;

public class CaseAchetable {
    private int prix;
    private Joueur proprietaire;
    

    
    public CaseAchetable(String nom, String logo, int position, PlateauJeu plateau, int p){
        super(nom,logo,position,plateau);
        this.prix=p;
        
    }   
    
   public int getPrix(){
       return prix;
   }
   
   public Joueur getProprietaire(){
       return proprietaire;
   }
    
   public void setPrix(int p){
       this.prix=p;
   }
   
   private void setProprietaire(Joueur j){
       this.proprietaire=j;
   }
  
   public void acheter(Joueur j){
      
       try {
        j.depenser(prix);
        setProprietaire(j);
        
       }
       catch(NoMoreMoney e){
           System.out.prinln("Pas assez d'argent");
       }
       
       }
    
}
