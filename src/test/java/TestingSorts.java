import Person.Person;
import PersonRepo.PersonRepo;
import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;

class TestingSorts {

    @BeforeEach
    void begin() {
        PersonRepo people = new PersonRepo();
        people.AddPerson(new Person("3", new DateTime(1996, 12, 21, 0, 0), true));
        people.AddPerson(new Person("3", new DateTime(1996, 12, 20, 0, 0), true));
        people.AddPerson(new Person("5", new DateTime(1995, 11, 21, 0, 0), false));
        people.AddPerson(new Person("1", new DateTime(1998, 1, 21, 0, 0), false));
        people.AddPerson(new Person("2", new DateTime(1993, 11, 21, 0, 0), false));
    }

}


