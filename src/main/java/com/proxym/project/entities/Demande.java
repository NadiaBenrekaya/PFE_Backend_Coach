package com.proxym.project.entities;

import com.proxym.project.enumeration.StatusEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Demande {
    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "coach_id")
    Coach coach;

    @ManyToOne
    @JoinColumn(name = "trainee_id")
    Trainee trainee;

    private StatusEnum status;



}
