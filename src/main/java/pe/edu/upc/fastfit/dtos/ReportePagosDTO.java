package pe.edu.upc.fastfit.dtos;

public class ReportePagosDTO {

    private int totalpago;
    private float montototal;

    public ReportePagosDTO() {
    }

    public ReportePagosDTO(int totalpago, float montototal) {
        this.totalpago = totalpago;
        this.montototal = montototal;
    }

    public int getTotalpago() {
        return totalpago;
    }

    public void setTotalpago(int totalpago) {
        this.totalpago = totalpago;
    }

    public float getMontototal() {
        return montototal;
    }

    public void setMontototal(float montototal) {
        this.montototal = montototal;
    }
}
