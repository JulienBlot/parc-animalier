package animaux;

public class Lezard extends Reptile {
    
    private final String couleur;

    public Lezard(String nom, String dateNaiss, double taille, boolean genre, String couleur) {
        super(nom, dateNaiss, taille, genre);
        this.couleur = couleur;
    }

    public String toString() {
        return super.toString() + '\n' + this.couleur;
    }

    /**
     * Getters
     */

    public String getCouleur() {
        return this.couleur;
    }

}
