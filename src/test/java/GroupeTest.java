import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ch.heigvd.dai.*;

import java.util.List;

public class GroupeTest {

    private Groupe groupe;
    private Etudiant etudiant1;
    private Etudiant etudiant2;

    @BeforeEach
    public void setUp() {
        groupe = new Groupe("SI", 6, 1);
        etudiant1 = new Etudiant("John", "Lennon", 1234);
        etudiant2 = new Etudiant("Paul", "McCartney", 2341);
    }

    @Test
    public void testGetNom() {
        assertEquals("SI6-1", groupe.getNom());
    }
}
