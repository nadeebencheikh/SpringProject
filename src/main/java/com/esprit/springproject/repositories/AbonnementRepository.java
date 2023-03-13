package com.esprit.springproject.repositories;

import com.esprit.springproject.entities.Abonnement;

import com.esprit.springproject.entities.Cours;
import com.esprit.springproject.entities.ennum.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface AbonnementRepository extends JpaRepository<Abonnement,Integer> {
    public Set<Abonnement> findByTypeAbon(TypeAbonnement t);
}
