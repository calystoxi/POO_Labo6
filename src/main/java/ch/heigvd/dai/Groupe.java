package ch.heigvd.dai;

import java.util.ArrayList;
import java.util.List;

public class Groupe {
    private final String orientation;
    private final int trimestre;
    private final int numero;
    private final List<Etudiant> etudiants;
    private final List<Lecon> lecons;

    public Groupe(String orientation, int trimestre, int numero) {
        this.orientation = orientation;
        this.trimestre = trimestre;
        this.numero = numero;
        this.etudiants = new ArrayList<>();
        this.lecons = new ArrayList<>();
    }

    public void ajouterEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
    }

    public void ajouterLecon(Lecon lecon) {
        lecons.add(lecon);
    }

    public String getNom() {
        return String.format("%s%d-%d", orientation, trimestre, numero);
    }

    public String afficherHoraire() {
        String titre = String.format("-- Horaire du groupe %s (%d étudiants)", getNom(), etudiants.size());
        return HoraireUtils.afficherHoraire(lecons, titre);
    }
}
