package fr.valentinisis.asterix.classes.personne;

public enum Grade {
    CHEF(3),
    CENTURION(2),
    LEGIONNAIRE(1);

    private int valeur;

    Grade(int valeur) {
        this.valeur = valeur;
    }

    public int getValeur() {
        return valeur;
    }
}
