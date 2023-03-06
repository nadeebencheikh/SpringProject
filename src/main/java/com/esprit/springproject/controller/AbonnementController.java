package com.esprit.springproject.controller;

import com.esprit.springproject.entities.Abonnement;
import com.esprit.springproject.services.AbonnementService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/abonn")
public class AbonnementController {
    AbonnementService as;
    @GetMapping("/retrieve-all-abonn")
    public List<Abonnement> getAbonnements(){
        return as.retrieveAllAbonnement();
    }
    @PostMapping("/add-abonn")
    public void addAbonn(@RequestBody Abonnement ab) {
        as.addAbonnement(ab);
    }
    @PutMapping("/update-abonn")
    public void updateAbonn(@RequestBody Abonnement ab){

       as.updateAbonnement(ab);
    }

    @DeleteMapping("/delete-abonn/{id}")
    public void deleteAbonn(@PathVariable("id") Integer id){

       as.deleteAbonnement(id);
    }
}
