package monopoly.cases;

import java.security.InvalidParameterException;

import monopoly.Joueur;
import monopoly.PlateauJeu;

public class Gare extends CaseAchetable {

	private int loyerDeBase = 2500;
	private PlateauJeu plateau;

	public Gare(String nom, int position, PlateauJeu plateauJeu) {
		super(nom, "gare.png", position, plateauJeu);
		if (position % 10 != 5){
			throw new InvalidParameterException("Position invalide pour une gare");
		}
		this.plateau = plateauJeu;
	}

	/**
	 * @return le loyer que doit payer le joueur qui est actuellement sur la gare
	 */
	public int loyer(){
		Joueur prop = this.getProprietaire();
		if (prop == null) return 0;
		return (int) (loyerDeBase * Math.pow(2, plateau.nbGares(prop)));
	}
}
