package GUI;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;

import javax.swing.GroupLayout.Alignment;

public class AWTApp {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setTitle("My First AWT GUI App");
        frame.setSize(350, 200);

        Label label = new Label();
        label.setText("Hello, World!");
        label.setBackground(Color.GRAY);
        label.setAlignment(Label.CENTER);

        frame.add(label);

        frame.setVisible(true);
    }
}
