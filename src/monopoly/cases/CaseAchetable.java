package monopoly.cases;

import monopoly.Joueur;
import monopoly.PlateauJeu;

public abstract class CaseAchetable extends Case {

    private int prix;
    private Joueur proprietaire;

    public CaseAchetable(String nom, String logo, int position, PlateauJeu plateau, int p) {
        super(nom, logo, position, plateau);
        this.prix = p;

    }

    public String toString() {
        String nom;
        if (proprietaire != null) {
            nom = proprietaire.getNom();
        } else {
            nom = "Sans Propriétaire";
        }
        return getNom() + " cout :(" + getPrix() + ") - " + nom;
    }

    public int getPrix() {
        return prix;
    }

    public Joueur getProprietaire() {
        return proprietaire;
    }

    public void setPrix(int p) {
        this.prix = p;
    }

    private void setProprietaire(Joueur j) {
        this.proprietaire = j;
    }

    public void acheter(Joueur j) {

        try {
            j.depenser(prix);
            setProprietaire(j);

        } catch (Exception e) {
            System.out.println("Pas assez d'argent");
        }

    }
}
