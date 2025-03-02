package org.isi.mslibrary.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Etudiant {

    private Long idEtudiant;

    private String nom;

    private String promo;

    private Date dateNaissance;

    private Date dateInscription;


}
