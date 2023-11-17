package fr.valentinisis.asterix.classes.personne;

public class Gaulois extends Personne{
        private String metier;


        public Gaulois(String nom, int force, String metier) {
            super(nom, force);
            this.metier = metier;

        }

        public String getMetier() {
            return metier;
        }

        public void setMetier(String metier) {
            this.metier = metier;
        }

    public void boirePotion(int montant) {
        // Correction ici
        setForce(getForce() + montant);
        System.out.println(getNom() + " boit une potion. Nouvelle force : " + getForce());
    }

    public void perdreForce(int montant){
            setForce(Math.max(0, getForce()-montant));
    }
}


