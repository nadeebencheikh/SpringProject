package com.esprit.springproject.services;
import com.esprit.springproject.entities.Cours;

import java.util.List;

public interface ICourService {
    List<Cours> retrieveAllCours();

    Cours addcours (Cours c);

    Cours updatecours(Cours c);

    Cours retrievecours(Integer idCours);

    void deletecours( Integer idCours);
}
