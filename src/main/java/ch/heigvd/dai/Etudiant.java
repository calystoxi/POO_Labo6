package ch.heigvd.dai;

public class Etudiant extends Personne{
    private final int matricule;
    private Groupe groupe;
    public Etudiant(String nom, String prenom, int matricule) {
        super(nom, prenom);
        this.matricule = matricule;
    }

    @Override
    public String toString() {
        String groupeNom = (groupe != null) ? " - " + groupe.getNom() : "";
        return "Etud. "+prenom+" "+nom+" (#"+matricule+")"+groupeNom;
    }
}
