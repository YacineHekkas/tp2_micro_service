package com.msgroups.msformation.entities;

import com.msgroups.msformation.models.Etudiant;
import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor


public class Formation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFormation;

    @Column(nullable = false)
    private String nom;

    private int duree;

    @Transient
    private Collection<Etudiant> etudiant;

}

