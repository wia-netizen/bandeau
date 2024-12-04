public class EffetRepete {
    private Effet effet;
    private int repetitions;

    public EffetRepete(Effet effet, int repetitions) {
        this.effet = effet;
        this.repetitions = repetitions;
    }

    public Effet getEffet() {
        return effet;
    }

    public int getRepetitions() {
        return repetitions;
    }
}
