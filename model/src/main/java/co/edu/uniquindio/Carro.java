package co.edu.uniquindio;

public class Carro extends Vehiculo implements IPeajeCalculable {
    private boolean isElectrico;
    private boolean isServicioPublico;

    public Carro(String placa, boolean isElectrico, boolean isServicioPublico) {
        super(placa);
        this.isElectrico = isElectrico;
        this.isServicioPublico = isServicioPublico;
    }

    public boolean isElectrico() {
        return isElectrico;
    }

    public void setElectrico(boolean electrico) {
        isElectrico = electrico;
    }

    public boolean isServicioPublico() {
        return isServicioPublico;
    }

    public void setServicioPublico(boolean servicioPublico) {
        isServicioPublico = servicioPublico;
    }

    @Override
    public double calcularPeaje() {
        double tarifa = 10000;
        if(isElectrico) tarifa *= 0.8;
        if(isServicioPublico) tarifa *= 1.15;
        return tarifa;
    }

    @Override
    public String descripcionVehiculo() {
        return "Carro - Placa: " + placa + (isElectrico ? " - Eléctrico" : "") + (isServicioPublico ? " - Público" : "");
    }


}
