package com.esprit.springproject.services;

import com.esprit.springproject.entities.Piste;
import com.esprit.springproject.repositories.PisteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PisteService implements IPisteService {
    PisteRepository pr;
    @Override
    public List<Piste> retrieveAllPiste() {
        return pr.findAll();
    }

    @Override
    public Piste addPiste(Piste p) {
        return pr.save(p);
    }

    @Override
    public Piste updatePiste(Piste p) {
        return pr.save(p);
    }

    @Override
    public Piste retrievePiste(Integer idPiste) {
        return pr.findById(idPiste).get();
    }

    @Override
    public void deletePiste(Integer idPiste) {
        pr.deleteById(idPiste);

    }
}
