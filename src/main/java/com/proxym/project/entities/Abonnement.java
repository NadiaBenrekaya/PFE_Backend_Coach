package com.proxym.project.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Abonnement {
    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "coach_id")
    Coach coach;

    @ManyToOne
    @JoinColumn(name = "pack_id")
    Pack pack;

    Date datedebut;
    Date datefin;

}
