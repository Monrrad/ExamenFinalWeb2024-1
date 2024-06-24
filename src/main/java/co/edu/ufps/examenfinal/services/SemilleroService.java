package co.edu.ufps.examenfinal.services;

import co.edu.ufps.examenfinal.entities.Semillero;
import co.edu.ufps.examenfinal.repositories.SemilleroRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SemilleroService {

    @Autowired
    private SemilleroRepositorie semilleroRepositorie;


    public Semillero UpdateSemillero() {

    }
}