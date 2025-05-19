package co.edu.uniquindio;

public abstract class Vehiculo implements IPeajeCalculable, IPeajeDescriptible{
    protected String placa;
    protected int totalPagado;

    public Vehiculo(String placa) {
        this.placa = placa;
        this.totalPagado = 0;
    }

    public void incrementarPeajes() {
        totalPagado++;
    }

    public void registrarPago(double monto) {
        totalPagado += monto;
    }

    public String getPlaca() {
        return placa;
    }

    public int getTotalPagado() {
        return totalPagado;
    }

}



