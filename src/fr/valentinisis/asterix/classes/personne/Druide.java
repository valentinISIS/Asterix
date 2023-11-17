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
    public void utiliserPotion(int nouvellePotion) {
        // Logique pour utiliser la potion
        if (nouvellePotion >= VALEUR_MIN && nouvellePotion <= VALEUR_MAX) {
            this.potion = nouvellePotion;
            System.out.println("Le Druide a utilisé une nouvelle potion. Nouvelle valeur de la potion : " + potion);
        } else {
            System.out.println("La valeur de la potion doit être comprise entre " + VALEUR_MIN + " et " + VALEUR_MAX);
        }
    }

}
