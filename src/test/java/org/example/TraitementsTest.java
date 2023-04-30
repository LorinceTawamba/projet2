package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TraitementsTest {
    int[] tab;

    @BeforeEach
    void setUp() {
        tab = new int[]{32, -5, 28, 48, -10};
    }

    @Test
    @Order(1)
    void rechercherPosition() {
        // Donnees
        // Traitements
        Traitements traitements = new Traitements(tab);
        int pos = traitements.rechercherPosition(33);
        // Verification
        assertNotEquals(-1, pos);
    }
}