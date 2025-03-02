package org.isi.mslibrary;


import org.isi.mslibrary.entities.Emprunt;
import org.isi.mslibrary.entities.Livre;
import org.isi.mslibrary.repositories.EmpruntRepository;
import org.isi.mslibrary.repositories.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.sql.Date;

@SpringBootApplication
@EnableFeignClients

public class MsLibraryApplication implements CommandLineRunner {

    @Autowired
    private LivreRepository livreRepository;

    @Autowired
    private EmpruntRepository empruntRepository;

    public static void main(String[] args) {
        SpringApplication.run(MsLibraryApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // 📚 Insérer des livres
        Livre livre1 = livreRepository.save(new Livre(null, "Spring Boot en Action", "Craig Walls", true));
        Livre livre2 = livreRepository.save(new Livre(null, "Microservices avec Spring", "John Doe", true));
        Livre livre3 = livreRepository.save(new Livre(null, "Java Avancé", "James Gosling", true));

        // 📖 Insérer des emprunts
        empruntRepository.save(new Emprunt( null, livre1,1L, Date.valueOf("2025-10-11"), Date.valueOf("2004-12-11"),null));
        empruntRepository.save(new Emprunt( null, livre2,1L, Date.valueOf("2025-10-11"), Date.valueOf("2004-12-11"),null));

    }

}
