package Task2_1;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;

public class Main {
    public static void main(String[] args) {
        System.out.println("AWT GUI Counter App (Console)");

        Frame f = new Frame("AWT GUI Counter App");
        f.setSize(800, 400);

        Label l = new Label("Hello, World!");

        f.add(l);

        f.setVisible(true);
    }
}
