import Checker.AgeChecker;
import Checker.Checker;
import Checker.IdChecker;
import Checker.NameChecker;
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
                        System.out.println("Select parameter:\n 1.Id\n 2.Age\n 3.Name");
                        switch (scanner.nextInt()) {
                            case (1):
                                System.out.println("Enter ID:");
                                ShowPerson(new IdChecker(), scanner.nextInt(), People);
                                break;
                            case (2):
                                System.out.println("Enter Age:");
                                ShowPerson(new AgeChecker(), scanner.nextInt(), People);
                                break;
                            case (3):
                                System.out.println("Enter Name:");
                                ShowPerson(new NameChecker(), scanner.next(), People);
                                break;
                            default:
                                break;
                        }
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

    private static void AddPerson(Scanner scanner, PersonRepo People) throws Exception {
        System.out.println("Name:");
        String Name = scanner.next();
        System.out.println("Sex (Male/Female):");
        String temporary = scanner.next();
        Boolean Sex;
        if (temporary.toLowerCase().equals("male"))
            Sex = true;
        else if (temporary.toLowerCase().equals("female"))
            Sex = false;
        else throw new Exception();
        System.out.println("Date of birth (like 'dd/mm/yyyy'):");
        DateTime Birthdate = DateTime.parse(scanner.next(), DateTimeFormat.forPattern("dd/mm/yyyy"));
        People.AddPerson(new Person(Name, Birthdate, Sex));
    }

    private static void ShowPerson(Checker checker, Object seeked, PersonRepo People) {
        System.out.println(People.Find(checker, seeked));
    }

    private static void DeletePerson(Integer id, PersonRepo People) {
        People.DeletePerson(id);
        System.out.println("Deleted");
    }
}
