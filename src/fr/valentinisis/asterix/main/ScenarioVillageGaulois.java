package fr.valentinisis.asterix.main;

import fr.valentinisis.asterix.classes.lieu.Village;
import fr.valentinisis.asterix.classes.personne.Druide;
import fr.valentinisis.asterix.classes.personne.Gaulois;

import java.util.Random;

public class ScenarioVillageGaulois {
    public static void main(String[] args) {
        // Création des gaulois
        Gaulois abraracourcix = new Gaulois("Abraracourcix", 1, "chef");
        Gaulois agecanonix = new Gaulois("Agecanonix", 1, "retraité");
        Gaulois assurancetourix = new Gaulois("Assurancetourix", 1, "barde");
        Gaulois asterix = new Gaulois("Astérix", 1, "héros");
        Gaulois obelix = new Gaulois("Obélix", 15, "tailleur de menhir");
        Gaulois cetautomatix = new Gaulois("Cétautomatix", 1, "forgeron");
        Gaulois tragicomix = new Gaulois("Tragicomix", 1, "beau gosse");
        Gaulois ordralbabétix = new Gaulois("Ordralbabétix", 1, "poissonier");
        Gaulois falbala = new Gaulois("Falbala", 1, "fiancée");
        Druide panoramix = new Druide("Panoramix", 1);
        Gaulois[] lesGaulois = {agecanonix, assurancetourix, asterix, obelix, cetautomatix, tragicomix, ordralbabétix, falbala};

        //Création du village
        Village irreductibleVillage = new Village("le Camp des irréductibles gaulois", abraracourcix, panoramix);
        for (Gaulois g: lesGaulois
             ) {
            irreductibleVillage.addGaulois(g);
        }


        System.out.println(irreductibleVillage);
        irreductibleVillage.rencontrer(abraracourcix, lesGaulois[new Random().nextInt(lesGaulois.length)]);
    }
}
