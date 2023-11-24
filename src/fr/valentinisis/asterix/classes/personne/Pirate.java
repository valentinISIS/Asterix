package fr.valentinisis.asterix.classes.personne;

import java.util.Random;

public class Pirate  extends Mechant {
    private String poste;

    public Pirate (String nom,int force,String poste ){
        super(nom, force);
        this.poste=poste;
    }
    public String getPoste() {
        return poste;
    }
//
}

