import Controller.Connect_db;
import Controller.Person;

public class arch_log {
    public static void main(String[] args) {

        System.out.println("Welcome to Architecture logiciel project");
        Connect_db connect_db = new Connect_db();

        Person person = new Person();
        person.afficherPerson();
    }
}
