/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;
import java.io.*;

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
    
    public void TourDeJeu(){
        int de;
        de=lanceLeDe();
        
        position=position+de;
        
        System.out.println(this.toString());
        
        
        
    }
    
    public static int lanceLeDe() {
        return ((int) Math.floor(Math.random()*6))+1;
    }
    
    //Affiche le nom et la position du joueur sous le format "Le joueur XX est en YY"
    public String toString(){
        return "Le joueur "+nom+" est en "+position;
    }
    
}
