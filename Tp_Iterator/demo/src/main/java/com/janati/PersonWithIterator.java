package com.janati;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PersonWithIterator {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        people.add(new Person(1, "Salma"));
        people.add(new Person(2, "Basma"));
        people.add(new Person(3, "Imane"));

        // Suppression avec iterator (sécurisé)
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getName().equals("Basma")) {
                iterator.remove(); // Suppression sécurisée
            }
        }

        System.out.println("Set après suppression de 'Basma' : " + people);
    }
}
