package Person;

import org.joda.time.DateTime;
import org.joda.time.Years;

public class Person {
    /**
     * Static property with id of the last person added
     */
    private static int id = 0;
    /**
     * Property with the name of the person
     */
    private String Name;
    /**
     * Property with the date of birth of the person
     */
    private DateTime Birthdate;
    /**
     * Property with sex of the person (True = Male, False = Female)
     */
    private boolean Sex;
    /**
     * Property with id of the person
     */
    private int Id;

    /**
     * Person's constructor
     *
     * @param birthdate (DateTime)
     * @param name      (String)
     * @param sex       (boolean)
     */
    public Person(String name, DateTime birthdate, boolean sex) {
        this.Name = name;
        this.Birthdate = birthdate;
        this.Sex = sex;
        this.Id = id++;
    }

    /**
     * Method that returns person's name
     * @return (String)
     */
    public String getName() {
        return Name;
    }

    /**
     * Method that calculates person's age
     * @return (int)
     */
    public int getAge() {
        return Years.yearsBetween(Birthdate, DateTime.now()).getYears();
    }

    /**
     * Method that returns person's sex
     * @return (String)
     */
    public String getSex() {
        if (this.Sex)
            return "Male";
        else return "Female";
    }

    /**
     * Method that returns person's id
     * @return (int)
     */
    public int getId() {
        return this.Id;
    }

    /**
     * String representation of the person
     * @return (String)
     */
    @Override
    public String toString() {
        return "ID: " + getId() + "\nName: " + getName() + "\nAge: " + getAge() + "\nSex: " + getSex() + "\n";
    }


}
