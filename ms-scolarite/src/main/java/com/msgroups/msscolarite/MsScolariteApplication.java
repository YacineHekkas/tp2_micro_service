package com.msgroups.msscolarite;

import com.msgroups.msscolarite.entities.Etablissement;
import com.msgroups.msscolarite.entities.Etudiant;
import com.msgroups.msscolarite.repositories.EtablissementRep;
import com.msgroups.msscolarite.repositories.EtudiantRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.sql.Date;


@SpringBootApplication
@EnableFeignClients
public class MsScolariteApplication implements CommandLineRunner {

    @Autowired
    EtablissementRep etablissementRep;
    @Autowired
    private EtudiantRep etudiantRep;





    public static void main(String[] args) {
        SpringApplication.run(MsScolariteApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception{
        Etablissement e1 = etablissementRep.save(new Etablissement(null, "esi-sba", null));
        Etablissement e2 = etablissementRep.save(new Etablissement(null, "esi-alger", null));
        Etablissement e3 = etablissementRep.save(new Etablissement(null, "ensia", null));

        etudiantRep.save(new Etudiant(null, "walid", "isi", Date.valueOf("2004-10-11"), Date.valueOf("2004-10-11"), e1, 1L, null));
        etudiantRep.save(new Etudiant(null, "yacine", "isi", Date.valueOf("2002-10-12"), Date.valueOf("2002-10-12"), e2, 1L, null));
        etudiantRep.save(new Etudiant(null, "kooko", "isi", Date.valueOf("2002-10-12"), Date.valueOf("2002-10-12"), e3, 1L, null));

    }

}