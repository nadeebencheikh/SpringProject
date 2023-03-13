package com.esprit.springproject.services;

import com.esprit.springproject.entities.Cours;
import com.esprit.springproject.entities.Inscription;
import com.esprit.springproject.entities.Piste;
import com.esprit.springproject.entities.Skieur;
import com.esprit.springproject.entities.ennum.TypeAbonnement;
import com.esprit.springproject.repositories.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SkieurService implements ISkieurService {
    SkieurRepository sr;
    AbonnementRepository ar;
    InscriptionRepository ir;
    PisteRepository pr;

    CoursRepository cr;
    @Override
    public List<Skieur> retrieveAllSkieur() {
       return sr.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur s) {
       return sr.save(s);
    }
    @Override
    public Skieur addSkieur1(Skieur s) {
        ar.save(s.getAbonnement());
        return sr.save(s);
    }
    @Override
    public Skieur addSkieur2(Skieur s) {
        for (Inscription inscription : s.getInscriptions()) {
            ir.save(inscription);
        }
        return sr.save(s);
    }
    @Override
    public Skieur updateSkieur(Skieur s) {

        return sr.save(s);
    }

    @Override
    public Skieur retrieveSkieur(Integer idSkieur) {

        return sr.findById(idSkieur).get();
    }

    @Override
    public void deleteSkieur(Integer idSkieur) {
     sr.deleteById(idSkieur);
    }

    public Skieur assignSkieurToPiste(Long numSkieur, Long numPiste){
        Skieur s = sr.findByNumSkieur(numSkieur);
        Piste p = pr.findByNumPiste(numPiste);

        p.getSkieurs().add(s);
        return s;


    }
    public Skieur addSkieurAndAssignToCours(Skieur skieur, Long numCours){
        Cours c = cr.findByNumCours(numCours);
        for (Inscription inscription : skieur.getInscriptions()) {
            inscription.setCour(c);
        }
        return sr.save(skieur);
    }

    public List<Skieur> retrieveSkieursByAbonnementType(TypeAbonnement typeAbonnement){
       return sr.findByAbonnement_TypeAbon(typeAbonnement);
    }

}
