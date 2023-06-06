package pe.edu.upc.fastfit.entities;

import javax.persistence.*;

@Entity
@Table(name = "appointmentstatus")
public class AppointmentStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAppStatus;
    @Column(name = "status", length = 255, nullable = false)
    private String status;
    @Column(name = "description", length = 255, nullable = false)
    private String description;

    public int getIdAppStatus() {
        return idAppStatus;
    }

    public void setIdAppStatus(int id) {
        this.idAppStatus = id;
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
