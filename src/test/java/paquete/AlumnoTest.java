package paquete;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlumnoTest {

    private Alumno alumno = new Alumno("Pepe");

    @Test
    void getNombre() {
        assertEquals("Pepe",alumno.getNombre());
    }

    @Test
    void setNombre() {
        alumno.setNombre("Juan");
        assertEquals("Juan",alumno.getNombre());
    }

    @Test
    void testToString() {
        assertEquals("Alumno{nombre='Pepe'}",alumno.toString());
    }
}