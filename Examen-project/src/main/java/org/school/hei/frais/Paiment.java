package org.school.hei.frais;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paiment {
    private int id;
    private double montant;
    private Instant date;
}