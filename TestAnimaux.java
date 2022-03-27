// Julien Blot

import animaux.*;

public class TestAnimaux {
    public static void main(String[] args) {

        Lezard lezard = new Lezard("Michel", "6 nov. 1999", 0.32, true, "bleu");
        Serpent serpent = new Serpent("Sylvie", "1 janv. 82 av. JC", 2, false, "paralysant");
        Mammifere mammifere = new Mammifere("Bernard", "24 août 2021", 4, 12.7);
        Oiseau oiseau = new Oiseau("Luigi", "14 avril 1452", "Falaises", 8);

        // Afficher manuellement les animaux
        System.out.println(lezard);
        System.out.println();
        System.out.println(serpent);
        System.out.println();
        System.out.println(mammifere);
        System.out.println();
        System.out.println(oiseau);
        System.out.println();

        // Afficher les tests sur le parc animalier
        ParcAnimalier parc = new ParcAnimalier(3);
        parc.ajouter(lezard);
        parc.ajouter(oiseau);

        parc.afficherTaille();
        parc.afficherAnimaux();

        parc.supprimer(lezard);
        parc.ajouter(mammifere);
        parc.ajouter(serpent);

        parc.afficherTaille();
        parc.afficherAnimaux();
        
        System.out.println(parc.ajouter(lezard));
        System.out.println();

        parc.afficherAnimaux();

        // Afficher les tests sur le parc à reptiles 
        ParcReptile parcReptile = new ParcReptile(3);
        parcReptile.ajouter(lezard);
        parcReptile.ajouter(oiseau);
        
        parcReptile.afficherAnimaux();
        parcReptile.afficherTaille();
    }
}
