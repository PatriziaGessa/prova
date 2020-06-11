package academy.boostprogramme.java.week9.reflaction.exercise1;

public abstract class Car {

    private String brand;
    private String engineType;

    public Car(String brand, String engineType) {
        this.brand = brand;
        this.engineType = engineType;
    }

    public String describe() {
        return "I am a " + brand + " car!";
    }

    public abstract String refuel();

}
