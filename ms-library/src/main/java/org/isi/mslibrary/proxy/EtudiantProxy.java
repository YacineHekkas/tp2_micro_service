package org.isi.mslibrary.proxy;

import org.isi.mslibrary.models.Etudiant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "ms-scolarite",url = "localhost:8080")

public interface EtudiantProxy {
    @GetMapping("/formations/{id}")
    public Etudiant getFormation(@PathVariable("id") Long idf);
}
