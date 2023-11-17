package fr.valentinisis.asterix.classes.strategie;

import fr.valentinisis.asterix.classes.personne.Gaulois;
import fr.valentinisis.asterix.classes.personne.Mechant;

import java.util.List;
import java.util.Set;

public interface Strategie {
    void effectuerCombat(Set<Gaulois> lesGaulois, Set<Mechant> lesMechants);
}
