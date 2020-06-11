package academy.boostprogramme.java.week9.reflaction.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasolineCarTest {

    GasolineCar gasolineCar = new GasolineCar("Bat-mobile");

   @Test
    void describe() {
       String expected = "I am a Bat-mobile car!";
       String result = gasolineCar.describe();

       assertEquals(expected, result);
   }

}