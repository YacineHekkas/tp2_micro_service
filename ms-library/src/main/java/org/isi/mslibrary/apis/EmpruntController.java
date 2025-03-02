package org.isi.mslibrary.apis;



import org.isi.mslibrary.repositories.EmpruntRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.time.LocalDate;


@RestController
@RequestMapping("/emprunts")
public class EmpruntController {

    @Autowired
    private EmpruntRepository empruntRepository;

    @GetMapping("/count")
    public Long nombreEmpruntsEntreDeuxDates(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateDebut,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateFin) {

        System.out.println("dateDebut: " + dateDebut);
        System.out.println("dateFin: " + dateFin);

        java.sql.Date sqlDateDebut = java.sql.Date.valueOf(dateDebut);
        java.sql.Date sqlDateFin = java.sql.Date.valueOf(dateFin);

        return empruntRepository.countEmpruntsEntreDeuxDates(sqlDateDebut, sqlDateFin);
    }
}

