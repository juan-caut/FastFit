package pe.edu.upc.fastfit.dtos;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

public class TurnDTO {

    private int idTurn;
    private LocalDate date;
    private int duration;
    private int TurnStatus_id;
    private int Psychologist_id;
}
