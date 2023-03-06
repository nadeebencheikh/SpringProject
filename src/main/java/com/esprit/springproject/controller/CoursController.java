package com.esprit.springproject.controller;

import com.esprit.springproject.entities.Cours;
import com.esprit.springproject.services.CourService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/cours")
public class CoursController {

    CourService cs;
    @GetMapping("/retrieve-all-cours")
    public List<Cours> getCours(){
        return cs.retrieveAllCours();
    }
    @PostMapping("/add-cours")
    public void addCours(@RequestBody Cours cr) {
        cs.addcours(cr);
    }
    @PutMapping("/update-cours")
    public void updateCours(@RequestBody Cours cr){
        cs.updatecours(cr);
    }
    @DeleteMapping("/delete-cours/{id}")
    public void deleteCours(@PathVariable("id") Integer id){
        cs.deletecours(id);
    }
}
