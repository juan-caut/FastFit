package pe.edu.upc.fastfit.entities;

import javax.persistence.*;
@Entity
@Table(name="UserStatuss")
public class UserStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUS;

    @Column(name = "Status", length = 10, nullable = false)
    private String Status;

    @Column(name = "Description", length = 30, nullable = false)
    private String Description;


    public UserStatus(){

    }

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

    public UserStatus(int idUS, String status, String description) {
        this.idUS = idUS;
        this.Status = status;
        this.Description = description;
    }
}
