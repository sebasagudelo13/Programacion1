package co.edu.uniquindio;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Conductor extends Persona {
    public List<Vehiculo> vehiculosAsignados;



    public Conductor(String nombre, String apellido, int cedula, Date fechaNacimiento) {
        super(nombre, apellido, cedula, fechaNacimiento);
        this.vehiculosAsignados = new ArrayList<>();

    }

    public void asignarVehiculo(Vehiculo vehiculo) {
        vehiculosAsignados.add(vehiculo);
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculosAsignados;
    }

    public List<Vehiculo> obtenerVehiculosPorTipo(String tipo) {
        List<Vehiculo> resultado = new ArrayList<>();
        for (Vehiculo vehiculo : vehiculosAsignados) {
            if ((tipo.equals("Carro") && vehiculo instanceof Carro) ||
                    (tipo.equals("Moto") && vehiculo instanceof Moto) ||
                    (tipo.equals("Camion") && vehiculo instanceof Camion)) {
                resultado.add(vehiculo);
            }
        }
        return resultado;
    }

    public boolean tieneCamionAltoTonelaje() {
        for (Vehiculo vehiculo : vehiculosAsignados) {
            if (vehiculo instanceof Camion && ((Camion) vehiculo).getCapacidadCarga() > 10) {
                return true;
            }
        }
        return false;
    }

    public void totalPagadoPorVehiculo() {
        System.out.println("Detalle de pagos de " + getNombre());
        for (Vehiculo vehiculo : vehiculosAsignados) {
            System.out.println(vehiculo.descripcionVehiculo() + " -> Total pagado: $" + vehiculo.getTotalPagado());
        }
    }
    public List<Vehiculo> getVehiculosAsignados() {
        return vehiculosAsignados;
    }

    public void setVehiculosAsignados(List<Vehiculo> vehiculosAsignados) {
        this.vehiculosAsignados = vehiculosAsignados;
    }
}
