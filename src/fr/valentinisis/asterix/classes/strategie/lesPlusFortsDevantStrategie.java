package fr.valentinisis.asterix.classes.strategie;
import fr.valentinisis.asterix.classes.personne.Gaulois;
import fr.valentinisis.asterix.classes.personne.Mechant;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;



public class lesPlusFortsDevantStrategie implements Strategie {

    public void effectuerCombat(Set<Gaulois> lesGaulois, Set<Mechant> lesMechants) {
        List<Gaulois> faible = new ArrayList<>();
        List<Gaulois> moyen = new ArrayList<>();
        List<Gaulois> fort = new ArrayList<>();
        List<Gaulois> tresFort = new ArrayList<>();

        for (Gaulois gaul : lesGaulois) {
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
        List<Gaulois> allGaulois = new ArrayList<>();
        allGaulois.addAll(tresFort);
        allGaulois.addAll(fort);
        allGaulois.addAll(moyen);
        allGaulois.addAll(faible);


        trierGauloisParForceDecroissante(allGaulois);

        List<Mechant> sortedMechants = trierMechantsParForceDecroissante(lesMechants);

        int flagMechants = 0;
        int flagGaulois = 0;

        while (flagMechants < sortedMechants.size() && flagGaulois < allGaulois.size()) {
            Gaulois gauloisDevant = allGaulois.get(flagGaulois);
            Mechant mechantDevant = sortedMechants.get(flagMechants);

            System.out.println(mechantDevant.getNom() + " prend une baffe de " + gauloisDevant.getNom());
            mechantDevant.perdreForce(gauloisDevant.getForce() / 6);
            gauloisDevant.perdreForce(mechantDevant.getForceCombat());

            if (gauloisDevant.getForce() == 0) {

                flagGaulois++;
            }
            if (mechantDevant.getForceCombat() == 0) {

                flagMechants++;
            }
        }


        if (flagGaulois == allGaulois.size()) {
            System.out.println("Les méchants ont enfin gagné !!!!");
        } else {
            System.out.println("Les gaulois ont gagné, comme à leur habitude");
        }
    }


    private List<Mechant>trierMechantsParForceDecroissante (Set<Mechant> lesMechants) {
        return new ArrayList<>(lesMechants);
    }
    public List<Gaulois>trierGauloisParForceDecroissante(List<Gaulois> allGaulois){
        return new ArrayList<>(allGaulois);
    }

}
