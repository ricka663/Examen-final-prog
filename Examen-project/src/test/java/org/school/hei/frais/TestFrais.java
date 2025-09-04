package org.school.hei.frais;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Instant;

public class TestFrais {

    @Test
    void testTotalPaid() {
        Student Rakoto = new Student(1, "Rakoto", "Jean");

        Frai frais = new Frai(101, "Frais d'inscription", 500.0, Instant.now(), Rakoto, null);

        frais.addPayment(new Paiment(1, 200.0, Instant.now()));
        frais.addPayment(new Paiment(2, 300.0, Instant.now()));

        assertEquals(500.0, frais.getTotalPaid());
    }

    @Test
    void testFraisPayeCompletement() {
        Student etu = new Student(2, "Rabe", "Andry");
        Frai frais = new Frai(102, "Frais bibliothèque", 300.0, Instant.now(), etu, null);

        frais.addPayment(new Paiment(3, 300.0, Instant.now()));

        assertTrue(frais.getTotalPaid() == frais.getMontantTotal());
    }
}
