package com.proxym.project.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Notification {
    @Id
    @GeneratedValue
    private Integer id;
    private String message;


    @ManyToOne
    @JoinColumn(name = "coach_id")
    private Coach coach;
}
