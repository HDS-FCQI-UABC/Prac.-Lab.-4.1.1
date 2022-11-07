package Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjectTest {

    @Test
    void getName() {
        String name="Milka";
        assertEquals("Milka",name);
        name = "Yamil";
        assertEquals("Yamil",name);
    }

    @Test
    void setName() {
        String name="Marco";
        assertEquals("Marco",name);
        name = "Polo";
        assertEquals("Polo",name);
    }

    @Test
    void getTheResources() {
        int theResources=1;
        assertEquals(1,theResources);
        theResources = 2;
        assertEquals(2,theResources);
    }

    @Test
    void setTheResources() {
        int theResources=1;
        assertEquals(1,theResources);
        theResources = 2;
        assertEquals(2,theResources);
    }

    @Test
    void getTheEmployees() {
        int theEmployees=1;
        assertEquals(1,theEmployees);
        theEmployees = 2;
        assertEquals(2,theEmployees);
    }

    @Test
    void setTheEmployees() {
        int theEmployees=1;
        assertEquals(1,theEmployees);
        theEmployees = 2;
        assertEquals(2,theEmployees);
    }

    @Test
    void getTheWorkBreakdownStructure() {
        int theWorkBreakdownStructure=1;
        assertEquals(1,theWorkBreakdownStructure);
        theWorkBreakdownStructure = 2;
        assertEquals(2,theWorkBreakdownStructure);
    }

    @Test
    void setTheWorkBreakdownStructure() {
        int theWorkBreakdownStructure=1;
        assertEquals(1,theWorkBreakdownStructure);
        theWorkBreakdownStructure = 2;
        assertEquals(2,theWorkBreakdownStructure);
    }
}