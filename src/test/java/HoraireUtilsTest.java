import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ch.heigvd.dai.*;
import java.util.List;
import java.util.ArrayList;

public class HoraireUtilsTest {

    private List<Lecon> lecons;
    private Professeur professeur;

    @BeforeEach
    public void setUp() {
        professeur = new Professeur("Pier", "Donini", "PDO");
        lecons = new ArrayList<>();
        lecons.add(new Lecon("POO", 3, 6, 2, "H02", professeur));
        lecons.add(new Lecon("TIC", 2, 9, 1, "F06", null));
    }

    @Test
    public void testAfficherHoraire() {
        String horaire = HoraireUtils.afficherHoraire(lecons, "Emploi du temps");
        assertNotNull(horaire);
        assertTrue(horaire.contains("Emploi du temps"));
        assertTrue(horaire.contains("POO H02 PDO"));
        assertTrue(horaire.contains("TIC F06 "));
    }
}
