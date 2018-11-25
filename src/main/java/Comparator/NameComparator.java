package Comparator;

import Person.Person;

public class NameComparator implements Comparator {

    public int Compare(Person person1, Person person2) {
        return person1.getName().compareTo(person2.getName());
    }
}
