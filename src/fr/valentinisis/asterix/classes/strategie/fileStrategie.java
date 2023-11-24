package fr.valentinisis.asterix.classes.strategie;

import com.sun.source.tree.Tree;
import fr.valentinisis.asterix.classes.personne.Gaulois;
import fr.valentinisis.asterix.classes.personne.Mechant;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class fileStrategie implements Strategie{

    @Override
    public void effectuerCombat(Set<Gaulois> lesGaulois, Set<Mechant> lesMechants) {
        int flagGaulois = 0;

        List<Gaulois> ordreGaulois = triGaulois(lesGaulois);
        TreeSet<Mechant> ordreMechant = triMechant(lesMechants);

        while (flagGaulois < ordreGaulois.size()){
            Gaulois gauloisDevant = ordreGaulois.get(flagGaulois);
            Mechant mechantDevant = ordreMechant.last();
            ordreMechant.remove(mechantDevant);

            System.out.println(mechantDevant.getNom() + " prend une baffe de " + gauloisDevant.getNom());
            mechantDevant.perdreForce(gauloisDevant.getForce()/6);
            gauloisDevant.perdreForce(mechantDevant.getForceCombat());

            if (gauloisDevant.getForce() == 0) flagGaulois++;
            if (mechantDevant.getForceCombat() == 0) mechantDevant.recupererForce();
            else ordreMechant.add(mechantDevant);
        }

        if (flagGaulois == ordreGaulois.size()) System.out.println("Les méchants ont enfin gagné !!!!");
        else System.out.println("Les gaulois ont gagné, comme à leur habitude");
    }

    private ArrayList<Gaulois> triGaulois(Set<Gaulois> lesGaulois) {
        return new ArrayList<>(lesGaulois);
    }

    private TreeSet<Mechant> triMechant(Set<Mechant> lesMechants) {
        return new TreeSet<>(lesMechants);
    }
}
