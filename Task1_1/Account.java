package Task1_1;

public abstract class Account {
    String accountNumber;

    public abstract void open();
    public abstract void close();

    void showInfo() {
        System.out.println("Info");
    }
}
