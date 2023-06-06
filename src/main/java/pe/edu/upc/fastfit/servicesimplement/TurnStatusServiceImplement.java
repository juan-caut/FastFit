package pe.edu.upc.fastfit.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.fastfit.entities.Turn;
import pe.edu.upc.fastfit.entities.TurnStatus;
import pe.edu.upc.fastfit.repositories.ITurnRepository;
import pe.edu.upc.fastfit.repositories.ITurnStatusRepository;
import pe.edu.upc.fastfit.services.ITurnStatusService;

import java.util.List;

@Service
public class TurnStatusServiceImplement implements ITurnStatusService {

    @Autowired
    private ITurnStatusRepository turnsR;
    @Override
    public void insert(TurnStatus turns) {
        turnsR.save(turns);
    }

    @Override
    public List<TurnStatus> list() {
        return turnsR.findAll();
    }

    @Override
    public void delete(int idTurnS) {
        turnsR.deleteById(idTurnS);
    }

    @Override
    public TurnStatus listId(int idTurnS) {
        return turnsR.findById(idTurnS).orElse(new TurnStatus());
    }
}
