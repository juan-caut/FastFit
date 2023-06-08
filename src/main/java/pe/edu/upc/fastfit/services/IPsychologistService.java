package pe.edu.upc.fastfit.services;


import pe.edu.upc.fastfit.entities.Psychologist;

import java.util.List;
public interface IPsychologistService {

    public void insert(Psychologist psychologist);
    List<Psychologist> list();
    public void delete(int idPsychologist);
    public Psychologist listId(int idPsychologist);
    List<Psychologist> findBySpecialtyPsico( String Specialty);
    List<Psychologist> finByGender( String gender);
    List<Psychologist> findByAgePsychologist(int Age);


}
