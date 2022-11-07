package Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void Test() {
        String name="Erick";
        assertEquals("Erick",name);
        name = "pepe";
        assertEquals("pepe",name);
    }
}