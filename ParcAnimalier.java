//Julien Blot

import java.util.ArrayList;
import animaux.Animal;
import animaux.Reptile;

public class ParcAnimalier {
    
    protected ArrayList<Animal> parc;
    private final int MAX_CAPACITY;

    public ParcAnimalier(int capacite) {
        this.MAX_CAPACITY = capacite;
        this.parc = new ArrayList<Animal>();
    }

    public void afficherAnimaux() {
        System.out.println("*** Parc animalier ***");
        for (Animal a: this.parc) {
            System.out.println(a);
            System.out.print('\n');
        }
    }

    public Animal animal(int i) {
        return this.parc.get(i);
    }

    public boolean ajouter(Animal anim) {
        if (this.parc.size() < this.MAX_CAPACITY) {
            this.parc.add(anim);
            return true;
        }
        return false;
    }

    public boolean supprimer(Animal anim) {
        return this.parc.remove(anim);
    }

    public void afficherTaille() {
        System.out.println("*** Tailles ***");
        for (Animal a: this.parc) {
            if (a instanceof Reptile) {
                System.out.println(
                    a.getNom() + ": " +
                    ((Reptile) a).getTaille() + " m\n"
                );
            }
        }
    }

}

