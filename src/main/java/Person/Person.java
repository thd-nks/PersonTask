package Person;

import org.joda.time.DateTime;
import org.joda.time.Years;

public class Person {
    /**
     * Static property with id of the last person added
     */
    private static Integer lastid = 0;
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
    private Boolean Sex;
    /**
     * Property with id of the person
     */
    private Integer Id;

    /**
     * Person's constructor
     *
     * @param birthdate (DateTime)
     * @param name      (String)
     * @param sex       (boolean)
     */
    public Person(String name, DateTime birthdate, Boolean sex) {
        this.Name = name;
        this.Birthdate = birthdate;
        this.Sex = sex;
        this.Id = lastid++;
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
    public Integer getAge() {
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
    public Integer getId() {
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
