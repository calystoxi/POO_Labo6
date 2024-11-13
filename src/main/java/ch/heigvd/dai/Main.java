package ch.heigvd.dai;

public class Main {
    public static void main(String[] args) {
        Professeur pdo = new Professeur("Donini", "Pier", "PDO");
        Professeur dre = new Professeur("Rossier", "Daniel", "DRE");

        Lecon poo1 = new Lecon("POO", 3, 6, 2, "H02", pdo);
        Lecon poo2 = new Lecon("POO", 4, 6, 2, "H02", pdo);
        Lecon poo3 = new Lecon("POO", 4, 8, 2, "H02", pdo);
        Lecon sye1 = new Lecon("SYE", 1, 1, 2, "G01", dre);
        Lecon sye2 = new Lecon("SYE", 4, 3, 2, "A09", dre);
        Lecon tic = new Lecon("TIC", 2, 9, 1, "F06", null);

        Etudiant john = new Etudiant("Lennon", "John", 1234);
        Etudiant paul = new Etudiant("McCartney", "Paul", 2341);
        Etudiant ringo = new Etudiant("Starr", "Ringo", 3241);
        Etudiant george = new Etudiant("Harrison", "George", 4321);
        Etudiant roger = new Etudiant("Waters", "Roger", 4321);
        Etudiant david = new Etudiant("Gilmour", "David", 4312);
        Groupe il6_1 = new Groupe(1,"IL",  6, new Etudiant[] {john, paul, ringo, george});
        Groupe si6_1 = new Groupe(1,"SI", 6, new Etudiant[] {roger, george});

        il6_1.setLecons(new Lecon[]{poo1,poo2,poo3,sye1,sye2,tic});
        si6_1.setLecons(new Lecon[]{poo1,poo2,poo3});

        Personne[] personnes = new Personne[]{pdo, dre, john, paul, ringo,
                george, roger, david};

        System.out.println("-- Membres de l'ecole\n");
        for(Personne i : personnes) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println(il6_1.horaire());
        System.out.println(si6_1.horaire());
    }
}
