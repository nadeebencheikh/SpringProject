package com.esprit.springproject.services;

import com.esprit.springproject.entities.Inscription;
import com.esprit.springproject.entities.Skieur;
import com.esprit.springproject.repositories.AbonnementRepository;
import com.esprit.springproject.repositories.InscriptionRepository;
import com.esprit.springproject.repositories.SkieurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SkieurService implements ISkieurService {
    SkieurRepository sr;
    AbonnementRepository ar;
    InscriptionRepository ir;
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
}
