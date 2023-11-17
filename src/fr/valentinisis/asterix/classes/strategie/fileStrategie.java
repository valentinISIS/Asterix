package fr.valentinisis.asterix.classes.strategie;

import fr.valentinisis.asterix.classes.personne.Gaulois;
import fr.valentinisis.asterix.classes.personne.Mechant;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class fileStrategie implements Strategie{

    @Override
    public void effectuerCombat(Set<Gaulois> lesGaulois, Set<Mechant> lesMechants) {
        int flagGaulois = 0;
        int flagMechants = 0;

        List<Gaulois> ordreGaulois = triGaulois(lesGaulois);
        List<Mechant> ordreMechant = triMechant(lesMechants);

        while (flagMechants < ordreMechant.size() && flagGaulois < ordreGaulois.size()){
            Gaulois gauloisDevant = ordreGaulois.get(flagGaulois);
            Mechant mechantDevant = ordreMechant.get(flagMechants);

            System.out.println(mechantDevant.getNom() + " prend une baffe de " + gauloisDevant.getNom());
            mechantDevant.perdreForce(gauloisDevant.getForce()/6);
            gauloisDevant.perdreForce(mechantDevant.getForceCombat());

            if (gauloisDevant.getForce() == 0) flagGaulois++;
            if (mechantDevant.getForceCombat() == 0) flagMechants++;
        }

        if (flagGaulois == ordreGaulois.size()) System.out.println("Les méchants ont enfin gagné !!!!");
        else System.out.println("Les gaulois ont gagné, comme à leur habitude");
    }

    private List<Gaulois> triGaulois(Set<Gaulois> lesGaulois) {
        return new ArrayList<>(lesGaulois);
    }

    private List<Mechant> triMechant(Set<Mechant> lesMechants) {
        return new ArrayList<>(lesMechants);
    }
}
