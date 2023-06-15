package pe.edu.upc.fastfit.entities;

import javax.persistence.*;

@Entity
@Table(name = "genders")
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idGender;
    @Column(name = "gender",length = 255,nullable = false)
    private String gender;

    @Column(name = "abbreviation",length = 255,nullable = false)
    private String abbreviation;



    public int getId() {
        return idGender;
    }

    public void setId(int id) {
        this.idGender = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}
