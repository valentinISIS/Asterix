package fr.valentinisis.asterix.classes.lieu;

import fr.valentinisis.asterix.classes.personne.Pirate;

import java.security.InvalidParameterException;
import java.util.HashSet;
import java.util.Set;

public class Vaisseau implements ILieuMechant {
    private String nom;
    private Pirate chef;
    private Set<Pirate> lesEquipiers = new HashSet<>();

    public Vaisseau(String nom, Pirate chef) {
        this.nom = nom;
        this.chef = chef;
    }

    public void addPirate(Pirate p){
        lesEquipiers.add(p);
    }

    public void rencontrer(Pirate p1, Pirate p2){
        if (!(lesEquipiers.contains(p1) || chef == p1)) throw new InvalidParameterException("Le premier pirate n'est pas abord de ce navire");
        if (!(lesEquipiers.contains(p2) || chef == p2)) throw new InvalidParameterException("Le deuxième pirate n'est pas abord de ce navire");
        System.out.println("Salut moussaillon " + p2.getNom() + " !");
        System.out.println("Salut pirate " + p1.getNom() + " !");
    }

    @Override
    public String toString() {
        String chaine =  "bienvenue sur " + nom + ", le navire de " + chef.getNom() + "\n";
        for (Pirate p: lesEquipiers) {
            chaine  = chaine + "     " + p.getNom() + " --> " + p.getPoste() + "\n";
        }
        return chaine;
    }

    public Set<Pirate> getLesEquipiers() {
        return lesEquipiers;
    }

    public void setChef(Pirate chef) {
        this.chef = chef;
    }
}
