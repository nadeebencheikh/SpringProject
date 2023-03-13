package com.esprit.springproject.repositories;

import com.esprit.springproject.entities.Piste;
import com.esprit.springproject.entities.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PisteRepository extends JpaRepository<Piste,Integer> {
    public Piste findByNumPiste(Long numpst);
}
