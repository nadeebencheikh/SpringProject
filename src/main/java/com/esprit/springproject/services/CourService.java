package com.esprit.springproject.services;

import com.esprit.springproject.entities.Cours;
import com.esprit.springproject.repositories.CoursRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourService implements ICourService {

    CoursRepository cr;
    @Override
    public List<Cours> retrieveAllCours() {
        return cr.findAll();
    }

    @Override
    public Cours addcours(Cours c) {
       cr.save(c);
       return c;
    }

    @Override
    public Cours updatecours(Cours c) {
        return cr.save(c);
    }

    @Override
    public Cours retrievecours(Integer idCours) {
        return cr.findById(idCours).get();
    }

    @Override
    public void deletecours(Integer idCours) {
        cr.deleteById(idCours);

    }
}
