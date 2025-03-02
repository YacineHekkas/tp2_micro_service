package org.isi.mslibrary.apis;

import org.isi.mslibrary.entities.Livre;
import org.isi.mslibrary.repositories.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livres")
public class LivreController {

    @Autowired
    private LivreRepository livreRepository;

    @GetMapping("/recherche/{cle}")
    public List<Livre> rechercherLivres(@PathVariable("cle") String  cle) {
        return livreRepository.findByTitreContaining(cle);
    }
}
