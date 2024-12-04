import java.util.ArrayList;
import java.util.List;

public class Scenario {
    private List<EffetRepete> effets;

    public Scenario() {
        this.effets = new ArrayList<>();
    }

    // Ajouter un effet au scénario
    public void ajouterEffet(Effet effet, int repetitions) {
        effets.add(new EffetRepete(effet, repetitions));
    }

    // Exécuter le scénario (enchainement d'effets)
    public void executer(MonBandeau bandeau) {
        for (EffetRepete effetRepete : effets) {
            for (int i = 0; i < effetRepete.getRepetitions(); i++) {
                effetRepete.getEffet().executer(bandeau);
            }
        }
    }
}
