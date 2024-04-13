package com.proxym.project.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Programme {
    @Id
    @GeneratedValue
    private Integer id;

    private String nom;

    private String description;

    private int duree;

    @OneToOne
    @JoinColumn(name = "trainee_id") // Foreign key constraint
    private Trainee trainee;

    @OneToMany(mappedBy = "programme")
    private List<Exercice> exercices;

    @OneToOne
    @JoinColumn(name = "regime_alimentaire_id") // Foreign key constraint
    private RegimeAlimentaire regimeAlimentaire;

    @ManyToOne
    @JoinColumn(name = "coach_id")
    private Coach coach;

}
