package academy.boostprogramme.java.week9.set1.exercise1;

public class Reptile extends Animal {

    private boolean hasShell;

    public Reptile(String name, String movement, boolean hasShell) {
        super(name, movement, "reptile");
        this.hasShell = hasShell;
    }

    public boolean hasShell() {
        return hasShell;
    }
}
