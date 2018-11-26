package Sorter;

import Comparator.Comparator;
import Person.Person;

public class SelectionSort implements Sorter {

    public void sort(Person[] people, Comparator comparator) {
        for (int min = 0; min < people.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < people.length; j++) {
                if (comparator.Compare(people[j], people[least]) < 0) {
                    least = j;
                }
            }
            Person tmp = people[min];
            people[min] = people[least];
            people[least] = tmp;
        }
    }
}
