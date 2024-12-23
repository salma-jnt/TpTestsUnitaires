package com.janati;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PersonService {
    public static List<Person> filterByAddress(String address) {
        List<Person> mockPersonsDatabase = Arrays.asList(
            new Person("Salma", "Janati", LocalDate.of(2004, 10, 02), "Rabat"),
            new Person("Basma", "Khaima", LocalDate.of(2003, 02, 21), "Casablanca"),
            new Person("Imane", "Zouhri", LocalDate.of(2005, 05, 13), "Marrakech")
        );

        Predicate<Person> hasAddress = person -> person.getAddress().equals(address);

        return mockPersonsDatabase.stream()
                                  .filter(hasAddress)
                                  .collect(Collectors.toList());
    }

    public static List<Person> filterAdults() {
        List<Person> mockPersonsDatabase = Arrays.asList(
            new Person("Salma", "Janati", LocalDate.of(2004, 10, 02), "Rabat"),
            new Person("Basma", "Khaima", LocalDate.of(2003, 02, 21), "Casablanca"),
            new Person("Imane", "Zouhri", LocalDate.of(2005, 05, 13), "Marrakech")
        );

        Predicate<Person> isAdult = person -> person.calculateAge() >= 18;

        return mockPersonsDatabase.stream()
                                  .filter(isAdult)
                                  .collect(Collectors.toList());
    }
}
