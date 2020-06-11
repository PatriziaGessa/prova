package academy.boostprogramme.java.week9.set1.exercise1;

public class Bird extends Animal {

    private String featherColor;

    public Bird(String name, String movement, String featherColor) {
        super(name, movement, "bird");
        this.featherColor = featherColor;
    }

    public String getFeatherColor() {
        return featherColor;
    }
}
