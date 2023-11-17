package fr.valentinisis.asterix.classes.lieu;

import fr.valentinisis.asterix.classes.personne.Druide;
import fr.valentinisis.asterix.classes.personne.Gaulois;

import java.security.InvalidParameterException;
import java.util.HashSet;
import java.util.Set;

public class Village {
    private String nom;
    private Gaulois chef;
    private Druide druide;
    private Set<Gaulois> lesGaulois = new HashSet<>();

    public Village(String nom, Gaulois chef, Druide druide) {
        this.nom = nom;
        this.chef = chef;
        this.druide = druide;
    }

    public void addGaulois(Gaulois g){
        if (g instanceof Druide) throw new InvalidParameterException("Il ne peut avoir qu'un druide dans le village");
        lesGaulois.add(g);
    }

    public void rencontrer(Gaulois g1, Gaulois g2){
        if (!(lesGaulois.contains(g1) || chef == g1 || (Gaulois) druide == g1)) throw new InvalidParameterException("Le premier gaulois n'est pas dans le village");
        if (!(lesGaulois.contains(g2) || chef == g2 || (Gaulois) druide == g2)) throw new InvalidParameterException("Le deuxième gaulois n'est pas dans le village");
        System.out.println("Bonjour, je suis " + g1.getNom() + " !");
        System.out.println("Bonjour, moi c'est " + g2.getNom() + " !");
    }

    @Override
    public String toString() {
        String chaine =  "Bienvenue dans le village gaulois: " + this.nom;
        chaine = chaine + "Le village à pour chef: " + chef.getNom() + "\n";
        chaine = chaine + "Le village à pour druide: " + druide.getNom() + "\n";
        for (Gaulois g: lesGaulois) {
            chaine = chaine + "   " + g.getNom() + "--> " +  g.getMetier() + "\n";
        }
        return chaine;
    }

    public void preparerDefense(){
        druide.fabriquerPotion();
        int potion = druide.getPotion();
        for (Gaulois g: lesGaulois) {
             g.boirePotion(potion);
        }
    }

    public Set<Gaulois> getLesGaulois() {
        return lesGaulois;
    }

    public void setChef(Gaulois chef) {
        this.chef = chef;
    }

    public void setDruide(Druide druide) {
        this.druide = druide;
    }
}
