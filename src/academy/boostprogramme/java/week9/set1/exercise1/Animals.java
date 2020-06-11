package academy.boostprogramme.java.week9.set1.exercise1;

import java.util.List;

public class Animals {

    private static List<Animal> animals = List.of(
            new Mammal("dog","walk,run", "brown"),
            new Mammal("gorilla", "walk,run,climb","black"),
            new Bird("goose", "walk,fly,swim","white"),
            new Bird("sparrow","jump,fly","brown"),
            new Fish("salmon","swim","saltwater"),
            new Fish("angelfish","swim","freshwater"),
            new Reptile("snake","crawl,climb",true),
            new Reptile("turtle","crawl",true),
            new Amphibian("frog","walk,jump,swim", true),
            new Amphibian("caecilian","crawl,swim", false),
            new Arthropod("spider","walk,climb",8),
            new Arthropod("butterfly","walk,climb,fly",6));

    public static List<Animal> get() {
        return animals;
    }
}
