package pe.edu.upc.fastfit.dtos;
import java.time.LocalDate;
public class UserStatusDTO {

    private int idUS;
    private String Status;
    private String Description;

    public int getIdUS() {
        return idUS;
    }

    public void setIdUS(int idUS) {
        this.idUS = idUS;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
