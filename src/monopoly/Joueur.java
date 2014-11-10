/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package monopoly;
import java.util.*;
import java.io.*;
import monopoly.cases.Case;

/**
 *
 * @author NguyenQuoc
 */
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

    public void paiement(Joueur j, int montant) throws NoMoreMoney{
        j.ajouteSomme(montant);
        fortune = fortune - montant;
        if (fortune < 0){
            throw new NoMoreMoney;
        }
    }

    public String getNom(){
        return nom;
    }

    public Case getPosition(){
        return position;
    }

    public void setPosition(Case c){
        position=c;
    }
    
    // Fonction décrivant un tour de jeu
    public void tourDeJeu() throws NoMoreMoney{
        int de;
        de=lanceLeDe();
        
        plateauJeu(deplacer);   // Le joueur se déplace
        
        System.out.println(this.toString());
        
        if(position.instanceof CaseAchetable){
            if (position.getProprietaire()!=null){   // La case a un propriétaire, on lui verse un loyer
                paiement(position.getProprietaire(), position.loyer());
            }

            else if ((de==1 || de==3 || de==5) && position.getProprietaire()==null && fortune>position.getPrix()){  // On achète la case
                position.acheter(this);
            }
        }
        else {  // La case n'est pas achetable
        // A compléter lorsqu'on aura des actions pour les cases achetables

        }
        
    }
    
    public static int lanceLeDe() {
        return ((int) Math.floor(Math.random()*6))+1;
    }
    
    //Affiche le nom et la position du joueur sous le format "Le joueur XX est en YY"
    public String toString(){
        return "Le joueur "+nom+" est en "+position.toString();
    }


    private void ajouteSomme(int montant){
        fortune=fortune + montant;
    }
    
}
