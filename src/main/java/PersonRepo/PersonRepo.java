package PersonRepo;

import Person.Person;

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
    }

    /**
     * Method that seeks for particular person
     *
     * @return (Person)
     */
    public Person FindPerson(int id) {
        if (id < People.length || id < People[People.length - 1].getId())
            for (Person person : People) {
                if (person.getId() == id)
                    return person;
            }
        return null;
    }

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
}
