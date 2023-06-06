package pe.edu.upc.fastfit.entities;

import javax.persistence.*;

@Entity
@Table(name = "specialties")
public class Specialty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSpecialty;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description",nullable = false)
    private String description;

    public Specialty() {
    }

    public Specialty(int idSpecialty, String name, String description) {
        this.idSpecialty = idSpecialty;
        this.name = name;
        this.description = description;
    }

    public int getIdSpecialty() {
        return idSpecialty;
    }

    public void setIdSpecialty(int idSpecialty) {
        this.idSpecialty = idSpecialty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
