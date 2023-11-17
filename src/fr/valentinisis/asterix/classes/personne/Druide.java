package fr.valentinisis.asterix.classes.personne;
import java.util.Random;
public class Druide extends Gaulois {

    private static final int VALEUR_MIN = 1;
    private static final int VALEUR_MAX =20 ;
    private int potion = 0;


    public Druide(String nom, int force) {
        super(nom,force,"druide");
    }


    public void fabriquerPotion() {
        // Logique pour fabriquer la potion
        this.potion = new Random().nextInt(VALEUR_MIN, VALEUR_MAX+1);

        System.out.println("Le Druide a fabriqué une nouvelle potion. Nouvelle valeur de la potion : " + potion);
    }

    public int getPotion() {
        return potion;
    }
}
