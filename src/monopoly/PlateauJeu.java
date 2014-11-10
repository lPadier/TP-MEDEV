package monopoly;

import java.util.List;

import monopoly.cases.Case;

public class PlateauJeu {

	private List<Joueur> joueurs;
	private List<Case> cases;
	
	public PlateauJeu() {
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
}
