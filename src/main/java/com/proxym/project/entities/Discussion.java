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
public class Discussion {
    @Id
    @GeneratedValue
    private Integer id;
    private String mesage;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "discussion")
    private List<Message> messages;
}
