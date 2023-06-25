package pe.edu.upc.fastfit.dtos;

public class PsiSpecialtyDTO {

    private String specialtyName;
    private int speCount;

    public PsiSpecialtyDTO(String specialtyName, int speCount) {
        this.specialtyName = specialtyName;
        this.speCount = speCount;
    }

    public PsiSpecialtyDTO() {
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
