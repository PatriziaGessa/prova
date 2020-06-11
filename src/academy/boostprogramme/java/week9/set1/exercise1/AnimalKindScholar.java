package academy.boostprogramme.java.week9.set1.exercise1;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AnimalKindScholar {

    private List<Animal> animals = Animals.get();

    public Optional<String> elaborate(String keyword) {
        Optional<String> oName = findByName(keyword);
        if (oName.isPresent()) {
            return oName;
        }
        return findByKind(keyword);
    }

    private Optional<String> findByName(String keyword) {
        return animals.parallelStream()
                .filter(animal -> animal.getName().equalsIgnoreCase(keyword))
                .map(Animal::getAnimalKind)
                .findFirst();
    }

    private Optional<String> findByKind(String keyword) {
        String names = animals.stream()
                .filter(animal -> animal.getAnimalKind().equalsIgnoreCase(keyword))
                .map(Animal::getName)
                .sorted()
                .collect(Collectors.joining(","));
        if (names.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(names);
    }
}
