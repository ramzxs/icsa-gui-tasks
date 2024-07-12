public abstract class Account {
    String accountNumber;

    public abstract void open();
    public abstract void close();

    public void showInfo() {
        System.out.println("Info");
    }
}
