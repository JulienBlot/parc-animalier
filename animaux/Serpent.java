//Julien Blot

package animaux;

public class Serpent extends Reptile {
    
    private final String dangerosite;

    public Serpent(String nom, String dateNaiss, double taille, boolean genre, String dangerosite) {
        super(nom, dateNaiss, taille, genre);
        this.dangerosite = dangerosite;
    }

    public String toString() {
        return super.toString() + '\n' + this.dangerosite;
    }

    /**
     * Getters
     */

    public String getDangerosite() {
        return this.dangerosite;
    }

}
