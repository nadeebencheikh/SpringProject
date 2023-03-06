package com.esprit.springproject.services;

import com.esprit.springproject.entities.Inscription;
import com.esprit.springproject.repositories.InscriptionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InscriptionService implements IinscritionService {
    InscriptionRepository ir;

    @Override
    public List<Inscription> retrieveAllInscription() {
        return ir.findAll();
    }

    @Override
    public Inscription addInscription(Inscription i) {
        return ir.save(i);
    }

    @Override
    public Inscription updateInscription(Inscription i) {
        return ir.save(i);
    }

    @Override
    public Inscription retrieveInscription(Integer idInscription) {
        return ir.findById(idInscription).get();
    }

    @Override
    public void deleteInscription(Integer idInscription) {
ir.deleteById(idInscription);
    }
}
