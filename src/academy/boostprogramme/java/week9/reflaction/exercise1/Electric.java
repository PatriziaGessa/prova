package academy.boostprogramme.java.week9.reflaction.exercise1;

public class Electric extends Car {

    public Electric(String brand) {
        super(brand, "electric");
    }

    @Override
    public String refuel() {
        return "I am recharging my electric car";
    }
}
