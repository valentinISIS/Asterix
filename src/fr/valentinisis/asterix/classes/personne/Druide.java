package fr.valentinisis.asterix.classes.personne;
import java.util.Random;
public class Druide extends Gaulois {

    private static final int VALEUR_MIN = 1;
    private static final int VALEUR_MAX =20 ;
    private int potion;


    public Druide(String nom, int force,String metier ,int potion) {
        super(nom,force,metier);
        this.potion = potion;
    }


    public void fabriquerPotion() {
        // Logique pour fabriquer la potion
        Random random = new Random();
        int nouvellePotion = VALEUR_MIN + random.nextInt(VALEUR_MAX - VALEUR_MIN + 1);
        this.potion = nouvellePotion;

        System.out.println("Le Druide a fabriqué une nouvelle potion. Nouvelle valeur de la potion : " + potion);
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
