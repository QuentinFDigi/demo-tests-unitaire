package fr.diginamic.utils;

import fr.diginamic.enumerations.Saison;
import org.junit.jupiter.api.Test;

import static fr.diginamic.utils.StringUtils.levenshteinDistance;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void levenshteinDistanceTest() {
        CharSequence lhs = "chat";
        CharSequence rhs = "chats";
        CharSequence lhs2 = "machins";
        CharSequence rhs2 = "machines";
        CharSequence lhs3 = "aviron";
        CharSequence rhs3 = "avion";
        CharSequence lhs4 = "distance";
        CharSequence rhs4 = "instance";
        CharSequence lhs5 = "Chien";
        CharSequence rhs5 = "Chine";

        assertEquals(1,levenshteinDistance(lhs,rhs));
        assertEquals(1,levenshteinDistance(lhs2,rhs2));
        assertEquals(1,levenshteinDistance(lhs3,rhs3));
        assertEquals(2,levenshteinDistance(lhs4,rhs4));
        assertEquals(2,levenshteinDistance(lhs5,rhs5));
    }

    @Test
    void levenshteinDistanceTestAvecNull() {
        CharSequence lhs = "chat";
        CharSequence rhs = null;

        assertEquals(-1,levenshteinDistance(lhs,rhs));
    }
}