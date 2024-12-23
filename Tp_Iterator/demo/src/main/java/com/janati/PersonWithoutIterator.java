package com.janati;

import java.util.HashSet;
import java.util.Set;

public class PersonWithoutIterator {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        people.add(new Person(1, "Salma"));
        people.add(new Person(2, "Basma"));
        people.add(new Person(3, "Imane"));

        // Suppression sans iterator (provoque une ConcurrentModificationException)
        for (Person person : people) {
            if (person.getName().equals("Basma")) {
                people.remove(person); // Erreur ici
            }
        }
    }
}
