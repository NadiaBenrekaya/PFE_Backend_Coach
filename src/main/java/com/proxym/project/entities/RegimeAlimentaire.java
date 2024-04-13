package com.proxym.project.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class RegimeAlimentaire {
    @Id
    @GeneratedValue
    private int id;

    private String nom;

    private String dureeRecommandee;

    private String objectif;

    @OneToOne(mappedBy = "regimeAlimentaire")
    private Programme programme;
}
