package org.school.hei.frais;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Frai {
    private int id;
    private String label;
    private double montantTotal;
    private Instant deadline;
    private Student student;
    private List<Paiment> payments = new ArrayList<>();

    public void addPayment(Paiment p) {
        payments.add(p);
    }

    public double getTotalPaid() {
        double total = 0;
        for (Paiment p : payments) {
            total += p.getMontant();
        }
        return total;
    }
}