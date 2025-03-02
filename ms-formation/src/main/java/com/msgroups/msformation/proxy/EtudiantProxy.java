package com.msgroups.msformation.proxy;


import com.msgroups.msformation.models.Etudiant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

@FeignClient(name = "ms-scolarite",url = "localhost:8080")
public interface EtudiantProxy {
    @GetMapping("/etudiants/search/findByIdFormation")
    public CollectionModel<Etudiant> getEtudiants(
            @RequestParam("idf") Long idf,
            @RequestParam("projection") String projection
    );
}
