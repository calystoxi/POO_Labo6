package ch.heigvd.dai;

import java.util.Arrays;

public class Lecon {
    private final Professeur professeur;
    private final String matiere;
    private final int jourSemaine;
    private final int periodeDebut;
    private final int duree;
    private final String salle;
    public Lecon(String matiere, int jourSemaine, int periodeDebut, int duree,
                 String salle) {
        this.matiere = matiere;
        this.jourSemaine = jourSemaine;
        this.periodeDebut = periodeDebut;
        this.duree = duree;
        this.salle = salle;
        this.professeur = null;
    }
    public Lecon(String matiere, int jourSemaine, int periodeDebut, int duree,
                 String salle, Professeur prof) {
        this.matiere = matiere;
        this.jourSemaine = jourSemaine;
        this.periodeDebut = periodeDebut;
        this.duree = duree;
        this.salle = salle;
        this.professeur= prof;
        if (prof != null)
            this.professeur.addLecon(this);
    }

    static public String horaire(Lecon[] lecons){
        final int nb_periodes = 11;
        final int nb_jours = 5;
        String[][] grille = new String[nb_periodes][nb_jours];
        String[][] grille2 = new String[nb_periodes][nb_jours];
        StringBuilder sb = new StringBuilder();
        String tiret = "-".repeat(13);
        String[] separator = new String[nb_jours];
        Arrays.fill(separator, tiret);

        for (int i = 0; i < nb_periodes; i++) {
            for (int j = 0; j < nb_jours; j++) {
                grille[i][j] = "";
                grille2[i][j] = "";
            }
        }

        for (Lecon lecon : lecons) {
            int jour = lecon.jourSemaine - 1;
            int debut = lecon.periodeDebut- 1;
            for (int i = 0; i < lecon.duree; i++) {
                grille[debut + i][jour] = String.format("%s %s %s", lecon.matiere, lecon.salle,
                        lecon.professeur != null ? lecon.professeur.abreviation() : "");
                grille2[debut + i][jour] = (i > 0) ? "Y" : "X";
                if (i > 0) grille[debut + i][jour] = " ";
            }
        }

        sb.append("\n\n")
                .append("     | Lun         | Mar         | Mer         | Jeu         | Ven         |\n")
                .append(String.format("%5s|", ""));

        for (String s : separator) sb.append(s).append("|");
        sb.append("\n");

        String[] horaires = { " 8:30", " 9:15", "10:25", "11:15", "12:00", "13:15", "14:00", "14:55", "15:45", "16:35", "17:20" };

        for (int i = 0; i < nb_periodes; i++) {
            sb.append(horaires[i]).append("|");
            for (int j = 0; j < nb_jours; j++) {
                sb.append(String.format("%-13s|", grille[i][j]));
            }
            sb.append("\n").append(String.format("%5s|", ""));

            for (int j = 0; j < nb_jours; j++) {
                if (i < nb_periodes - 1 && grille2[i + 1][j].equals("Y")) {
                    separator[j] = "%13s";
                    sb.append(String.format(separator[j] + "|", ""));
                    separator[j] = tiret;
                } else {
                    sb.append(String.format(tiret + "|", ""));
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
