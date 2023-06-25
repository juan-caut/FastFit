package pe.edu.upc.fastfit.dtos;

import pe.edu.upc.fastfit.entities.Client;
import pe.edu.upc.fastfit.entities.Psychologist;

import java.time.LocalDate;

public class ReviewpsyDTO {

    private String names;
    private Double avg;
    private int sum;
    private int max;
    private int min;


    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public Double getAvg() {
        return avg;
    }

    public void setAvg(Double avg) {
        this.avg = avg;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
