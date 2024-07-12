package Task1_1;

public class App {
    // MEMBERS

    // FIELDS
    String title = "My OOP App";
    float version = 1.0F;

    // METHODS

    void init() {
        System.out.println("Initialization...");
    }

    void printInfo() {
        System.out.println(title + " v." + version);
    }

    void quit() {
        System.out.println("Terminating app...");
        System.exit(0);
    }
}
