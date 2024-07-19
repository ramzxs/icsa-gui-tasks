package GUI;


import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class SwingApp {
    public static void main(String[] args) {
        JFrame f = new JFrame("My First Swing GUI App");
        f.setSize(400, 400);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Label l = new Label("Hello, Swing!");

        f.add(l);

        f.setVisible(true);
    }   
}
