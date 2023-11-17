package fr.valentinisis.asterix.classes.strategie;

import fr.valentinisis.asterix.classes.personne.Gaulois;
import fr.valentinisis.asterix.classes.personne.Mechant;

import java.util.List;
import java.util.Set;

public class lesPlusFortsDevantStrategie implements Strategie{
    @Override
    public void effectuerCombat(Set<Gaulois> lesGaulois, Set<Mechant> lesMechants) {

    }
    protected List<Gaulois> triGaulois(Set<Gaulois> lesGaulois) {
        return null;
    }
    protected List<Gaulois> triMechant(Set<Gaulois> lesMechants) {
        return null;
    }
}
