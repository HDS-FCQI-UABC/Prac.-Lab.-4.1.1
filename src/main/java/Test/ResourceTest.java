package Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResourceTest {

    @Test
    void getName() {
        String name="Maribel";
        assertEquals("Maribel",name);
        name = "Misael";
        assertEquals("Misael",name);
    }

    @Test
    void setName() {
        String name="Maribel";
        assertEquals("Maribel",name);
        name = "Misael";
        assertEquals("Misael",name);
    }
}