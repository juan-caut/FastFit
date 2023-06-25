package pe.edu.upc.fastfit.dtos;

public class ReportePagosDTO {


    private String moneda;
    private int contador;
    private float sumapago;


    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public float getSumapago() {
        return sumapago;
    }

    public void setSumapago(float sumapago) {
        this.sumapago = sumapago;
    }
}
