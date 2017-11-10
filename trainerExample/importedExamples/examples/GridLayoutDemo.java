package pl.sda.wwa5.homework.importedExamples.examples;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo extends JFrame {

    public GridLayoutDemo() {
        setLayout(new GridLayout());
        for (int i = 0; i < 20; ++i) {
            add(new JButton("Przycisk #" + i));
        }
    }
}


