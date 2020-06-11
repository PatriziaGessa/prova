package academy.boostprogramme.java.week9.set1.exercise1;

public class Fish extends Animal {

    private String waterKind;

    public Fish(String name, String movement, String waterKind) {
        super(name, movement, "fish");
        this.waterKind = waterKind;
    }

    public String getWaterKind() {
        return waterKind;
    }
}
