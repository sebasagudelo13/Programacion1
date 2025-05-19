package co.edu.uniquindio;

public class Moto extends Vehiculo implements IPeajeCalculable {
    private int cilindraje;

    public Moto(String placa, int cilindraje) {
        super(placa);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public double calcularPeaje() {
        return cilindraje > 200 ? 7000 : 5000;
    }

    @Override
    public String descripcionVehiculo() {
        return "Moto - Placa: " + placa + " - Cilindraje: " + cilindraje + "cc";
    }

}
