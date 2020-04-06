package academy.boostprogramme.java.week5.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class FirstByAgeFinderTest {

    FirstByAgeFinder firstByAgeFinder = new FirstByAgeFinder();
    @Test
    void findReturnEmptyOptionalForEmptyList() {
        List<Person> input = List.of();
        int age = 30;
        Optional<Person> oResult = firstByAgeFinder.find(input, age);
        Assertions.assertTrue(oResult.isEmpty());
    }
    @Test
    void findReturnsEmptyOptionalForListWithoutRightAge() {
        Person me = new Person("Me", 23);
        Person you = new Person("You", 36);
        Person she = new Person("She", 38);
        int age = 55;
        List<Person> input = List.of(me,you,she);
        Optional<Person> oResult = firstByAgeFinder.find(input, age);
        Assertions.assertTrue(oResult.isEmpty());
    }
    @Test
    void findReturnsCorrectPersonForListWithCorrectAge () {
        Person me = new Person("Me", 23);
        Person you = new Person("You", 36);
        Person she = new Person("She", 38);
        int age = 23;
        List<Person> input = List.of(me,you,she);
        Optional<Person> oResult = firstByAgeFinder.find(input, age);
        Assertions.assertTrue(oResult.isPresent());
        Person expectedPerson = oResult.get();
        String expectedName = "Me";
        int expectedAge = 23;
        Assertions.assertEquals(expectedName, expectedPerson.getName());
        Assertions.assertEquals(expectedAge, expectedPerson.getAge());
    }


}