package Sorter;

import Comparator.Comparator;
import Person.Person;

public class InsertionSort implements Sorter {

    public void sort(Person[] people, Comparator comparator) {
        for (int j = 1; j < people.length; j++) {
            Person key = people[j];
            int i = j - 1;
            while (i >= 0 && comparator.Compare(people[i], key) > 0) {
                people[i + 1] = people[i];
                i--;
            }
            people[i + 1] = key;
        }
    }
}
