import com.janati.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PersonIteratorTest {

    @Test
    void testTwoPersonAreEquals() {

        Set<Person> people = new HashSet<>();
        Person person1 = new Person(1, "salma");
        Person person2 = new Person(2, "basma");
        Person person3 = new Person(1, "imane");


        people.add(person1);
        people.add(person2);
        people.add(person3);

        assertThat(people).hasSize(2);
        assertThat(people).contains(person1, person2);
    }

    @Test
    void testException() {

        Set<Person> people = new HashSet<>();
        people.add(new Person(1, "basma"));
        people.add(new Person(2, "salma"));


        assertThatThrownBy(() -> {
            for (Person p : people) {
                if (p.getId() == 1) {
                    people.remove(p);
                }
            }
        }).isInstanceOf(java.util.ConcurrentModificationException.class);
    }

    @Test
    void testRemoveWithIterator() {

        Set<Person> people = new HashSet<>();
        Person person1 = new Person(1, "imad");
        Person person2 = new Person(2, "kaoutar");
        people.add(person1);
        people.add(person2);

        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            if (p.getId() == 2) {
                iterator.remove();
            }
        }

        // Assert
        assertThat(people).hasSize(1);
        assertThat(people).contains(person1);
        assertThat(people).doesNotContain(person2);
    }
}