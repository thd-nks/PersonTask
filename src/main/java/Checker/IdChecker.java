package Checker;

import Person.Person;

public class IdChecker implements Checker {

    public boolean Check(Person person, Object object) {
        return person.getId().equals(object);
    }
}
