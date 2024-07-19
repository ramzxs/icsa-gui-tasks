package Task2_1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;

public class Main {
    public static void main(String[] args) {
        System.out.println("AWT GUI Counter App (Console)");

        Frame f = new Frame("AWT GUI Counter App");
        f.setSize(400, 300);
        f.setLayout(new BorderLayout());

        Font font = new Font("Arial", Font.BOLD, 100);

        TextField counter = new TextField("0");        
        counter.setFont(font);
        counter.setEditable(false);

        Button count = new Button("Count");
        count.setFont(font);

        f.add(counter, BorderLayout.NORTH);
        f.add(count, BorderLayout.SOUTH);

        f.setVisible(true);
    }
}
