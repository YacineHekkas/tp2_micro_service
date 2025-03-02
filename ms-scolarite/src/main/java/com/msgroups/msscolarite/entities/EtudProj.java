package com.msgroups.msscolarite.entities;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(
        name = "projectionFormation",
        types = {Etudiant.class}
    )
public interface EtudProj {
    @Value("#{target.nom}")
    public String getNomEtudiant();

    @Value("#{target.etablissement.nom}")
    public String getNomEtablissement();

}
