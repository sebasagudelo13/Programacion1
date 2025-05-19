package co.edu.uniquindio;

import static org.junit.jupiter.api.Assertions.*;

import co.edu.uniquindio.Especialidad;
import co.edu.uniquindio.Rango;
import co.edu.uniquindio.RangoMilitar;
import co.edu.uniquindio.Soldado;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Soldadotest {


    private Soldado soldado;

    @BeforeEach
    void setUp() {
        soldado = new Soldado("S1", "Juan Perez", 30, true, Especialidad.COMUNICACIONES, RangoMilitar.SARGENTO);
    }

    @Test
    void testGettersIniciales() {
        assertEquals("S1", soldado.getIdSoldado());
        assertEquals("Juan Perez", soldado.getNombreSoldado());
        assertEquals(30, soldado.getEdadSoldado());
        assertTrue(soldado.isDisponible());
        assertEquals(Especialidad.COMUNICACIONES, soldado.getEspecialidad());
        assertEquals(Rango.SARGENTO, soldado.getRango());
    }

    @Test
    void testSetters() {
        soldado.setNombreSoldado("Sebastian Londoño");
        soldado.setEdadSoldado(35);
        soldado.setDisponible(false);
        soldado.setEspecialidad(Especialidad.MEDICO);
        soldado.setRango(Rango.SOLDADO);

        assertEquals("Sebastian Londoño", soldado.getNombreSoldado());
        assertEquals(35, soldado.getEdadSoldado());
        assertFalse(soldado.isDisponible());
        assertEquals(Especialidad.MEDICO, soldado.getEspecialidad());
        assertEquals(Rango.SOLDADO, soldado.getRango());
    }

    @Test
    void testToStringNotNull() {
        assertNotNull(soldado.toString());
    }
}


