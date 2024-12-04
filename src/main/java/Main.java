public class Main {
    public static void main(String[] args) {
        MonBandeau monBandeau = new MonBandeau();

        // Création des effets
        Effet effetZoom = new EffetZoom();
        Effet effetRotation = new EffetRotation();
        Effet effetClignotant = new EffetClignotant();

        // Création du scénario
        Scenario scenario = new Scenario();
        scenario.ajouterEffet(effetZoom, 1);        // Zoom une fois
        scenario.ajouterEffet(effetRotation, 2);    // Rotation deux fois
        scenario.ajouterEffet(effetClignotant, 5);  // Clignote 5 fois

        // Exécution du scénario
        scenario.executer(monBandeau);

        monBandeau.close(); // Fermer le bandeau après l'exécution
    }
}
