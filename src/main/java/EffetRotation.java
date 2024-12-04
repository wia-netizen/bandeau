public class EffetRotation implements Effet {
    @Override
    public void executer(MonBandeau bandeau) {
        bandeau.effetRotation(Math.PI / 2, 1000); // Tourner de 90 degrés
    }
}
