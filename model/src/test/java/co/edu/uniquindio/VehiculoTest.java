package co.edu.uniquindio;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {

    @Test
    void calcularPeaje_CarroElectricoYServicioPublico_DescuentoYRecargo() {
        Carro carro = new Carro("ABC123", true, true);
        assertEquals(10000 * 0.8 * 1.15, carro.calcularPeaje(), 0.01);
    }

    @Test
    void descripcionVehiculo_CarroElectrico() {
        Carro carro = new Carro("XYZ789", true, false);
        assertTrue(carro.descripcionVehiculo().contains("Eléctrico"));
    }
}