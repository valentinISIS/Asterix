package fr.valentinisis.asterix.classes.personne;

public class Mechant extends Personne  {
    private int forceCombat;
    public Mechant(String nom ,int force){
        super(nom,force);
        this.forceCombat = force;
    }
    public int getForceCombat(){
        return forceCombat;
    }
    public void recupererForce() {
        forceCombat = this.getForce();
    }
}
