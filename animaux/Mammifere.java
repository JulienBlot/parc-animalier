package animaux;

public class Mammifere extends Animal {
    
    private final int nbPattes;
    private double poids;

    public Mammifere(String nom, String dateNaiss, int nbPattes, double poids) {
        super(nom, dateNaiss);
        this.nbPattes = nbPattes;
        this.poids = poids;
    }

    public String toString() {
        return super.toString() + '\n' + this.nbPattes + " pattes\n" + this.poids + " kg";
    }

    /**
     * Getters
     */

    public int getNbPattes() {
        return this.nbPattes;
    }

    public double getPoids() {
        return this.poids;
    }

}
