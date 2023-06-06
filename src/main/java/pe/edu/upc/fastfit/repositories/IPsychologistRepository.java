package pe.edu.upc.fastfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.fastfit.entities.Psychologist;

import java.util.List;


public interface IPsychologistRepository extends JpaRepository<Psychologist,Integer> {

    //Christian Prada (1)
    @Query("from Psychologist p where p.specialty.idSpecialty=:Specialty")
    List<Psychologist> findBySpecialtyPsico(@Param("Specialty") String Specialty);


}
