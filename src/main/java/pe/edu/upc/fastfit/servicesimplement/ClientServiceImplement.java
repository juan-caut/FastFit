package pe.edu.upc.fastfit.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.fastfit.dtos.ClientStatsDTO;
import pe.edu.upc.fastfit.entities.Client;
import pe.edu.upc.fastfit.repositories.IClientRepository;
import pe.edu.upc.fastfit.services.IClientService;

import java.util.ArrayList;
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

    @Override
    public void delete(int idClient) {
        cR.deleteById(idClient);
    }

    @Override
    public Client listId(int idClient) {
        return cR.findById(idClient).orElse(new Client());
    }

    @Override
    public List<Client> findByAge(int min, int max) {
        return cR.findByAge(min,max);
    }

    @Override
    public List<Client> findByName(String name) {
        return cR.findByName(name);
    }

    @Override
    public List<ClientStatsDTO> clientStats() {
        List<String[]> clientStats = cR.clientStats();
        List<ClientStatsDTO> ClientStatsDTOs = new ArrayList<>();

        for (String[] data : clientStats) {
            ClientStatsDTO dto = new ClientStatsDTO();

            dto.setUsername(data[0]);
            dto.setNames(data[1]);
            dto.setReviews(Integer.parseInt(data[2]));
            dto.setAppointments(Integer.parseInt(data[3]));

            ClientStatsDTOs.add(dto);
        }

        return ClientStatsDTOs;
    }

    public List<Client> byPsi(int idPsi) {
        return cR.byPsi(idPsi);
    }

}
