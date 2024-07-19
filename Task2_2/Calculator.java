package Task2_2;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class Calculator extends JFrame {
    JLabel lblMain = new JLabel("Text");

    JButton btn0 = new JButton("0"),
        btn1 = new JButton("1"),
        btn2 = new JButton("2"),
        btn3 = new JButton("3"),
        btn4 = new JButton("4"),
        btn5 = new JButton("5"),
        btn6 = new JButton("6"),
        btn7 = new JButton("7"),
        btn8 = new JButton("8"),
        btn9 = new JButton("9");

    JButton btnEq = new JButton("="),
        btnPlus = new JButton("+"),
        btnMinus = new JButton("-"),
        btnTimes = new JButton("*"),
        btnDivide = new JButton("/"),
        btnPercent = new JButton("%");

    public static void main(String[] args) {
        new Calculator();        
    }

    public Calculator() {
        this.setTitle("My Calculator");
        this.setSize(500, 400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 3;
        gbc.gridy = 5;
        this.add(btnEq, gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        this.add(btn0, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        this.add(btn1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        this.add(btn2, gbc);

        gbc.gridx = 2;
        gbc.gridy = 4;
        this.add(btn3, gbc);


        this.setVisible(true);
    }
}
