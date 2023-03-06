package com.esprit.springproject.controller;

import com.esprit.springproject.entities.Moniteur;
import com.esprit.springproject.entities.Skieur;
import com.esprit.springproject.services.SkieurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/skieur")
public class SkieurController {
    SkieurService ss;
    @GetMapping("/retrieve-all-skieurs")
    public List<Skieur> getSkieur(){
        return ss.retrieveAllSkieur();
    }
    @PostMapping("/add-skieur-abonnment")
    public void addSkieur1(@RequestBody Skieur s) {
        ss.addSkieur1(s);
    }
    @PostMapping("/add-skieur-inscription")
    public void addSkieur2(@RequestBody Skieur s) {
        ss.addSkieur2(s);
    }
    @PostMapping("/add-skieur")
    public void addSkieur(@RequestBody Skieur s) {
        ss.addSkieur(s);
    }
    @PutMapping("/update-skieur")
    public void updateSkieur(@RequestBody Skieur s){
        ss.updateSkieur(s);
    }
    @DeleteMapping("/delete-skieur/{id}")
    public void deleteSkieur(@PathVariable("id") Integer id){
        ss.deleteSkieur(id);
    }



















}
