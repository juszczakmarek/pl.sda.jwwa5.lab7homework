package pl.sda.wwa5.homework.importedExamples.examples;

import javax.swing.*;
import java.awt.*;

public class MainPane extends JFrame {

    public MainPane() throws HeadlessException {
        super(Class.class.getCanonicalName());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300,100);
        setLocation(20,20);

        Container buttonContainer = getContentPane();

        buttonContainer.add(new JButton("Przycisk 1"));
        buttonContainer.add(new JButton("Przycisk 2"));
        buttonContainer.add(new JButton("Przycisk 3"));

        buttonContainer.setLayout(new GridLayout());

        setVisible(true);
    }
}
