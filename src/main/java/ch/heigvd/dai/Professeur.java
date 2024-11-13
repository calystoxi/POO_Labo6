package ch.heigvd.dai;

import java.util.ArrayList;
import java.util.List;

public class Professeur extends Personne {
    private final String abreviation;
    private final List<Lecon> lecons = new ArrayList<>();

    public Professeur(String nom, String prenom, String abreviation) {
        super(nom, prenom);
        this.abreviation = abreviation;
    }

    public String abreviation() {
        return abreviation;
    }
    public String horaire(List<Lecon> lecons) {
        List<Lecon> leconsProfesseur = new ArrayList<>();
        for (Lecon lecon : lecons) {
            if (lecon.getProfesseur() != null && lecon.getProfesseur().equals(this)) {
                leconsProfesseur.add(lecon);
            }
        }
        String titre = String.format("-- Horaire Prof. %s %s (%s)", prenom, nom, abreviation);
        return HoraireUtils.afficherHoraire(leconsProfesseur, titre);
    }

    @Override
    public String toString() {
        return "Prof. " + prenom + " " + nom + " (" + abreviation() + ")";
    }
}
