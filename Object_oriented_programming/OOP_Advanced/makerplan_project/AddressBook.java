import java.util.ArrayList;

class Person {

    String name;
    String phone;

    Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String toString() {
        return name + " - " + phone;
    }
}

public class AddressBook {

    static ArrayList<Person> contacts = new ArrayList<>();

    static void addPerson(String name, String phone) {

        for(Person p : contacts) {

            if(p.phone.equals(phone)) {
                System.out.println("Duplicate Entry Not Allowed");
                return;
            }
        }

        contacts.add(new Person(name, phone));
        System.out.println("Contact Added");
    }

    static void displayContacts() {

        for(Person p : contacts) {
            System.out.println(p);
        }
    }

    static void searchContact(String name) {

        for(Person p : contacts) {

            if(p.name.equalsIgnoreCase(name)) {
                System.out.println(p);
                return;
            }
        }

        System.out.println("Contact Not Found");
    }

    static void deleteContact(String phone) {

        contacts.removeIf(
                p -> p.phone.equals(phone)
        );

        System.out.println("Contact Deleted");
    }

    public static void main(String[] args) {

        addPerson("Muskan","9876543210");
        addPerson("Rahul","9876543211");

        displayContacts();

        searchContact("Muskan");

        deleteContact("9876543211");

        displayContacts();
    }
}