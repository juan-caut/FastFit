package pe.edu.upc.fastfit.services;

import pe.edu.upc.fastfit.entities.Turn;

import java.util.List;

public interface ITurnService {
    public void insert(Turn turn);
    List<Turn> list();
    public void delete(int idTurn);
    public Turn listId(int idTurn);
}
