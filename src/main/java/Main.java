import Person.Person;
import PersonRepo.PersonRepo;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonRepo People = new PersonRepo();
        for (; ; ) {
            System.out.print("What do you want?\n 1.Add\n 2.Find\n 3.Delete\n 4.Exit\n");
            try {
                switch (scanner.nextInt()) {
                    case (1):
                        AddPerson(scanner, People);
                        break;

                    case (2):
                        System.out.println("Enter person's ID: ");
                        ShowPerson(scanner.nextInt(), People);
                        break;

                    case (3):
                        System.out.println("Enter person's ID: ");
                        DeletePerson(scanner.nextInt(), People);
                        break;

                    case (4):
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Select correct number");
                }
            } catch (Exception exception) {
                System.out.println(exception.toString());
            }
        }
    }

    static void AddPerson(Scanner scanner, PersonRepo People) throws Exception {
        System.out.println("Name:");
        String Name = scanner.next();
        System.out.println("Sex (Male/Female):");
        String temporary = scanner.next();
        boolean Sex;
        if (temporary.toLowerCase().equals("male"))
            Sex = true;
        else if (temporary.toLowerCase().equals("female"))
            Sex = false;
        else throw new Exception();
        System.out.println("Date of birth (like 'dd/mm/yyyy'):");
        DateTime Birthdate = DateTime.parse(scanner.next(), DateTimeFormat.forPattern("dd/mm/yyyy"));
        People.AddPerson(new Person(Name, Birthdate, Sex));
    }

    static void ShowPerson(int id, PersonRepo People) {
        System.out.println(People.FindPerson(id).toString());
    }

    static void DeletePerson(int id, PersonRepo People) {
        People.DeletePerson(id);
        System.out.println("Deleted");
    }
}
