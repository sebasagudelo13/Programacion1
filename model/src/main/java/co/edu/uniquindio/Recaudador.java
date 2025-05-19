package co.edu.uniquindio;

import java.sql.Date;
import java.util.List;

public class Recaudador extends Persona {
    private double sueldoMensual;


    public Recaudador(String nombre, String apellido, int cedula, Date fechaNacimiento, double sueldoMensual) {
        super(nombre, apellido, cedula, fechaNacimiento);
        this.sueldoMensual = sueldoMensual;
    }

    public static Recaudador buscarRecaudador(List<Recaudador> recaudadores, String nombreCompletoBusqueda) {
        String busqueda = nombreCompletoBusqueda
                .toLowerCase()
                .replaceAll("\\s+", "");

        for (Recaudador recaudador : recaudadores) {
            String nombreCompletoRecaudador = (recaudador.getNombre() + recaudador.getApellido())
                    .toLowerCase()
                    .replaceAll("\\s+", "");

            if (nombreCompletoRecaudador.equals(busqueda)) {
                return recaudador;
            }
        }
        return null;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
}
