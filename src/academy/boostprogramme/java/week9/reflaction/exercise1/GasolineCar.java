package academy.boostprogramme.java.week9.reflaction.exercise1;

public class GasolineCar extends Car {

    public GasolineCar(String brand) {
        super(brand, "gasoline");
    }

    @Override
    public String refuel() {
        return "I am refilling my diesel tank!";
    }
}
