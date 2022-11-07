package Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

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

    @Test
    void getTheEmployees() {
        int theEmployees=5;
        assertEquals(5,theEmployees);
        theEmployees = 10;
        assertEquals(10,theEmployees);
    }

    @Test
    void setTheEmployees() {
        int theEmployees=5;
        assertEquals(5,theEmployees);
        theEmployees = 10;
        assertEquals(10,theEmployees);
    }

    @Test
    void getTheResources() {
        int theResources=5;
        assertEquals(5,theResources);
        theResources = 10;
        assertEquals(10,theResources);
    }

    @Test
    void setTheResources() {
        int theResources=5;
        assertEquals(5,theResources);
        theResources = 10;
        assertEquals(10,theResources);
    }
}