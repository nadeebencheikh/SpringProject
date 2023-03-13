package com.esprit.springproject.services;

import com.esprit.springproject.entities.Abonnement;
import com.esprit.springproject.entities.ennum.TypeAbonnement;
import com.esprit.springproject.repositories.AbonnementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class AbonnementService implements IAbonnementService{

    AbonnementRepository ar ;
    @Override
    public List<Abonnement> retrieveAllAbonnement() {
       return ar.findAll();
    }

    @Override
    public Abonnement addAbonnement(Abonnement a) {
        ar.save(a);
        return a;
    }

    @Override
    public Abonnement updateAbonnement(Abonnement a) {
        ar.save(a);
        return a;
    }

    @Override
    public Abonnement retrieveAbonnement(Integer idAbonnement) {
        return ar.findById(idAbonnement).get();
    }

    @Override
    public void deleteAbonnement(Integer idAbonnement) {
       ar.deleteById(idAbonnement);
    }

    public Set<Abonnement> getAbonnementByType(TypeAbonnement type) {
        return ar.findByTypeAbon(type);
    }
}
