package fr.valentinisis.asterix.main;

import fr.valentinisis.asterix.classes.lieu.Camp;
import fr.valentinisis.asterix.classes.personne.Grade;
import fr.valentinisis.asterix.classes.personne.Romain;

import java.util.Random;

public class ScenarioCampRomain {

    public static void main(String[] args) {
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
        babaorum.addRomain(brutus);
        babaorum.addRomain(briseradius);
        babaorum.addRomain(caligula);
        babaorum.addRomain(minus);
        babaorum.addRomain(chorus);
        babaorum.addRomain(milexcus);


        System.out.println(babaorum);
        babaorum.rencontrer(caiusObtus, lesSoldats[new Random().nextInt(lesSoldats.length)]);
        babaorum.rencontrer(milexcus, lesSoldats[new Random().nextInt(lesSoldats.length-1)]);
    }
}
