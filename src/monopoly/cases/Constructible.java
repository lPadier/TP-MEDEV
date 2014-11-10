package monopoly.cases;

import monopoly.PlateauJeu;

/**
 * Created by loic on 10/11/14.
 */
public class Constructible extends CaseAchetable {
    private int prixMaison;
    private int nbMaison;
    private int[] loyers;

    /**
     * Constructeur d'une case constructible
     * @param nom Nom de la case
     * @param logo Chemin du logo
     * @param position position sur le plateau
     * @param plateauJeu plateau jeu
     * @param prix prix de la case
     * @param prixMaison prix d'une maison
     * @param loyers loyers pour le nombre de maisons
     */
    public Constructible(String nom, String logo, int position, PlateauJeu plateauJeu, int prix, int prixMaison, int[] loyers) {
        super(nom, logo, position, plateauJeu, prix);
        this.prixMaison = prixMaison;
        this.nbMaison = 0;
        this.loyers = loyers;
    }

    public Constructible(String nom, int position, PlateauJeu plateauJeu, int prix, int prixMaison, int[] loyers) {
        Constructible(nom, null, position, plateauJeu, prix, prixMaison, loyers);
    }

    public int loyer() {
        return this.loyers[this.nbMaison];
    }
}
