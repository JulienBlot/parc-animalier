//© Julien Blot

package animaux;

public class Animal {
    
    private final String nom;
    private final String dateNaiss;

    public Animal(String nom, String dateNaiss) {
        this.nom = nom;
        this.dateNaiss = dateNaiss;
    }

    public String toString() {
        return this.nom + "\nNé le " + this.dateNaiss;
    }

    /**
     * Getters
     */

    public String getNom() {
        return this.nom;
    }

    public String getDateNaiss() {
        return this.dateNaiss;
    }

}
