import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ch.heigvd.dai.*;
public class LeconTest {

    private Professeur professeur;
    private Lecon lecon;

    @BeforeEach
    public void setUp() {
        professeur = new Professeur("Pier", "Donini", "PDO");
        lecon = new Lecon("POO", 3, 6, 2, "H02", professeur);
    }

    @Test
    public void testGetMatiere() {
        assertEquals("POO", lecon.getMatiere());
    }

    @Test
    public void testGetJourSemaine() {
        assertEquals(3, lecon.getJourSemaine());
    }

    @Test
    public void testToString() {
        assertEquals("POO H02 PDO", lecon.toString());
    }
}

