public class SavingsAccount extends Account {

    @Override
    public void open() {
        System.out.println("Opening account...");
    }

    @Override
    public void close() {
        System.out.println("Closing account...");
    }
    
}
