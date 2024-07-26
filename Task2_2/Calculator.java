package Task2_2;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class Calculator extends JFrame {
    JLabel lblMain = new JLabel("Hey!");

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


    String numLeft = "",
        opPrev = "",
        numRight = "",
        opCurrent = "";


    public static void main(String[] args) {
        new Calculator();        
    }

    public Calculator() {
        this.setTitle("My Calculator");
        this.setSize(500, 400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        /* UIs */

        lblMain.setOpaque(true);
        lblMain.setBackground(Color.LIGHT_GRAY);
        lblMain.setAlignmentX(RIGHT_ALIGNMENT);
        lblMain.setAlignmentY(CENTER_ALIGNMENT);
        lblMain.setFont(new Font("SanSerif", Font.BOLD, 32));


        /* EVENTS */
        ActionListener alNumbers = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String NUM = e.getActionCommand();

                // Clear all after an operation
                if (!opCurrent.equals("")) {
                    numLeft = "";
                    opPrev = "";
                    numRight = "";
                    opCurrent = "";
                }

                if (opPrev.equals("")) {
                    if (NUM.equals("0") && numLeft.isEmpty()) {
                        return;
                    } else {
                        numLeft += NUM;
                    }
                } else {
                    if (NUM.equals("0") && numRight.isEmpty()) {

                    } else {
                        numRight += NUM;
                    }
                }

                lblMain.setText(numLeft + " " + opPrev + " " + numRight + " " + opCurrent);
           }
        };


        // eval("12") = Number

        ActionListener alOps = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String OP = e.getActionCommand();

                if (numLeft.equals("")) return;

                if (OP.equals("=") && numRight.equals("")) return;


                if (OP.equals("%")) {
                    if (!numLeft.equals("") && !opPrev.equals("") && !numRight.isEmpty()) {
                        numRight = String.valueOf( Double.parseDouble(numLeft) * ((double) Double.parseDouble(numRight) / 100) );
                        lblMain.setText(numLeft + " " + opPrev + " " + numRight);
                    }
                    return;
                }

                String result = "";

                if (opPrev.equals("")) {
                    opPrev = OP;                             
                } else {
                    if (numRight.equals("")) {
                        opPrev = OP;
                        lblMain.setText(numLeft + " " + opPrev);
                        return;
                    }
                    
                    opCurrent = OP;

                    float nl = Float.parseFloat(numLeft);
                    float nr = Float.parseFloat(numRight);                    

                    switch (opPrev) {
                        case "+": result = String.valueOf( nl + nr ); break;
                        case "-": result = String.valueOf( nl - nr ); break;
                        case "*": result = String.valueOf( nl * nr ); break;
                        case "/": result = String.valueOf( nl / nr ); break;
                    }

                    // RegEx i//gm
                    result = result.replaceAll("\\.0$", "");

                    if (!opCurrent.equals("=")) {
                        numLeft = result;
                        opPrev = opCurrent;
                        numRight = opCurrent = result = "";
                    }
                }

                lblMain.setText(numLeft + " " + opPrev + " " +  numRight + " " +  opCurrent + " " +  result);
           }
        };


        btn0.addActionListener(alNumbers);
        btn1.addActionListener(alNumbers);
        btn2.addActionListener(alNumbers);
        btn3.addActionListener(alNumbers);
        btn4.addActionListener(alNumbers);
        btn5.addActionListener(alNumbers);
        btn6.addActionListener(alNumbers);
        btn7.addActionListener(alNumbers);
        btn8.addActionListener(alNumbers);
        btn9.addActionListener(alNumbers);

        btnEq.addActionListener(alOps);
        btnPlus.addActionListener(alOps);
        btnMinus.addActionListener(alOps);
        btnTimes.addActionListener(alOps);
        btnDivide.addActionListener(alOps);
        btnPercent.addActionListener(alOps);


        /* LAYOUT */

        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = (double) 1 / 4;
        gbc.weighty = (double) 1 / 6;
        gbc.fill = GridBagConstraints.BOTH;

        this.setLayout(gbl);

        // Label
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.gridheight = 2;
        this.add(lblMain, gbc);

        // Reset
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
