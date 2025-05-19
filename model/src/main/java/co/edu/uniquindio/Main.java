package co.edu.uniquindio;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Estacion estacion = new Estacion("Peaje Central", "Quindío");

        Vehiculo carro = new Carro("ABC123", true, false);
        Vehiculo moto = new Moto("XYZ789", 250);
        Vehiculo camion = new Camion("DEF456", 4, 15.0);

        estacion.registrarPasoVehiculo(carro);
        estacion.registrarPasoVehiculo(moto);
        estacion.registrarPasoVehiculo(camion);

        System.out.println("Total recaudado: $" + estacion.getTotalRecolectado());
    }

}