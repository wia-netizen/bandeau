public class EffetZoom implements Effet {
    @Override
    public void executer(MonBandeau bandeau) {
        bandeau.effetZoom(5, 50, 5); // Agrandir la police de 5 à 50
    }
}
