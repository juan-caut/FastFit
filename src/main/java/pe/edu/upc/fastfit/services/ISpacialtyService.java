package pe.edu.upc.fastfit.services;


import pe.edu.upc.fastfit.entities.Specialty;

import java.util.List;

public interface ISpacialtyService {
    public void insert(Specialty specialty);
    List<Specialty> list();

    public void delete(int idSpecialty);
    public Specialty listId(int idSpecialty);
}
