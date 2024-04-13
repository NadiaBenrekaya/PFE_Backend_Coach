package com.proxym.project.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Pack {
    @Id
    @GeneratedValue
    private Integer id;
    private String nom;
    private String description;
    private float prix;

    @OneToMany(mappedBy = "pack")
    Set<Abonnement> abonnements;

}
