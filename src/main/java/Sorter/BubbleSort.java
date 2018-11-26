package Sorter;

import Comparator.Comparator;
import Person.Person;

public class BubbleSort implements Sorter {

    public void sort(Person[] people, Comparator comparator) {
        for (int i = 0; i < people.length; i++)
            for (int j = 0; j < people.length - i - 1; j++)
                if (comparator.Compare(people[i], people[j]) > 0) {
                    Person temp = people[i];
                    people[i] = people[j];
                    people[j] = temp;
                }
    }
}
