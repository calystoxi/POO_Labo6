package ch.heigvd.dai;

public class Lecon {
    private final Professeur professeur;
    private final String matiere;
    private final int jourSemaine;
    private final int periodeDebut;
    private final int duree;
    private String salle;
    public Lecon(String matiere, int jourSemaine, int periodeDebut, int duree, String salle, Professeur professeur) {
        this.matiere = matiere;
        this.jourSemaine = jourSemaine;
        this.periodeDebut = periodeDebut;
        this.duree = duree;
        this.salle = salle;
        this.professeur = professeur;
    }

    public int getDuree() {
        return duree;
    }

    public int getPeriodeDebut() {
        return periodeDebut;
    }

    public int getJourSemaine() {
        return jourSemaine;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public String getMatiere() {
        return matiere;
    }

    public String getSalle() {
        return salle;
    }

    @Override
    public String toString() {
        return matiere+ " "+salle+" "+professeur.abreviation();
    }
}
