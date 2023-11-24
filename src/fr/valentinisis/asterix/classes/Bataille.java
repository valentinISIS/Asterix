package fr.valentinisis.asterix.classes;

import fr.valentinisis.asterix.classes.lieu.*;
import fr.valentinisis.asterix.classes.strategie.Strategie;

public class Bataille {
    private Village villageGaulois;
    private ILieuMechant lieuMechant;

    public Bataille(Village villageGaulois, ILieuMechant lieuMechant) {
        this.villageGaulois = villageGaulois;
        this.lieuMechant = lieuMechant;
    }

    public void bagarre(Strategie s){
        villageGaulois.preparerDefense();
        s.effectuerCombat(villageGaulois.getLesGaulois(), lieuMechant.getCombattants());
    }
}
