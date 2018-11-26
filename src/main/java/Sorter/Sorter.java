package Sorter;

import Comparator.Comparator;
import Person.Person;

public interface Sorter {

    void sort(Person[] people, Comparator comparator);
}
