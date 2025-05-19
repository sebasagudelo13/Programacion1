package co.edu.uniquindio;

public class TransporteTropas extends Vehiculo {
    private int capacidadSoldados;

    public TransporteTropas(String id, String modelo, int anioFabricacion, double kilometraje, EstadoOperativo estadoOperativo, int capacidadSoldados) {
        super(id, modelo, anioFabricacion, kilometraje, estadoOperativo);
        this.capacidadSoldados = capacidadSoldados;
    }

    @Override
    public void desplazar() {
        System.out.println("El vehiculo de tropas se esta moviendo");
    }

    public int getCapacidadSoldados() {
        return capacidadSoldados;
    }

    public void setCapacidadSoldados(int capacidadSoldados) {
        this.capacidadSoldados = capacidadSoldados;
    }

    @Override
    public String toString() {
        return "TransporteTropas{" +
                "capacidadSoldados=" + capacidadSoldados +
                ", id='" + id + '\'' +
                ", anioFabricacion=" + anioFabricacion +
                ", modelo='" + modelo + '\'' +
                ", kilometraje=" + kilometraje +
                ", misionesCompletadas=" + misionesCompletadas +
                ", estadoOperativo=" + estadoOperativo +
                ", listMisiones=" + listMisiones +
                '}';
    }
}
