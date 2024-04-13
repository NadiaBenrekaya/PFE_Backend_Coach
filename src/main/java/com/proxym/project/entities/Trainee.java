package com.proxym.project.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Trainee extends User {
    @Id
    @GeneratedValue
    private Integer id;
    private String objectif;
    private String avis;
    private Date DateofBirth;
    private Double height;
    private Double weight;
    @ManyToOne
    @JoinColumn(name = "coach_id")
    private Coach coach;

    @OneToMany(mappedBy = "trainee")
    Set<Demande> demandes;

    @OneToOne(mappedBy = "trainee")
    private Programme programme;




}
