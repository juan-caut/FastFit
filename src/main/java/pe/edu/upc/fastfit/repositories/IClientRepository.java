package pe.edu.upc.fastfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.fastfit.entities.Client;
@Repository
public interface IClientRepository extends JpaRepository<Client,Integer>{
}
