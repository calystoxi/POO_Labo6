import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ch.heigvd.dai.*;

import java.util.List;

public class ProfesseurTest {

    private Professeur professeur;
    private Lecon lecon;

    @BeforeEach
    public void setUp() {
        professeur = new Professeur("Pier", "Donini", "PDO");
        lecon = new Lecon("POO", 3, 6, 2, "H02", professeur);
    }

    @Test
    public void testAbreviation() {
        assertEquals("PDO", professeur.abreviation());
    }

    @Test
    public void testHoraire() {
        String horaire = professeur.horaire(List.of(lecon));
        assertNotNull(horaire);
        assertTrue(horaire.contains("Prof. Pier Donini (PDO)"));
        assertTrue(horaire.contains("POO H02"));
    }
}

