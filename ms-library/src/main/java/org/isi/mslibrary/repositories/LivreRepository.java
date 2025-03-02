package org.isi.mslibrary.repositories;

import org.isi.mslibrary.entities.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource
public interface LivreRepository extends JpaRepository<Livre, Long> {
    List<Livre> findByTitreContaining(String motCle);

}
