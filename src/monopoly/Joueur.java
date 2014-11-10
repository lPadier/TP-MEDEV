package monopoly;

import monopoly.cases.Case;
import monopoly.cases.CaseAchetable;

public class Joueur {
    
    private String nom;
    
    private int fortune;
    
    private Case position;
    
    private PlateauJeu plateauJeu;
    
    
    //Constructeur
    /**
     * Constructeur avec paramètres (comme demandé dans le sujet)
     * @param nom Le nom du joueur (définie dans le main)
     * @param position La position du joueur (définie dans le main)
     * @param plateau Le plateau de jeu (définie dans le main)
     */
    public Joueur(String nom, Case position, PlateauJeu plateau){
        this.nom=nom;
        this.position=position;
        this.plateauJeu=plateau;
        fortune=100000;
    }
    
    //Méthodes
    
    public void tourDeJeu(){
        int de;
        de = lanceLeDe();
        
        position = this.plateauJeu.avance(position,de);
        
        System.out.println(this.toString());
        
        if(position instanceof CaseAchetable) {
            CaseAchetable positionAchetable = (CaseAchetable) position;
            if (positionAchetable.getProprietaire() != null) {
                //Gerer le loyer ici
            } else if (de%2 == 1 && fortune > positionAchetable.getPrix()) {
                positionAchetable.acheter(this);
            }
        }
            
        
    }
    
    public static int lanceLeDe() {
        return ((int) Math.floor(Math.random()*6))+1;
    }
    
    public String getNom() {
        return this.nom;
    }

    public void depenser(int value) {};

    //Affiche le nom et la position du joueur sous le format "Le joueur XX est en YY"
    public String toString(){
        return "Le joueur " + nom + " est en " + position;
    }
    
}
