package fr.valentinisis.asterix.classes.personne;

public class Mechant extends Personne  {
private int ForceCombat;
public Mechant(String nom ,int force ,int ForceCombat){
    super(nom,force);
    this.ForceCombat=ForceCombat;
}
    public int getForceCombat(){
    return ForceCombat;
    }
//public void recupererForce() {
      //  {}
}
