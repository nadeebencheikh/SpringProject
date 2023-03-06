package com.esprit.springproject.services;
import com.esprit.springproject.entities.Skieur;

import java.util.List;

public interface ISkieurService {
    List<Skieur> retrieveAllSkieur();

    Skieur addSkieur(Skieur s );
    Skieur addSkieur1(Skieur s );
    Skieur addSkieur2(Skieur s );

    Skieur updateSkieur (Skieur s );

    Skieur retrieveSkieur(Integer idSkieur);

    void deleteSkieur( Integer idSkieur);
}
