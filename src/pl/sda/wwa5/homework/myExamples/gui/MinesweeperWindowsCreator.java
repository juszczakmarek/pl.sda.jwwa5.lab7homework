package pl.sda.wwa5.homework.myExamples.gui;

import javax.swing.*;

public class MinesweeperWindowsCreator {

    public static void run(final JFrame jFrame, final int width, final int height) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                jFrame.setTitle("Saper");
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jFrame.setSize(width, height);
                jFrame.setJMenuBar(new MainMenu().menuBar);
                jFrame.setVisible(true);

            }
        });

    }
}
