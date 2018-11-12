package Person;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class Person {

    private static int id = 0;

    private String Name;

    private DateTime Birthdate;

    private boolean Sex;

    private int Id;

    public Person(String name, DateTime birthdate, boolean sex) {
        this.Name = name;
        this.Birthdate = birthdate;
        this.Sex = sex;
        this.Id = id++;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Days.daysBetween(Birthdate, DateTime.now()).getDays() / 365;
    }

    public String getSex() {
        if (this.Sex)
            return "Male";
        else return "Female";
    }

    public int getId() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + "\nName: " + getName() + "\nAge: " + getAge() + "\nSex: " + getSex() + "\n";
    }


}
