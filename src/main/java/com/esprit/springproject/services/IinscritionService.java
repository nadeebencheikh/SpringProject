package com.esprit.springproject.services;
import com.esprit.springproject.entities.Inscription;

import java.util.List;

public interface IinscritionService {
    List<Inscription> retrieveAllInscription();

    Inscription addInscription(Inscription i);

    Inscription updateInscription (Inscription i);

    Inscription retrieveInscription (Integer idInscription);

    void deleteInscription( Integer idInscription);
}
