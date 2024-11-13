package ch.heigvd.dai;

import java.util.Arrays;

public class Groupe {
    private final String orientation;
    private final int trimestre;
    private final int numero;
    private Lecon[] lecons;
    private final Etudiant[] etudiants;

    public Groupe(int numero, String orientation, int trimestre,
                  Etudiant[] list) {
        this.orientation = orientation;
        this.trimestre = trimestre;
        this.numero = numero;
        this.lecons = new Lecon[0];
        this.etudiants = new Etudiant[list.length];
        for(int i = 0; i < list.length; i++) {
            list[i].setGroup(this);
            etudiants[i] = list[i];
        }
    }

    public String nom(){
        return orientation + trimestre + "-"+ numero;
    }
    public void setLecons(Lecon[] l){
        this.lecons = Arrays.copyOf(l,l.length);
    }
    public String horaire (){
        return "-- Horaire du group " + nom() + " (" + nombreEtudiants() + " " +
                "etudiants)\n\n" + Lecon.horaire(this.lecons);
    }
    public int nombreEtudiants() {
        return etudiants.length;
    }
}
