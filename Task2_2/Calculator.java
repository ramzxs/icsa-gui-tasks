package Task2_2;

import java.awt.Color;
import java.awt.Component;
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

        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = (double) 1 / 4;
        gbc.weighty = (double) 1 / 6;
        gbc.fill = GridBagConstraints.BOTH;
        

        this.setLayout(gbl);

        // Label
        lblMain.setOpaque(true);
        lblMain.setBackground(Color.LIGHT_GRAY);
        lblMain.setAlignmentX(RIGHT_ALIGNMENT);
        lblMain.setAlignmentY(CENTER_ALIGNMENT);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.gridheight = 2;
        this.add(lblMain, gbc);

        gbc.gridwidth = 1;
        gbc.gridheight = 1;

        // OPs
        gbc.gridx = 3;
        gbc.gridy = 5;
        this.add(btnEq, gbc);

        gbc.gridx = 3;
        gbc.gridy = 4;
        this.add(btnPlus, gbc);

        gbc.gridx = 3;
        gbc.gridy = 3;
        this.add(btnMinus, gbc);

        gbc.gridx = 3;
        gbc.gridy = 2;
        this.add(btnTimes, gbc);

        gbc.gridx = 3;
        gbc.gridy = 1;
        this.add(btnDivide, gbc);

        gbc.gridx = 3;
        gbc.gridy = 0;
        this.add(btnPercent, gbc);


        // 0, 1-3
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

        // 4-6
        gbc.gridx = 0;
        gbc.gridy = 3;
        this.add(btn4, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        this.add(btn5, gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        this.add(btn6, gbc);

        // 7-9
        gbc.gridx = 0;
        gbc.gridy = 2;
        this.add(btn7, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        this.add(btn8, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        this.add(btn9, gbc);



        this.setVisible(true);
    }
}
