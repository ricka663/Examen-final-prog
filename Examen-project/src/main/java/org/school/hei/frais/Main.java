package org.school.hei.frais;

import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        Student Rakoto = new Student(1, "Rakoto", "Jean");

        // frais scolaire
        Frai frais = new Frai(101, "Frais d'inscription", 500.0, Instant.now(), Rakoto, null);

        // Ajouter
        frais.addPayment(new Paiment(1, 200.0, Instant.now()));
        frais.addPayment(new Paiment(2, 300.0, Instant.now()));

        System.out.println("Étudiant :" + Rakoto.getNom() +" " + Rakoto.getPrenom());
        System.out.println("Frais :" + frais.getLabel() + "(" + frais.getMontantTotal() + " Ar)");
        System.out.println("Total payé :" + frais.getTotalPaid() + "Ar");

        if (frais.getTotalPaid() == frais.getMontantTotal()) {
            System.out.println("Frais totals payé");
        } else {
            System.out.println("Frais pas encore payé");
        }
    }
}
