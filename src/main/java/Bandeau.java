import bandeau.Bandeau;

import java.awt.Color;
import java.awt.Font;
class MonBandeau extends Bandeau {

    // Effet Zoom
    public void effetZoom(int start, int end, int step) {
        for (int i = start; i <= end; i += step) {
            this.setFont(new Font("Dialog", Font.BOLD, i));
            this.sleep(100); // Attente pour l'effet
        }
    }

    // Effet Rotation
    public void effetRotation(double angle, int sleepMillis) {
        this.setRotation((float) angle);
        this.sleep(sleepMillis);
    }

    // Effet Clignotant
    public void effetClignotant(String message, int repetitions, int delay) {
        for (int i = 0; i < repetitions; i++) {
            this.setMessage(message);
            this.sleep(delay);
            this.setMessage(""); // Effacer le message pour faire clignoter
            this.sleep(delay);
        }
    }
}
