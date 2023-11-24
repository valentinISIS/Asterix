package fr.valentinisis.asterix.classes.lieu;

import fr.valentinisis.asterix.classes.personne.Grade;
import fr.valentinisis.asterix.classes.personne.Mechant;
import fr.valentinisis.asterix.classes.personne.Romain;

import java.security.InvalidParameterException;
import java.util.HashSet;
import java.util.Set;

public class Camp implements ILieuMechant
{
    private String nom;
    private Romain chef;
    private Set<Romain> lesSoldats = new HashSet<>();

    public Camp(String nom, Romain chef) {
        this.nom = nom;
        this.chef = chef;
    }

    public void addRomain(Romain r){
        lesSoldats.add(r);
    }

    public void rencontrer(Romain r1, Romain r2){
        if (!(lesSoldats.contains(r1) || r1 == chef)) throw new InvalidParameterException("Le premier romain n'est pas dans le camp");
        if (!(lesSoldats.contains(r2) || r2 == chef)) throw new InvalidParameterException("Le deuxième romain n'est pas dans le camp");
        if (r1 == r2) throw new InvalidParameterException("Les romains ne se dise pas bonjour à eux même");
        if (!r1.estMieuxGrade(r2)) System.out.println("Je te salue " + r2.getGrade() + " " +r2.getNom() + " je suis " + r1.getNom() + " !");
        else System.out.println("C'est à moi à te saluer " + r1.getGrade() +" " + r1.getNom() + " je suis " + r1.getNom() + " !");
    }

    @Override
    public String toString(){
        String chaine = "Bienvenue dans le camp des romain: " + this.nom + "\n ";
        chaine = chaine + "Le camp à pour chef: " + chef.getNom() + "\n";
        for (Romain r: lesSoldats) {
            chaine = chaine + "   " + r.getNom() + "--> " +  r.getGrade() + "\n";
        }
        return chaine;
    }

    @Override
    public Set<Mechant> getCombattants() {
        Set<Mechant> combattants = new HashSet<>();
        combattants.addAll(lesSoldats);
        return combattants;
    }

    public void setChef(Romain chef) {
        this.chef = chef;
    }
}
