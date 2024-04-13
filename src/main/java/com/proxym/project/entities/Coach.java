package com.proxym.project.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue("Entraineur")
public class Coach extends User {
    @Id
    @GeneratedValue
    private Integer id;
    private String specialite;
    private Float tarif;
    @OneToMany(mappedBy = "coach")
    private List<Trainee> trainees;
    @OneToMany(mappedBy = "coach",cascade = CascadeType.ALL)
    Set<Demande> demandes;

    @OneToMany(mappedBy = "coach")
    private List<Programme> programmes;

    @OneToMany(mappedBy = "coach")
    private List<Notification> notifications;

    @OneToMany(mappedBy = "coach")
    Set<Abonnement> abonnements;


    /*@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "demande",
            joinColumns = @JoinColumn(name = "coach_id"),
            inverseJoinColumns = @JoinColumn(name = "trainee_id")
    )
    private List<Trainee> entraineurs;*/

}
