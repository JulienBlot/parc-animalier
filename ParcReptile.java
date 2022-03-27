import animaux.Animal;
import animaux.Reptile;

public class ParcReptile extends ParcAnimalier {

    public ParcReptile(int capacite) {
        super(capacite);
    }

    @Override
    public boolean ajouter(Animal anim) {
        return anim instanceof Reptile ? super.ajouter(anim) : false;
    }

    @Override
    public void afficherTaille() {
        System.out.println("*** Tailles ***");
        for (Animal a: super.parc) {
            System.out.println(
                a.getNom() + ": " +
                ((Reptile) a).getTaille() + " m\n"
            );
        }
    }

}
