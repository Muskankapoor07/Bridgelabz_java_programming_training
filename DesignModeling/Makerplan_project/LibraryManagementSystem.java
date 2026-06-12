import java.util.*;

// ======================
// Observer Pattern
// ======================

interface Observer {
    void update(String message);
}

class NotificationService {

    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void notifyUsers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

// ======================
// User Classes
// ======================

abstract class User implements Observer {
    protected String name;

    public User(String name) {
        this.name = name;
    }
}

class Student extends User {

    public Student(String name) {
        super(name);
    }

    @Override
    public void update(String message) {
        System.out.println("Student " + name + " received: " + message);
    }
}

class Faculty extends User {

    public Faculty(String name) {
        super(name);
    }

    @Override
    public void update(String message) {
        System.out.println("Faculty " + name + " received: " + message);
    }
}

class Librarian extends User {

    public Librarian(String name) {
        super(name);
    }

    @Override
    public void update(String message) {
        System.out.println("Librarian " + name + " received: " + message);
    }
}

// ======================
// Factory Pattern
// ======================

class UserFactory {

    public static User createUser(String type, String name) {

        if (type.equalsIgnoreCase("student")) {
            return new Student(name);
        }

        if (type.equalsIgnoreCase("faculty")) {
            return new Faculty(name);
        }

        if (type.equalsIgnoreCase("librarian")) {
            return new Librarian(name);
        }

        throw new IllegalArgumentException("Invalid User Type");
    }
}

// ======================
// Singleton Pattern
// ======================

class LibraryCatalog {

    private static LibraryCatalog instance;

    private LibraryCatalog() {
    }

    public static LibraryCatalog getInstance() {

        if (instance == null) {
            instance = new LibraryCatalog();
        }

        return instance;
    }

    public void showCatalog() {
        System.out.println("Library Catalog Accessed");
    }
}

// ======================
// Builder Pattern
// ======================

class Book {

    private String title;
    private List<String> authors;
    private String edition;
    private String genre;

    private Book(BookBuilder builder) {
        this.title = builder.title;
        this.authors = builder.authors;
        this.edition = builder.edition;
        this.genre = builder.genre;
    }

    public void displayBook() {
        System.out.println("\nBook Details");
        System.out.println("Title : " + title);
        System.out.println("Authors : " + authors);
        System.out.println("Edition : " + edition);
        System.out.println("Genre : " + genre);
    }

    static class BookBuilder {

        private String title;
        private List<String> authors = new ArrayList<>();
        private String edition;
        private String genre;

        public BookBuilder(String title) {
            this.title = title;
        }

        public BookBuilder authors(List<String> authors) {
            this.authors = authors;
            return this;
        }

        public BookBuilder edition(String edition) {
            this.edition = edition;
            return this;
        }

        public BookBuilder genre(String genre) {
            this.genre = genre;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}

// ======================
// Main Class
// ======================

public class LibraryManagementSystem {

    public static void main(String[] args) {

        System.out.println("===== Library Management System =====");

        // Singleton
        LibraryCatalog catalog1 = LibraryCatalog.getInstance();
        LibraryCatalog catalog2 = LibraryCatalog.getInstance();

        System.out.println("\nSingleton Check:");
        System.out.println(catalog1 == catalog2);

        // Factory
        User student = UserFactory.createUser("student", "Muskan");
        User faculty = UserFactory.createUser("faculty", "Rahul");
        User librarian = UserFactory.createUser("librarian", "Admin");

        // Observer
        NotificationService notificationService = new NotificationService();

        notificationService.subscribe(student);
        notificationService.subscribe(faculty);
        notificationService.subscribe(librarian);

        System.out.println("\nObserver Notification:");
        notificationService.notifyUsers("New Java Book Arrived!");

        // Builder
        Book book = new Book.BookBuilder("Clean Code")
                .authors(Arrays.asList("Robert Martin"))
                .edition("2nd Edition")
                .genre("Programming")
                .build();

        book.displayBook();
    }
}