package com.msgroups.msscolarite.entities;
import com.msgroups.msscolarite.models.Formation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity
@Data //Génère automatiquement les getters, setters, toString(), equals() et hashCode().
@AllArgsConstructor
@NoArgsConstructor

public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String promo;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    @Temporal(TemporalType.DATE) // Spécifie comment une date doit être stockée en base de données avec JPA.
    private Date dateInscription;

    @ManyToOne
    @JoinColumn(name = "idEtablissement")
    @JsonIgnore
    private Etablissement etablissement;

    private Long idFormation;

    @Transient //Utilisée en JPA pour indiquer qu’un attribut ne doit pas être stocké dans la base de données
    private Formation formation;
}