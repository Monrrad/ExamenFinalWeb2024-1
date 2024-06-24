package co.edu.ufps.examenfinal.services;

import co.edu.ufps.examenfinal.entities.Semillero;
import co.edu.ufps.examenfinal.repositories.SemilleroRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class SemilleroService {

    @Autowired
    private SemilleroRepositorie semilleroRepositorie;

    public Semillero getSemilleroById(Integer id) {
        Optional<Semillero> semillero = semilleroRepositorie.findById(id);
        if(semillero.isPresent()) {
            return semillero.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }


    public Semillero UpdateSemillero() {


    }
}