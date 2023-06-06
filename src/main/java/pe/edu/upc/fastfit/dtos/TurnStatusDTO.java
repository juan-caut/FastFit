package pe.edu.upc.fastfit.dtos;

import javax.persistence.Column;

public class TurnStatusDTO {
    private int idTurnstatus;
    private String Status;
    private String Description;

    public int getIdTurnstatus() {
        return idTurnstatus;
    }

    public void setIdTurnstatus(int idTurnstatus) {
        this.idTurnstatus = idTurnstatus;
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
