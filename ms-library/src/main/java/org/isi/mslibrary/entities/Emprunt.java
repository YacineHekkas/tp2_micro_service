package org.isi.mslibrary.entities;

import jakarta.persistence.*;
import lombok.*;
import org.isi.mslibrary.models.Etudiant;

import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emprunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "livre_id")
    private Livre livre;

    private Long etudiantId;

    @Temporal(TemporalType.DATE)
    private Date dateEmprunt;

    @Temporal(TemporalType.DATE)
    private Date dateRetour;

    @Transient
    private Etudiant etudiant;
}
