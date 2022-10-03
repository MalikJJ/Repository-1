package _7_1_GUI_lesson_example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JButton button;
    private JLabel label;
    private JTextField textField;
    public MainFrame() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BITLAB application");
        setSize(500, 500);
        setLayout(null);

        label = new JLabel("HELLO BITLAB APPLICATION");
        label.setSize(300, 30);
        label.setLocation(100, 100);
        add(label);

        textField = new JTextField("HELLO BITLAB APPLICATION");
        textField.setSize(300, 30);
        textField.setLocation(100, 150);

        add(textField);

        button = new JButton("CONFIRM");
        button.setSize(300, 30);
        button.setLocation(100, 200);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                if (text.equals("")) {
                    label.setText(text);
                    textField.setText("");
                }
            }
        });
        add(button);
    }
}
