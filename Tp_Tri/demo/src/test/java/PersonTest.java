import com.janati.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest {

    @Test
    void TriPersonsWithLastNameAndFirstName() {
        List<Person> people = new ArrayList<>();

        people.add(new Person("janati", "Salma"));
        people.add(new Person("Khaima", "Basma"));
        people.add(new Person("zouhri", "imane"));

        Collections.sort(people);
        assertThat(people).isNotNull();
        //assertJ
        assertThat(people)
                .extracting(Person::toString)
                .containsExactly(
                        "janati, Salma",
                        "Khaima, Basma",
                        "zouhri, imane"

                );
    }
}