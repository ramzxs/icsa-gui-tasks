public class OOP {
    public static void main(String[] args) {
        System.out.println("JAVA OOP");

        // Primitive data types
        // int a = 0;
        // System.out.println(a);


        // OBJECTS
        // Declare, Initialize
        App app = new App();
        // System.out.println(app);
        app.version = 2.0F;
        app.init();
        app.printInfo();

        Person p1 = new Person();
        p1.name = "Romeo";
        p1.dob = "01/01/2000";
        System.out.println(p1.name + " (" + p1.dob + ")");

        // INHERITANCE
        Student s1 = new Student();
        s1.studentID = "10001";
        s1.name = "Bravo";
        s1.dob = "02/02/2002"; 
        System.out.println(s1.name + " (" + s1.dob + ")");


        // ABSTRACTION
        // Account a1 = new Account();
        // a1.accountNumber = "1111";

        SavingsAccount sa1 = new SavingsAccount();
        sa1.accountNumber = "1234";
        sa1.open();
        sa1.showInfo();
        sa1.close();

    }
}
