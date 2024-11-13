package fr.diginamic.enumerations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaisonTest {

    @Test
    public void valueOfLibelleTest() {
        String saison = "Hiver";
        assertEquals(Saison.HIVER,Saison.valueOfLibelle(saison));
    }

    @Test
    public void valueOfLibelleTestAvecNull() {
        String saison = null;
        assertNull(Saison.valueOfLibelle(saison));
    }
}