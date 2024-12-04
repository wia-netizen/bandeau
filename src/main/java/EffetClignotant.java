public class EffetClignotant implements Effet {
    @Override
    public void executer(MonBandeau bandeau) {
        bandeau.effetClignotant("Clignotant!", 5, 500); // Clignoter 5 fois
    }
}
