package pl.sda.wwa5.homework.importedExamples.examples;

import javax.swing.*;

public class SwingBarebones extends JFrame{
    JLabel label;

    public SwingBarebones() {
        super("Hello Swing!");
        label = new JLabel("Etykietka");
        add(label);
    }

}
