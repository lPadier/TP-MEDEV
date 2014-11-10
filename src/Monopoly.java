import monopoly.PlateauJeu;

public class Monopoly {

	/**
	 * @param args
	 */
    public static void main(String[] args) {
        System.out.print("Creation instance plateau de PlateauJeu:");
        PlateauJeu plateau = new PlateauJeu();
        System.out.println(" Succes.");
        System.out.println("Appel plateau.affiche() :");
        plateau.affiche();
    }

}
