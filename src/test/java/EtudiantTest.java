import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ch.heigvd.dai.*;

public class EtudiantTest {

    private Etudiant etudiant;

    @BeforeEach
    public void setUp() {
        etudiant = new Etudiant("John", "Lennon", 1234);
    }

    @Test
    public void testToStringSansGroupe() {
        // Vérification que l'Etudiant sans groupe retourne la bonne chaîne
        assertEquals("Etud. Lennon John (#1234)", etudiant.toString());
    }

}
