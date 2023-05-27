package pe.edu.upc.fastfit.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.fastfit.entities.Client;
import pe.edu.upc.fastfit.repositories.IClientRepository;
import pe.edu.upc.fastfit.services.IClientService;

import java.util.List;
@Service
public class ClientServiceImplement implements IClientService {
    @Autowired
    private IClientRepository cR;

    @Override
    public void insert(Client client) {
        cR.save(client);
    }

    @Override
    public List<Client> list() {
        return cR.findAll();
    }
}
