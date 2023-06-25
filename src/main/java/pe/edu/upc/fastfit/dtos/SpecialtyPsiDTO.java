package pe.edu.upc.fastfit.dtos;

public class SpecialtyPsiDTO {

    private String specialtyName;
    private int speCount;

    public SpecialtyPsiDTO(String specialtyName, int speCount) {
        this.specialtyName = specialtyName;
        this.speCount = speCount;
    }

    public SpecialtyPsiDTO() {

    }

    public String getSpecialtyName() {
        return specialtyName;
    }

    public void setSpecialtyName(String specialtyName) {
        this.specialtyName = specialtyName;
    }

    public int getSpeCount() {
        return speCount;
    }

    public void setSpeCount(int speCount) {
        this.speCount = speCount;
    }
}


