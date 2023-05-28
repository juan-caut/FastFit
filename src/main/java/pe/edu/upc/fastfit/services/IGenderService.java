package pe.edu.upc.fastfit.services;

import pe.edu.upc.fastfit.entities.Gender;

import java.util.List;

public interface IGenderService {
    public void insert(Gender gender);
    List<Gender>list();
    public void delete(int idGender);
}
