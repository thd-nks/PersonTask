package PersonRepo;

import Checker.Checker;
import Person.Person;
import org.joda.time.DateTime;

public class PersonRepo {
    /**
     * Person's array
     */
    private Person[] People;
    /**
     * Integer pointer at the first empty element of People
     */
    private int pointer = 0;

    /**
     * Person's array constructor
     */
    public PersonRepo() {
        People = new Person[10];
        AddPerson(new Person("3", new DateTime(1996, 12, 21, 0, 0), true));
        AddPerson(new Person("3", new DateTime(1996, 12, 20, 0, 0), true));
        AddPerson(new Person("5", new DateTime(1995, 11, 21, 0, 0), false));
        AddPerson(new Person("1", new DateTime(1998, 1, 21, 0, 0), false));
        AddPerson(new Person("2", new DateTime(1993, 11, 21, 0, 0), false));
    }

    /*
     * Method that seeks for particular person
     * @return (Person)
     *
    public Person FindPerson(int id) {
        if (id < People.length || id < People[People.length - 1].getId())
            for (Person person : People) {
                if (person.getId() == id)
                    return person;
            }
        return null;
    }
    */

    /**
     * Method that adds person to the array
     * @param person (Person)
     */
    public void AddPerson(Person person) {
        if (pointer < People.length) {
            People[pointer] = person;
            pointer++;
        } else {
            Person[] newPeople = new Person[People.length + 10];
            System.arraycopy(People, 0, newPeople, 0, People.length);
            People = newPeople;
            People[pointer] = person;
            pointer++;
        }
        System.out.println("ID: " + person.getId());
    }

    /**
     * Method that deletes particular person
     * @param id (int)
     */
    public void DeletePerson(int id) {
        for (int i = 0; i < People.length; i++)
            if (People[i].getId() == id) {
                System.arraycopy(People, i + 1, People, i, People.length - i - 1);
                // for (int j = i; j < People.length - 1; j++)
                //    People[j] = People[j + 1];
                //People[pointer - 1] = null;
                pointer--;
                break;
            }
    }

    /**
     * Method that finds
     *
     * @param checker (Checker)
     * @param seeked  (Object)
     */
    public Person Find(Checker checker, Object seeked) {
        for (Person person : People) {
            if (checker.Check(person, seeked))
                return person;
        }
        return null;
    }

}
