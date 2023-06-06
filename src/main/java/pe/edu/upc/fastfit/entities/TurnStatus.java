package pe.edu.upc.fastfit.entities;

import javax.persistence.*;

@Entity
@Table(name = "turnstatus")
public class TurnStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTurnstatus;
    @Column(name = "Status", length = 50, nullable = false)
    private String Status;
    @Column(name = "Description", length = 255, nullable = false)
    private String Description;

    public TurnStatus(){

    }
    public TurnStatus(int idTurnstatus, String status, String description) {
        this.idTurnstatus = idTurnstatus;
        Status = status;
        Description = description;
    }

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
