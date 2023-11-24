package fr.valentinisis.asterix.classes.strategie;
import fr.valentinisis.asterix.classes.personne.Gaulois;
import fr.valentinisis.asterix.classes.personne.Mechant;

import java.util.*;


public class lesPlusFortsDevantStrategie implements Strategie {

    public void effectuerCombat(Set<Gaulois> lesGaulois, Set<Mechant> lesMechants) {

        Map<String, List<Gaulois>> ordreGaulois = triGaulois(lesGaulois);
        TreeSet<Mechant> ordreMechant = triMechant(lesMechants);
        Gaulois gauloisDevant;
        Mechant mechantDevant;

        while (ordreMechant.size() > 0 && ordreGaulois.get("lesNuls").size() > 0  && ordreGaulois.get("lesPlusForts").size() > 0 && ordreGaulois.get("lesForts").size() > 0 && ordreGaulois.get("lesMoyens").size() > 0){

            if (ordreGaulois.get("lesPlusForts").size() > 0) {
                gauloisDevant = ordreGaulois.get("lesPlusForts").get(0);
                ordreGaulois.get("lesPlusForts").remove(gauloisDevant);
            } else if (ordreGaulois.get("lesForts").size() > 0) {
                gauloisDevant = ordreGaulois.get("lesForts").get(0);
                ordreGaulois.get("lesForts").remove(gauloisDevant);
            } else if (ordreGaulois.get("lesMoyens").size() > 0) {
                gauloisDevant = ordreGaulois.get("lesMoyens").get(0);
                ordreGaulois.get("lesMoyens").remove(gauloisDevant);
            } else {
                gauloisDevant = ordreGaulois.get("lesNuls").get(0);
                ordreGaulois.get("lesNuls").remove(gauloisDevant);
            }

            mechantDevant = ordreMechant.last();
            ordreMechant.remove(mechantDevant);

            System.out.println(mechantDevant.getNom() + " prend une baffe de " + gauloisDevant.getNom());
            mechantDevant.perdreForce(gauloisDevant.getForce()/6);
            gauloisDevant.perdreForce(mechantDevant.getForceCombat());

            if (!(gauloisDevant.getForce() == 0)) addGaulois(ordreGaulois, gauloisDevant);
            if (mechantDevant.getForceCombat() == 0) mechantDevant.recupererForce();
            else ordreMechant.add(mechantDevant);
        }

        if (ordreGaulois.get("lesNuls").size() == 0) System.out.println("Les méchants ont enfin gagné !!!!");
        else System.out.println("Les gaulois ont gagné, comme à leur habitude");
    }


    private Map<String, List<Gaulois>> triGaulois(Set<Gaulois> lesGaulois) {
        Map<String, List<Gaulois>> ordreGaulois = new HashMap<>();
        ordreGaulois.put("lesPlusForts", new ArrayList<>());
        ordreGaulois.put("lesForts", new ArrayList<>());
        ordreGaulois.put("lesMoyens", new ArrayList<>());
        ordreGaulois.put("lesNuls", new ArrayList<>());

        for (Gaulois g: lesGaulois) {
            addGaulois(ordreGaulois, g);
        }
        return ordreGaulois;
    }

    private void addGaulois(Map<String, List<Gaulois>> ordreGaulois, Gaulois gaulois){
        int force = gaulois.getForce();
        if (force > 15) ordreGaulois.get("lesPlusForts").add(gaulois);
        else if (force > 10) ordreGaulois.get("lesForts").add(gaulois);
        else if (force > 5) ordreGaulois.get("lesMoyens").add(gaulois);
        else ordreGaulois.get("lesNuls").add(gaulois);
    }

    private TreeSet<Mechant> triMechant(Set<Mechant> lesMechants) {
        return new TreeSet<>(lesMechants);
    }

}
