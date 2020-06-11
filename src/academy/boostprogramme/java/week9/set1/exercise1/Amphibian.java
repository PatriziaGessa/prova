package academy.boostprogramme.java.week9.set1.exercise1;

public class Amphibian extends Animal {

    private boolean hasLegs;

    public Amphibian(String name, String movement, boolean hasLegs) {
        super(name, movement, "amphibian");
        this.hasLegs = hasLegs;
    }

    public boolean HasLegs() {
        return hasLegs;
    }
}
