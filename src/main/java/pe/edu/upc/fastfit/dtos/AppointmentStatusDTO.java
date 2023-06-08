package pe.edu.upc.fastfit.dtos;

public class AppointmentStatusDTO {
    private int idAppStatus;
    private String status;
    private String description;

    public int getIdAppStatus() {
        return idAppStatus;
    }

    public void setIdAppStatus(int idAppStatus) {
        this.idAppStatus = idAppStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
