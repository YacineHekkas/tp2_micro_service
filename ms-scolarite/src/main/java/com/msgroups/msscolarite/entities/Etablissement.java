package com.msgroups.msscolarite.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etablissement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtablissement;

    @Column(nullable = false)
    private String nom;


    @ToString.Exclude // --> Exclure de toString pour éviter la récursion infinie
    @OneToMany(mappedBy = "etablissement")
    private List<Etudiant> etudiantList;
}
