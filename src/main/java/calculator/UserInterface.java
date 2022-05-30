package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterface extends JFrame {
    Context calculator = new Context();
    private final JLabel label = new JLabel();
    private final JLabel labelExample = new JLabel();

    public UserInterface() {
        super("Calculator");
        this.setBounds(200, 200, 600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(6, 3, 5, 5));

        ButtonGroup groupDigits = new ButtonGroup();
        JButton button0 = new JButton("0");
        groupDigits.add(button0);
        JButton button1 = new JButton("1");
        groupDigits.add(button1);
        JButton button2 = new JButton("2");
        groupDigits.add(button2);
        JButton button3 = new JButton("3");
        groupDigits.add(button3);
        JButton button4 = new JButton("4");
        groupDigits.add(button4);
        JButton button5 = new JButton("5");
        groupDigits.add(button5);
        JButton button6 = new JButton("6");
        groupDigits.add(button6);
        JButton button7 = new JButton("7");
        groupDigits.add(button7);
        JButton button8 = new JButton("8");
        groupDigits.add(button8);
        JButton button9 = new JButton("9");
        groupDigits.add(button9);

        container.add(button1);
        container.add(button2);
        container.add(button3);
        container.add(button4);
        container.add(button5);
        container.add(button6);
        container.add(button7);
        container.add(button8);
        container.add(button9);
        container.add(button0);

        ButtonGroup groupAction = new ButtonGroup();
        JButton buttonMultiply = new JButton("*");
        groupAction.add(buttonMultiply);
        JButton buttonDeviation = new JButton("/");
        groupAction.add(buttonDeviation);
        JButton buttonPlus = new JButton("+");
        groupAction.add(buttonPlus);
        JButton buttonMines = new JButton("-");
        groupAction.add(buttonMines);

        container.add(buttonPlus);
        container.add(buttonMines);
        container.add(buttonMultiply);
        container.add(buttonDeviation);

        JButton buttonClear = new JButton("C");
        container.add(buttonClear);
        JButton buttonEquals = new JButton("=");
        container.add(buttonEquals);

        container.add(label);
        container.add(labelExample);

        button0.addActionListener(new ClickButton0());
        button1.addActionListener(new ClickButton1());
        button2.addActionListener(new ClickButton2());
        button3.addActionListener(new ClickButton3());
        button4.addActionListener(new ClickButton4());
        button5.addActionListener(new ClickButton5());
        button6.addActionListener(new ClickButton6());
        button7.addActionListener(new ClickButton7());
        button8.addActionListener(new ClickButton8());
        button9.addActionListener(new ClickButton9());

        buttonPlus.addActionListener(new ClickButtonPlus());
        buttonMines.addActionListener(new ClickButtonMines());
        buttonMultiply.addActionListener(new ClickButtonMul());
        buttonDeviation.addActionListener(new ClickButtonDiv());

        buttonEquals.addActionListener(new ClickButtonEquals());
        buttonClear.addActionListener(new ClickButtonClear());
    }

    class ClickButton0 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            char key = '0';
            calculator.press(key);
            if (calculator.state.getClass().getName().equals("calculator.StateX")) {
                label.setText(String.valueOf(calculator.x));
                labelExample.setText(calculator.toString());
            } else {
                label.setText(String.valueOf(calculator.y));
                labelExample.setText(calculator.toString());
            }
        }
    }

    class ClickButton1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            char key = '1';
            calculator.press(key);
            if (calculator.state.getClass().getName().equals("calculator.StateX")) {
                label.setText(String.valueOf(calculator.x));
                labelExample.setText(calculator.toString());
            } else {
                label.setText(String.valueOf(calculator.y));
                labelExample.setText(calculator.toString());
            }
        }
    }

    class ClickButton2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            char key = '2';
            calculator.press(key);
            if (calculator.state.getClass().getName().equals("calculator.StateX")) {
                label.setText(String.valueOf(calculator.x));
                labelExample.setText(calculator.toString());
            } else {
                label.setText(String.valueOf(calculator.y));
                labelExample.setText(calculator.toString());
            }
        }
    }

    class ClickButton3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            char key = '3';
            calculator.press(key);
            if (calculator.state.getClass().getName().equals("calculator.StateX")) {
                label.setText(String.valueOf(calculator.x));
                labelExample.setText(calculator.toString());
            } else {
                label.setText(String.valueOf(calculator.y));
                labelExample.setText(calculator.toString());
            }
        }
    }

    class ClickButton4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            char key = '4';
            calculator.press(key);
            if (calculator.state.getClass().getName().equals("calculator.StateX")) {
                label.setText(String.valueOf(calculator.x));
                labelExample.setText(calculator.toString());
            } else {
                label.setText(String.valueOf(calculator.y));
                labelExample.setText(calculator.toString());
            }
        }
    }

    class ClickButton5 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            char key = '5';
            calculator.press(key);
            if (calculator.state.getClass().getName().equals("calculator.StateX")) {
                label.setText(String.valueOf(calculator.x));
                labelExample.setText(calculator.toString());
            } else {
                label.setText(String.valueOf(calculator.y));
                labelExample.setText(calculator.toString());
            }
        }
    }

    class ClickButton6 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            char key = '6';
            calculator.press(key);
            if (calculator.state.getClass().getName().equals("calculator.StateX")) {
                label.setText(String.valueOf(calculator.x));
                labelExample.setText(calculator.toString());
            } else {
                label.setText(String.valueOf(calculator.y));
                labelExample.setText(calculator.toString());
            }
        }
    }

    class ClickButton7 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            char key = '7';
            calculator.press(key);
            if (calculator.state.getClass().getName().equals("calculator.StateX")) {
                label.setText(String.valueOf(calculator.x));
                labelExample.setText(calculator.toString());
            } else {
                label.setText(String.valueOf(calculator.y));
                labelExample.setText(calculator.toString());
            }
        }
    }

    class ClickButton8 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            char key = '8';
            calculator.press(key);
            if (calculator.state.getClass().getName().equals("calculator.StateX")) {
                label.setText(String.valueOf(calculator.x));
                labelExample.setText(calculator.toString());
            } else {
                label.setText(String.valueOf(calculator.y));
                labelExample.setText(calculator.toString());
            }
        }
    }

    class ClickButton9 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            char key = '9';
            calculator.press(key);
            if (calculator.state.getClass().getName().equals("calculator.StateX")) {
                label.setText(String.valueOf(calculator.x));
                labelExample.setText(calculator.toString());
            } else {
                label.setText(String.valueOf(calculator.y));
                labelExample.setText(calculator.toString());
            }
        }
    }

    class ClickButtonPlus implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            calculator.press('+');
            labelExample.setText(calculator.toString());
        }
    }

    class ClickButtonMines implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            calculator.press('-');
            labelExample.setText(calculator.toString());
        }
    }

    class ClickButtonMul implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            calculator.press('*');
            labelExample.setText(calculator.toString());
        }
    }

    class ClickButtonDiv implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            calculator.press('/');
            labelExample.setText(calculator.toString());
        }
    }

    class ClickButtonEquals implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String example = calculator.toString();
            calculator.press('=');
            label.setText(String.valueOf(calculator.x));
            labelExample.setText(example + " = " + calculator.x);
        }
    }

    class ClickButtonClear implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            calculator.press('C');
            label.setText("");
            labelExample.setText("");
        }
    }
}