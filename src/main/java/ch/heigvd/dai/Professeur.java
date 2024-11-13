package ch.heigvd.dai;

import java.util.Arrays;

public class Professeur extends Personne {
    private final String abreviation;
    private Lecon[] lecons;

    public Professeur(String nom, String prenom, String abreviation) {
        super(nom, prenom);
        this.abreviation = abreviation;
        this.lecons = new Lecon[0];
    }
    public Professeur(String nom, String prenom, String abreviation,
                      Lecon[] listLecon) {
        super(nom, prenom);
        this.abreviation = abreviation;
        this.lecons = Arrays.copyOf(listLecon, listLecon.length);
    }

    public String abreviation() {
        return abreviation;
    }

    public void addLecon(Lecon lesson) {
        this.lecons = Arrays.copyOf(this.lecons, this.lecons.length + 1);
        this.lecons[this.lecons.length - 1] = lesson;
    }
    public String toString(){
        return "Prof. " + super.toString() + " (" + abreviation + ") ";
    }
}
