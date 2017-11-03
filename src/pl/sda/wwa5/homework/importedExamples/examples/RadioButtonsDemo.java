package pl.sda.wwa5.homework.importedExamples.examples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonsDemo extends JFrame {



    private JLabel label = new JLabel("<html><i>Twoja ulubiona marka samochodów to: </i></html>");
    private ButtonGroup group = new ButtonGroup();
    private JRadioButton rb1 = new JRadioButton("BMW", true),
            rb2 = new JRadioButton("Mercedes", false),
            rb3 = new JRadioButton("Audi", false);
    private JTextField text = new JTextField(30);

    private ActionListener al = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            text.setText("Twoja ulubiona marka aut to " +
                    ((JRadioButton) e.getSource()).getText());
        }
    };

    public RadioButtonsDemo() {
        rb1.addActionListener(al); rb2.addActionListener(al); rb3.addActionListener(al);
        group.add(rb1);	group.add(rb2);	group.add(rb3);
        text.setEditable(false);
        setLayout(new FlowLayout());
        add(label);
        add(rb1); add(rb2); add(rb3);
        validate();
        add(text);
    }

}
