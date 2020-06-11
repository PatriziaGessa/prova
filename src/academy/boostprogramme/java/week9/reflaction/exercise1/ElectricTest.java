package academy.boostprogramme.java.week9.reflaction.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectricTest {

    Electric electric = new Electric("Herbie");

    @Test
    void describe() {
        String expected = "I am a Herbie car!";
        String result = electric.describe();

        assertEquals(expected, result);
    }
}