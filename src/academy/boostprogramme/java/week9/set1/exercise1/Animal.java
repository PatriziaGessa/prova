package academy.boostprogramme.java.week9.set1.exercise1;

import java.util.Objects;

public class Animal {

    private String name;
    private String movement;
    private String animalKind;

    public Animal(String name, String movement, String animalKind) {
        this.name = name;
        this.movement = movement;
        this.animalKind = animalKind;
    }

    public String getName() {
        return name;
    }

    public String getMovement() {
        return movement;
    }

    public String getAnimalKind() {
        return animalKind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) &&
                Objects.equals(movement, animal.movement) &&
                Objects.equals(animalKind, animal.animalKind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, movement, animalKind);
    }
}
