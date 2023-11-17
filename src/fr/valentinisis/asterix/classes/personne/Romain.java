package fr.valentinisis.asterix.classes.personne;

public class Romain extends Mechant{
    private Grade grade;
    public Romain (String nom, int force , int ForceCombat ,Grade grade){
        super(nom,force, ForceCombat);
        this.grade=grade;
    }
public Grade getGrade()
{return grade;}
//
}
