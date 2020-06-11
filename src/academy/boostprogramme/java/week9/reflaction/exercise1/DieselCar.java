package academy.boostprogramme.java.week9.reflaction.exercise1;

public class DieselCar extends Car {

    public DieselCar(String brand) {
        super(brand, "diesel");
    }

    @Override
    public String refuel() {
        return "I am refilling my diesel tank!";
    }
}
