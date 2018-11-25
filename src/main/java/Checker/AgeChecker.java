package Checker;

import Person.Person;

public class AgeChecker implements Checker {

    public boolean Check(Person person1, Object object) {
        return person1.getAge().equals(object);
    }

}
