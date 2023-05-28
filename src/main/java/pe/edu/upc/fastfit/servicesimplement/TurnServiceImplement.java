package pe.edu.upc.fastfit.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.fastfit.entities.Turn;
import pe.edu.upc.fastfit.repositories.ITurnRepository;
import pe.edu.upc.fastfit.services.ITurnService;

import java.util.List;

@Service
public class TurnServiceImplement implements ITurnService {
    @Autowired
    private ITurnRepository turnR;

    @Override
    public void insert(Turn turn) {
        turnR.save(turn);
    }

    @Override
    public List<Turn> list() {
        return turnR.findAll();
    }

    @Override
    public void delete(int idTurn) {
        turnR.deleteById(idTurn);
    }

    @Override
    public Turn listId(int idTurn) {
        return turnR.findById(idTurn).orElse(new Turn());
    }
}
