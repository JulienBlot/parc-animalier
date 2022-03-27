package animaux;

public class Reptile extends Animal {
    
    private double taille;
    private final boolean genre;

    public Reptile(String nom, String dateNaiss, double taille, boolean genre) {
        super(nom, dateNaiss);
        this.taille = taille;
        this.genre = genre;
    }

    public String toString() {
        return super.toString() + '\n' + this.taille + " m\n" + this.genre;
    }

    /**
     * Getters
     */

    public double getTaille() {
        return this.taille;
    }

    public boolean getGenre() {
        return this.genre;
    }

}
