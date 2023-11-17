package fr.valentinisis.asterix.main;

import fr.valentinisis.asterix.classes.lieu.Vaisseau;
import fr.valentinisis.asterix.classes.personne.Pirate;

public class ScenarioVaisseauPirate {
    public static void main(String[] args) {
        // Création des pirates
        Pirate baba = new Pirate("Baba", 3, "capitaine");
        Pirate barbeRouge = new Pirate("Barbe Rouge", 8, "cartographe");
        Pirate batdaf = new Pirate("Batdaf", 1, "guet");

        // Création du navire
        Vaisseau blackNavire = new Vaisseau("Black Navire", baba);
        blackNavire.addPirate(barbeRouge);
        blackNavire.addPirate(batdaf);

        System.out.println(blackNavire);
        blackNavire.rencontrer(barbeRouge, batdaf);
    }
}
