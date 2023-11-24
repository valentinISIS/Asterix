package fr.valentinisis.asterix.classes.strategie;
import fr.valentinisis.asterix.classes.personne.Druide;
import fr.valentinisis.asterix.classes.personne.Gaulois;
import fr.valentinisis.asterix.classes.personne.Mechant;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;


public class lesPlusFortsDevantStrategie implements Strategie{

    @Override
    public void effectuerCombat(Set<Gaulois> lesGaulois, Set<Mechant> lesMechants) {
        List<Gaulois> sortedGauls = triGaulois(lesGaulois);

        List<Gaulois> faible = new ArrayList<>();
        List<Gaulois> moyen = new ArrayList<>();
        List<Gaulois> fort = new ArrayList<>();
        List<Gaulois> tresFort = new ArrayList<>();

        for (Gaulois gaul : sortedGauls) {
                int force = gaul.getForce();
                if (force < 5) {
                    faible.add(gaul);
                } else if (force >= 5 && force < 10) {
                    moyen.add(gaul);
                } else if (force >= 10 && force < 15) {
                    fort.add(gaul);
                } else {
                    tresFort.add(gaul);
                }
            }
        }


    protected List<Gaulois> triGaulois(Set<Gaulois> lesGaulois) {
        List<Gaulois> sortedGauls = new ArrayList<>(lesGaulois);
        Collections.sort(sortedGauls, (g1, g2) -> Integer.compare(g2.getForce(), g1.getForce()));
        return sortedGauls;
    }
}
