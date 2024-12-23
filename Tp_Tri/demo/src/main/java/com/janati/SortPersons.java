package com.janati;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortPersons {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Janati", "Salma"));
        people.add(new Person("Khaima", "Basma"));
        people.add(new Person("Zouhri", "Imane"));
        people.add(new Person("Adalou", "Hajiba"));

        // Tri de la liste de personnes
        Collections.sort(people);

        // Affichage des personnes triées
        System.out.println("Liste triée de personnes : ");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
