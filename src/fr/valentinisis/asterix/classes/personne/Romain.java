package fr.valentinisis.asterix.classes.personne;

import java.util.Random;

public class Romain extends Mechant implements Comparable{
    private Grade grade;
    public Romain (String nom ,Grade grade){
        super(nom, new Random().nextInt(1, 6));
        this.grade=grade;
    }
    public Grade getGrade() {
        return grade;
    }

    public boolean estMieuxGrade(Romain unAutreRomain){
        return grade.getValeur() > unAutreRomain.getGrade().getValeur();
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Romain romain){
            return this.getForce() - romain.getForce();
        }
        return 1;
    }
}
