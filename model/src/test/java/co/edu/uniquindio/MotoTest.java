package co.edu.uniquindio;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MotoTest {

    @Test
    void calcularPeaje_MotoAltoCilindraje_Recargo() {
        Moto moto = new Moto("MOT456", 250);
        assertEquals(7000, moto.calcularPeaje());
    }

}