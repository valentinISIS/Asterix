package fr.valentinisis.asterix.classes.personne;

public class Druide extends Gaulois {

    private static final int VALEUR_MIN = 1;
    private static final int VALEUR_MAX =20 ;
    private int potion;


    public Druide(String nom, int force,String metier ,int potion) {
        super(nom,force,metier);
        this.potion = potion;
    }



    public void boirePotion(int montant) {
        this.potion += montant;
        this.setForce(this.getForce() + montant);
        System.out.println( getNom() + " boit une potion. Nouvelle force : " + getForce());
    }


}
