package Task2_1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Main {
    public static void main(String[] args) {
        System.out.println("AWT GUI Counter App (Console)");

        Frame f = new Frame("AWT GUI Counter App");
        f.setSize(800, 400);
        f.setLayout(new FlowLayout());

        Label l = new Label("Hello, World!");
        Button b = new Button("Quit");

        f.add(l);
        f.add(b);

        f.setVisible(true);
    }
}
