package co.edu.uniquindio;

import junit.framework.TestCase;
import org.junit.Test;

public class CamionTest extends TestCase {

    @Test
    void calcularPeaje_CamionCargaPesada_Recargo() {
        Camion camion = new Camion("CAM123", 3, 12.5);
        assertEquals(7000 * 3 * 1.10, camion.calcularPeaje(), 0.01);
    }

    @Test
    void descripcionVehiculo_MuestraEjesYCarga() {
        Camion camion = new Camion("CAM456", 4, 8.0);
        assertTrue(camion.descripcionVehiculo().contains("Ejes: 4"));
    }
}

}