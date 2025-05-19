package co.edu.uniquindio;

public class Camion extends Vehiculo implements IPeajeCalculable {
    private int numeroEjes;
    private double capacidadCarga;

    public Camion(String placa, int numeroEjes, double capacidadCarga) {
        super(placa);
        this.numeroEjes = numeroEjes;
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double calcularPeaje() {
        double tarifa = 7000 * numeroEjes;
        if(capacidadCarga > 10) tarifa *= 1.10;
        return tarifa;
    }
    @Override
    public String descripcionVehiculo() {
        return "Camion - Placa: " + placa + " - Ejes: " + numeroEjes + " - Carga: " + capacidadCarga + "t";
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

}
