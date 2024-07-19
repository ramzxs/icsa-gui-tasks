package Task2_1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    static int n = 0;

    public static void main(String[] args) {
        Frame f = new Frame("AWT GUI Counter App");
        f.setSize(400, 300);
        f.setLayout(new BorderLayout());
        // f.addWindowListener(new WindowListener() {
        //     @Override
        //     public void windowOpened(WindowEvent e) {
        //         // TODO Auto-generated method stub
                
        //     }
        //     @Override
        //     public void windowIconified(WindowEvent e) {
        //         // TODO Auto-generated method stub
                
        //     }
        //     @Override
        //     public void windowDeiconified(WindowEvent e) {
        //         // TODO Auto-generated method stub
                
        //     }
        //     @Override
        //     public void windowActivated(WindowEvent e) {
        //         // TODO Auto-generated method stub
                
        //     }
        //     @Override
        //     public void windowDeactivated(WindowEvent e) {
        //         // TODO Auto-generated method stub
                
        //     }

        //     @Override
        //     public void windowClosed(WindowEvent e) {
        //         // TODO Auto-generated method stub
                
        //     }
        //     @Override
        //     public void windowClosing(WindowEvent e) {
        //         // TODO Auto-generated method stub
        //         System.exit(0);
        //     }
        // });

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);

                System.exit(0);
            }
        });

        Font font = new Font("Arial", Font.BOLD, 100);

        TextField counter = new TextField("0");        
        counter.setFont(font);
        counter.setEditable(false);
        counter.setBackground(Color.WHITE);

        Button count = new Button("Count");
        count.setFont(font);
        count.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // int n = Integer.parseInt( counter.getText() ); // "0" -> 0 + 1 = 1 -> "1"
                // n++; // n = n + 1

                counter.setText( String.valueOf(++n) ); // 0 (0 + 1 -> 1)
            }
        });

        f.add(counter, BorderLayout.NORTH);
        f.add(count, BorderLayout.SOUTH);

        f.setVisible(true);
    }
}
