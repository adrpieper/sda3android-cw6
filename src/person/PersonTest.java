package person;

import static java.lang.System.out;

/**
 * Created by Adrian on 2017-03-04.
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalski");
        Person person2 = person1;
        Person person3 = new Person("Jan", "Kowalski");
        Person person4 = new Person("Adam", "Dominik");

        out.println("a) " + (person1 == person2));
        out.println("b) " + (person1.equals(person2)));
        out.println("c) " + (person1 == person3));
        out.println("d) " + (person1.equals(person3)));
        out.println("e) " + (person1 == person4));
        out.println("f) " + (person1.equals(person4)));
    }
}

