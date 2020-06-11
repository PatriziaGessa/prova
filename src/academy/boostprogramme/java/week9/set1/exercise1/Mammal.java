package academy.boostprogramme.java.week9.set1.exercise1;

public class Mammal extends Animal {

    private String hairColor;

    public Mammal(String name, String movement, String hairColor) {
        super(name, movement, "mammal");
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return hairColor;
    }

}
