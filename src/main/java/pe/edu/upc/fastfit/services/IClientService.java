package pe.edu.upc.fastfit.services;

import pe.edu.upc.fastfit.entities.Client;

import java.util.List;

public interface IClientService {
    public void insert(Client client);
    List<Client> list();
    public void delete(int idClient);
    public Client listId(int idClient);

    List<Client> findByAge(int min,int max);
    List<Client> findByName(String name);

}
