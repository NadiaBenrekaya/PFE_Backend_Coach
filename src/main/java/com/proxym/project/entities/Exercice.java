package com.proxym.project.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Exercice {
    @Id
    @GeneratedValue
    private Integer id;
    private String nom;

    private String description;
    private int duree;

    @ManyToOne
    @JoinColumn(name = "programme_id")
    private Programme programme;

}
