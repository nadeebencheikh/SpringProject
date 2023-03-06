package com.esprit.springproject.entities.controller;

import com.esprit.springproject.entities.Inscription;
import com.esprit.springproject.entities.Moniteur;
import com.esprit.springproject.services.InscriptionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/inscri")
public class InscriptionController {
    InscriptionService is;
    @GetMapping("/retrieve-all-inscriptions")
    public List<Inscription> getInscription(){
        return is.retrieveAllInscription();
    }
    @PostMapping("/add-inscription")
    public void addInscri(@RequestBody Inscription in) {
       is.addInscription(in);
    }
    @PutMapping("/update-inscription")
    public void updateInscri(@RequestBody Inscription in){
        is.updateInscription(in);
    }
    @DeleteMapping("/delete-inscription/{id}")
    public void deleteInscri(@PathVariable("id") Integer id){
       is.deleteInscription(id);
    }
}
