package monopoly;

import java.util.ArrayList;
import java.util.List;

import monopoly.cases.Case;
import monopoly.cases.CaseAchetable;
import monopoly.cases.Constructible;

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
		int nbr  =0;
		for (Case c: cases){
			if (c instanceof CaseAchetable){
				if (j == ((CaseAchetable) c).getProprietaire()) {
					nbr ++;
				}
			}
		}
		return nbr;
	}
	
	/**
	 * Affiche le plateau
	 */
	public void affiche() {
		for (Case c : this.cases) {
			System.out.println(c);
		}
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
		int nvpos = (c.getPosition() + nbCases) % cases.size();
		return cases.get(nvpos);
	}
	
	/**
	 * Initialise le plateau
	 */
	public void initPlateau(int nbJoueurs) {
		cases = new ArrayList<>();
		for (int i=0; i<40; i++){
			Case c = new Constructible("Case anonyme", i, this, 10, 10, new int[] {10,10,10,10,10,10});
			cases.add(c);
		}
        joueurs = new ArrayList<>();
        for (int i=0; i<nbJoueurs; i++){
            joueurs.add(new Joueur("Bob",this.cases.get(0),this));
        }
	}

	/**
	 * Initialise le plateau avec 2 joueurs
	 */
	public void initPlateau() {
		initPlateau(2);
	}
}
