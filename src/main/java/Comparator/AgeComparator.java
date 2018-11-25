package Comparator;

import Person.Person;

public class AgeComparator implements Comparator {

    public int Compare(Person person1, Person person2) {
        return person1.getAge().compareTo(person2.getAge());
    }
}
