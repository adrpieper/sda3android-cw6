package person;

/**
 * Created by Adrian on 2017-03-04.
 */
public class Person {
    private final String name;
    private final String surName;

    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person person = (Person) obj;
            return name.equals(person.name) &&
                    surName.equals(person.surName);
        }else {
            return false;
        }
    }
}
