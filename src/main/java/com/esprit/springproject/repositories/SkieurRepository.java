package com.esprit.springproject.repositories;

import com.esprit.springproject.entities.Abonnement;
import com.esprit.springproject.entities.Skieur;
import com.esprit.springproject.entities.ennum.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface SkieurRepository extends JpaRepository<Skieur,Integer> {
    public Skieur findByNumSkieur(Long numsk);
    public List<Skieur> findByAbonnement_TypeAbon(TypeAbonnement type);
}
