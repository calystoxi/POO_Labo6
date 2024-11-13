package ch.heigvd.dai;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Groupe il6_1 = new Groupe("IL", 6, 1);
        Groupe si6_1 = new Groupe("SI", 6, 1);

        Etudiant john = new Etudiant("Lennon", "John", 1234);
        Etudiant paul = new Etudiant("McCartney", "Paul", 2341);
        Etudiant ringo = new Etudiant("Starr", "Ringo", 3241);
        Etudiant george = new Etudiant("Harrison", "George", 4321);
        il6_1.ajouterEtudiant(john);
        il6_1.ajouterEtudiant(paul);
        il6_1.ajouterEtudiant(ringo);
        il6_1.ajouterEtudiant(george);

        Etudiant roger = new Etudiant("Waters", "Roger", 1324);
        Etudiant david = new Etudiant("Gilmour", "David", 4312);
        si6_1.ajouterEtudiant(roger);
        si6_1.ajouterEtudiant(david);

        Professeur pdo = new Professeur("Donini", "Pier", "PDO");
        Professeur dre = new Professeur("Rossier", "Daniel", "DRE");

        Lecon poo1 = new Lecon("POO", 3, 6, 2, "H02", pdo);
        Lecon poo2 = new Lecon("POO", 4, 6, 2, "H02", pdo);
        Lecon poo3 = new Lecon("POO", 4, 8, 2, "H02", pdo);
        Lecon sye = new Lecon("SYE", 1, 1, 2, "G01", dre);
        Lecon sye2 = new Lecon("SYE", 4, 3, 2, "A09", dre);
        Lecon tic = new Lecon("TIC", 2, 9, 1, "F06", null);
        List<Lecon> lecons = new ArrayList<>();
        lecons.add(poo1);
        lecons.add(poo2);
        lecons.add(poo3);
        lecons.add(sye);
        lecons.add(sye2);
        lecons.add(tic);

        il6_1.ajouterLecon(poo1);
        il6_1.ajouterLecon(poo2);
        il6_1.ajouterLecon(poo3);
        il6_1.ajouterLecon(sye);
        il6_1.ajouterLecon(sye2);
        il6_1.ajouterLecon(tic);

        List<Personne> personnes = new ArrayList<>();
        personnes.add(pdo);
        personnes.add(dre);
        personnes.add(john);
        personnes.add(paul);
        personnes.add(ringo);
        personnes.add(george);
        personnes.add(roger);
        personnes.add(david);

        System.out.println("-- Membres de l'école\n");
        for (Personne personne : personnes) {
            if (personne instanceof Etudiant etudiant) {
                Groupe groupeAssocie = etudiant == john || etudiant == paul || etudiant == ringo || etudiant == george
                        ? il6_1
                        : si6_1;
                System.out.printf("%s - %s\n", etudiant, groupeAssocie.getNom());
            } else {
                System.out.println(personne);
            }
        }
        System.out.println();
        System.out.println(il6_1.afficherHoraire());
        System.out.println(pdo.horaire(lecons));
    }
}
