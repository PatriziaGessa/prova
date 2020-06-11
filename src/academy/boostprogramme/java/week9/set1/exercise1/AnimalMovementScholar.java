package academy.boostprogramme.java.week9.set1.exercise1;

import academy.boostprogramme.java.week4.set2.exercise2.LineSumCalculator;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnimalMovementScholar {

    private List<Animal> animals = Animals.get();

    public Optional<String> elaborate(String keyword) {
        Optional<String> oName = findName(keyword);
        if (oName.isPresent()) {
            return oName;
        }
        return findMovement(keyword);
    }


    private Optional<String> findName(String keyword) {
        return animals.stream()
                .filter(animal -> animal.getName().equalsIgnoreCase(keyword))
                .map(Animal::getMovement)
                .findFirst();
    }

    private Optional<String> findMovement(String keyword) {
        String movements = animals.stream()
                .filter(animal -> animal.getAnimalKind().equalsIgnoreCase(keyword))
                .map(Animal::getMovement)
                .collect(Collectors.joining(","));
        if (movements.isEmpty()) {
            return Optional.empty();
        }
        String differentMovements = Stream.of(movements.split(","))
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));
        return Optional.of(differentMovements);
    }
}
