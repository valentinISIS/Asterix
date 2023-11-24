package fr.valentinisis.asterix.main;

import fr.valentinisis.asterix.classes.Bataille;
import fr.valentinisis.asterix.classes.lieu.Camp;
import fr.valentinisis.asterix.classes.lieu.Village;
import fr.valentinisis.asterix.classes.personne.Druide;
import fr.valentinisis.asterix.classes.personne.Gaulois;
import fr.valentinisis.asterix.classes.personne.Grade;
import fr.valentinisis.asterix.classes.personne.Romain;
import fr.valentinisis.asterix.classes.strategie.fileStrategie;
import fr.valentinisis.asterix.classes.strategie.lesPlusFortsDevantStrategie;

public class ScenarioBataille {
    public static void main(String[] args) {
        // Création des gaulois
        Gaulois abraracourcix = new Gaulois("Abraracourcix", 1, "chef");
        Gaulois agecanonix = new Gaulois("Agecanonix", 1, "retraité");
        Gaulois assurancetourix = new Gaulois("Assurancetourix", 1, "barde");
        Gaulois asterix = new Gaulois("Astérix", 1, "héros");
        Gaulois obelix = new Gaulois("Obélix", 5, "tailleur de menhir");
        Gaulois cetautomatix = new Gaulois("Cétautomatix", 1, "forgeron");
        Gaulois tragicomix = new Gaulois("Tragicomix", 1, "beau gosse");
        Gaulois ordralbabetix = new Gaulois("Ordralbabétix", 1, "poissonier");
        Gaulois falbala = new Gaulois("Falbala", 1, "fiancée");
        Druide panoramix = new Druide("Panoramix", 1);
        Gaulois[] lesGaulois = {agecanonix, assurancetourix, asterix, obelix, cetautomatix, tragicomix, ordralbabetix, falbala};

        //Création du village
        Village irreductibleVillage = new Village("le Camp des irréductibles gaulois", abraracourcix, panoramix);
        for (Gaulois g: lesGaulois
        ) {
            irreductibleVillage.addGaulois(g);
        }

        // Création de romains
        Romain caiusObtus = new Romain("Caius Obtus", Grade.CHEF);
        Romain brutus = new Romain("Brutus", Grade.CENTURION);
        Romain briseradius = new Romain("Briseradius", Grade.LEGIONNAIRE);
        Romain caligula = new Romain("Caligula", Grade.LEGIONNAIRE);
        Romain minus = new Romain("Minus", Grade.LEGIONNAIRE);
        Romain chorus = new Romain("Chorus", Grade.CENTURION);
        Romain milexcus = new Romain("Milexcus", Grade.LEGIONNAIRE);

        Romain[] lesSoldats = {brutus, briseradius, caligula, minus, chorus, milexcus};

        // Création du camp des romains
        Camp babaorum = new Camp("babaorum", caiusObtus);
        for (Romain r: lesSoldats) {
            babaorum.addRomain(r);
        }


        Bataille b = new Bataille(irreductibleVillage, babaorum);
        // Stratégie de la file
        b.bagarre(new fileStrategie());
        System.out.println("-------------------------------------");
        b.bagarre(new lesPlusFortsDevantStrategie());
    }
}
