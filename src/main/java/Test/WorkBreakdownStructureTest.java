package Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkBreakdownStructureTest {

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
    void getTheTasks() {
        int theTasks=1;
        assertEquals(1,theTasks);
        theTasks = 2;
        assertEquals(2,theTasks);
    }

    @Test
    void setTheTask() {
        int theTasks=1;
        assertEquals(1,theTasks);
        theTasks = 2;
        assertEquals(2,theTasks);
    }
}