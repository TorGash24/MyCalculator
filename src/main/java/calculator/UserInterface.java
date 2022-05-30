package calculator;

import org.w3c.dom.css.Rect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterface extends JFrame {

    Context calculator;

    private final JButton button0 = new JButton("0");
    private final JButton button1 = new JButton("1");
    private final JButton button2 = new JButton("2");
    private final JButton button3 = new JButton("3");
    private final JButton button4 = new JButton("4");
    private final JButton button5 = new JButton("5");
    private final JButton button6 = new JButton("6");
    private final JButton button7 = new JButton("7");
    private final JButton button8 = new JButton("8");
    private final JButton button9 = new JButton("9");
    private final JButton buttonEquals = new JButton("=");
    private final JButton buttonClear = new JButton("C");
    private final JButton buttonPlus = new JButton("+");
    private final JButton buttonMines = new JButton("-");
    private final JButton buttonMultiply = new JButton("*");
    private final JButton buttonDeviation = new JButton("/");

    private final JLabel label = new JLabel("Результат", 4);

    public UserInterface() {
        super("Calculator");
        this.setBounds(200, 200, 600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(5, 4, 5, 5));
        ButtonGroup groupDigits = new ButtonGroup();
        groupDigits.add(button1);
        groupDigits.add(button2);
        groupDigits.add(button3);
        groupDigits.add(button4);
        groupDigits.add(button5);
        groupDigits.add(button6);
        groupDigits.add(button7);
        groupDigits.add(button8);
        groupDigits.add(button9);
        groupDigits.add(button0);


        ButtonGroup groupAction = new ButtonGroup();
        groupAction.add(buttonMultiply);
        groupAction.add(buttonDeviation);
        groupAction.add(buttonPlus);
        groupAction.add(buttonMines);

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
        container.add(buttonPlus);
        container.add(buttonMines);
        container.add(buttonMultiply);
        container.add(buttonDeviation);
        container.add(buttonClear);
        container.add(buttonEquals);
        container.add(label);

        button0.addActionListener(new ClickButton0());
        button1.addActionListener(new ClickButton0());



    }

    class ClickButton0 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            calculator = new Context();
            calculator.press('0');
            label.setText(String.valueOf(calculator.x));
        }
    }

    class ClickButton1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            calculator = new Context();
            calculator.press('1');
            label.setText(String.valueOf(calculator.x));
        }
    }
}
