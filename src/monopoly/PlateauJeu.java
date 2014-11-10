package monopoly;

import java.util.ArrayList;
import java.util.List;

import monopoly.cases.Case;

public class PlateauJeu {

	private List<Joueur> joueurs;
	private List<Case> cases;
	
	public PlateauJeu() {
		initPlateau();
	}

	/**
	 * @return true si la partie est terminée
	 */
	public boolean finDePartie(){
		return false;
	}
	
	
	/**
	 * @param j le joueur
	 * @return le nombre de cases possédées par le joueur j
	 */
	public int nbCases(Joueur j) {
		return 0;
	}
	
	/**
	 * Affiche le plateau
	 */
	public void affiche() {
		
	}
	
	/**
	 * Fait tourner le jeu pour un tour
	 */
	public void tourDeJeu(){
		
	}
	

	/**
	 * @param c La case de départ
	 * @param nbCases
	 * @return La case qui est nbCases après c sur le plateau
	 */
	public Case avance(Case c, int nbCases) {
		return c;
	}
	
	/**
	 * Initialise le plateau
	 */
	public void initPlateau(int nbJoueurs) {
		joueurs = new ArrayList<>();
		for (int i=0; i<nbJoueurs; i++){
			joueurs.add(new Joueur());
		}
		cases = new ArrayList<>();
		for (int i=0; i<40; i++){
			cases.add(new Case());
		}
	}

	/**
	 * Initialise le plateau avec 2 joueurs
	 */
	public void initPlateau() {
		initPlateau(2);
	}
}