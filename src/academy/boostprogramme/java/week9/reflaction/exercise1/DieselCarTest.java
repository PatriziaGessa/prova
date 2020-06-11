package academy.boostprogramme.java.week9.reflaction.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DieselCarTest {

    DieselCar dieselCar = new DieselCar("Kit");

    @Test
    void describe() {
        String expected = "I am a Kit car!";
        String result = dieselCar.describe();

        assertEquals(expected, result);
    }

}