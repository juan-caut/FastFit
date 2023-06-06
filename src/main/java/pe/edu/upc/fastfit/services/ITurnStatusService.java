package pe.edu.upc.fastfit.services;

import pe.edu.upc.fastfit.entities.TurnStatus;

import java.util.List;

public interface ITurnStatusService {
    public void insert(TurnStatus turns);
    List<TurnStatus> list();
    public void delete(int idTurnS);
    public TurnStatus listId(int idTurnS);
}
