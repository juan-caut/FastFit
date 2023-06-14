package pe.edu.upc.fastfit.dtos;

public class GenderDTO {
    private  int idGender;
    private  String gender;
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
