package ch.heigvd.dai;

public class Etudiant extends Personne{
    private final int matricule;
    private Groupe group;
    public Etudiant(String nom, String prenom, int matricule) {
        super(nom, prenom);
        this.matricule = matricule;
    }
    public void setGroup(Groupe grp) {
        this.group = grp;
    }

    @Override
    public String toString() {
        return "Etud. " + super.toString() + " (#" + matricule + ")" + ((group != null) ? " - " + group.nom() : "");
    }
}
