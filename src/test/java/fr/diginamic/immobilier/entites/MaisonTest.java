package fr.diginamic.immobilier.entites;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaisonTest {

    public static Maison maison;

    @BeforeEach
    public void setUpBeforeEachTest(){
        maison = new Maison();
    }

    @Test
    void ajouterPieceTest() {
        Chambre chambre = new Chambre(3,15);
        int nbPieces = maison.getPieces().length;
        nbPieces++;
        maison.ajouterPiece(chambre);
        assertEquals(nbPieces,maison.getPieces().length);
    }
    @Test
    void ajouterPieceTestAvecNull() {
        int nbPieces = maison.getPieces().length;
        maison.ajouterPiece(null);
        assertEquals(nbPieces,maison.getPieces().length);
    }

    @Test
    void nbPiecesTest() {
        int nbPieces = maison.getPieces().length;
        assertEquals(nbPieces,maison.nbPieces());
    }

    @Test
    void superficieEtageTest() {
        int choixEtg = 3;
        ajouterPieceTest();
        assertEquals(15,maison.superficieEtage(choixEtg));
    }

//    @Test
//    void superficieEtageTestAvecNull() {
//        ajouterPieceTest();
//        assertEquals(15,maison.superficieEtage(null));
//    }

    @Test
    void superficieTypePieceTest() {
        String choixTypePiece = "Chambre";
        ajouterPieceTest();
        assertEquals(15,maison.superficieTypePiece(choixTypePiece));
    }

    @Test
    void superficieTypePieceTestAvecNull() {
        String choixTypePiece = null;
        ajouterPieceTest();
        assertEquals(0,maison.superficieTypePiece(choixTypePiece));
    }

    @Test
    void calculerSurfaceTest() {
        ajouterPieceTest();
        assertEquals(15,maison.calculerSurface());
    }
}