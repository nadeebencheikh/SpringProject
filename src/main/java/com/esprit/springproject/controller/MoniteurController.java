package com.esprit.springproject.controller;

import com.esprit.springproject.entities.Moniteur;
import com.esprit.springproject.services.MoniteurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/moniteur")
public class MoniteurController {

    MoniteurService ms ;

            @GetMapping("/retrieve-all-moniteurs")
        public List<Moniteur> getMonitor(){
            return ms.retrieveAllMoniteurs();
        }
           @PostMapping("/add-moniteur")
        public void addMonitor(@RequestBody Moniteur mn) {
               ms.addMoniteur(mn);
           }
        @PutMapping("/update-moniteur")
        public void updateMonitor(@RequestBody Moniteur mn){
            ms.updateMoniteur(mn);
        }
        @DeleteMapping("/delete-moniteur/{id}")
        public void deleteMonitor(@PathVariable("id") Integer id){
            ms.deleteMoniteur(id);
        }





}
