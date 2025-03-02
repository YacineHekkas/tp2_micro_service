package org.isi.mslibrary.repositories;

import feign.Param;
import org.isi.mslibrary.entities.Emprunt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.sql.Date;


@RepositoryRestResource
public interface EmpruntRepository extends JpaRepository<Emprunt, Long> {
    @Query("SELECT COUNT(e) FROM Emprunt e WHERE e.dateEmprunt BETWEEN :dateDebut AND :dateFin")
    Long countEmpruntsEntreDeuxDates(@Param("dateDebut") Date dateDebut, @Param("dateFin") Date dateFin);
}