package com.esprit.springproject.entities.controller;
import com.esprit.springproject.entities.Piste;
import com.esprit.springproject.services.PisteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/piste")
public class PisteController {
    PisteService ps;
    @GetMapping("/retrieve-all-Pistes")
    public List<Piste> getPiste(){
        return  ps.retrieveAllPiste();
    }
    @PostMapping("/add-Piste")
    public void addPiste(@RequestBody Piste p) {
        ps.addPiste(p);
    }
    @PutMapping("/update-piste")
    public void updatePiste(@RequestBody Piste p){
        ps.updatePiste(p);
    }
    @DeleteMapping("/delete-piste/{id}")
    public void deletePiste(@PathVariable("id") Integer id){
        ps.deletePiste(id);
    }
}
