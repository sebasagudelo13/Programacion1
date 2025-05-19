package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.List;

public class Estacion {
    private String nombre;
    private String departamento;
    private double totalRecolectado;
    private List<Vehiculo> historialVehiculos;
    private List<Recaudador> recaudadores;
    private List<Conductor>conductores;

    public Estacion(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.totalRecolectado = 0.0;
        this.historialVehiculos = new ArrayList<>();
        this.recaudadores = new ArrayList<>();
        this.conductores = new ArrayList<>();

    }

    public void imprimirResumen() {
        System.out.println("--- Registro Peaje " + nombre + " ---");
        for (Vehiculo vehiculo : historialVehiculos) {
            System.out.println(vehiculo.descripcionVehiculo() + " - Peaje: $" + vehiculo.calcularPeaje());
        }
        System.out.println("Total Recaudado: $" + totalRecolectado);
    }
    public void registrarPasoVehiculo(Vehiculo vehiculo) {
        double valorPeaje = vehiculo.calcularPeaje();
        vehiculo.registrarPago(valorPeaje);
        totalRecolectado += valorPeaje;
        historialVehiculos.add(vehiculo);
    }

    public List<Conductor> obtenerConductoresConCamionesDeAltaCarga() {
        List<Conductor> resultado = new ArrayList<>();

        for (Conductor conductor : conductores) {
            for (Vehiculo vehiculo : conductor.getVehiculosAsignados()) {
                if (vehiculo instanceof Camion) {
                    Camion camion = (Camion) vehiculo;
                    if (camion.getCapacidadCarga() > 10.0) {
                        resultado.add(conductor);
                        break;
                    }
                }
            }
        }

        return resultado;
    }
    public void imprimirHistorialPeajes() {
        System.out.println("Historial de vehículos en la estación " + nombre);
        double acumulado = 0;
        for (Vehiculo vehiculo : historialVehiculos) {
            double peaje = vehiculo.calcularPeaje();
            acumulado += peaje;
            System.out.println(vehiculo.descripcionVehiculo() + " - Peaje: " + peaje);
        }
        System.out.println("Total acumulado en peajes: " + acumulado);
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getTotalRecolectado() {
        return totalRecolectado;
    }

    public void setTotalRecolectado(double totalRecolectado) {
        this.totalRecolectado = totalRecolectado;
    }

    public List<Vehiculo> getHistorialVehiculos() {
        return historialVehiculos;
    }

    public void setHistorialVehiculos(List<Vehiculo> historialVehiculos) {
        this.historialVehiculos = historialVehiculos;
    }

    public List<Recaudador> getRecaudadores() {
        return recaudadores;
    }

    public void setRecaudadores(List<Recaudador> recaudadores) {
        this.recaudadores = recaudadores;
    }


}
