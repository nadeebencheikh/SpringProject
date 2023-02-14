package com.esprit.springproject.services;

import com.esprit.springproject.entities.Moniteur;
import com.esprit.springproject.repositories.MoniteurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MoniteurService implements IMoniteurService {
    MoniteurRepository moniteurrepo;
    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return (List<Moniteur>) moniteurrepo.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur e) {
       moniteurrepo.save(e);
        return e;
    }

    @Override
    public Moniteur updateMoniteur(Moniteur e) {

        return moniteurrepo.save(e);
    }

    @Override
    public Moniteur retrieveMoniteur(Integer idMoniteur) {

        return moniteurrepo.findById(idMoniteur).get();
    }

    @Override
    public void deleteMoniteur(Integer idMoniteur) {
        moniteurrepo.deleteById(idMoniteur);
    }
}
