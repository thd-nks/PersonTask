package Checker;

import Person.Person;

public class NameChecker implements Checker {

    public boolean Check(Person person1, Object object) {
        return person1.getName().equals(object);
    }
}
