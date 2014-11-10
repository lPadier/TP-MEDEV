package monopoly.cases;

import monopoly.PlateauJeu;

public abstract class Case {
    private String nom;
    private String logo;
    private int position;
    private PlateauJeu plateauJeu;

    /**
     * Constructeur de Case
     * @param nom nom de la case
     * @param logo chemin du logo de la case
     * @param position position de la case dans le plateau (depart = 0)
     * @param plateauJeu PlateauJeu sur lequel se situe la case
     */
    public Case(String nom, String logo, int position, PlateauJeu plateauJeu) {
        this.nom = nom;
        this.logo = logo;
        this.position = position;
        this.plateauJeu = plateauJeu;
    }

    /**
     * Getter du nom de la Case
     * @return le nom de la Case
     */
    public String getNom() {
        return nom;
    }

    /**
     * Getter de la position de la Case
     * @return la position de la Case
     */
    public int getPosition() {
        return position;
    }

    /**
     * Getter du PlateauJeu de la Case
     * @return le PlateauJeu sur lequel la Case se situe
     */
    public PlateauJeu getPlateauJeu() {
        return plateauJeu;
    }

    /**
     * Override du toString pour une case
     * @return le nom de la case.
     */
    @Override
    public String toString() {
        return this.getNom();
    }
}