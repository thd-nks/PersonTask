package PersonRepo;

import Person.Person;

public class PersonRepo {

    private Person[] People;
    private int pointer = 0;

    public PersonRepo() {
        People = new Person[10];
    }

    public Person FindPerson(int id) {
        if (id < People.length || id < People[People.length - 1].getId())
            for (Person person : People) {
                if (person.getId() == id)
                    return person;
            }
        return null;
    }

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

    public void DeletePerson(int id) {
        for (int i = 0; i < People.length; i++)
            if (People[i].getId() == id) {
                for (int j = i; j < People.length - 1; j++)
                    People[j] = People[j + 1];
                People[pointer - 1] = null;
                break;
            }
    }
}
