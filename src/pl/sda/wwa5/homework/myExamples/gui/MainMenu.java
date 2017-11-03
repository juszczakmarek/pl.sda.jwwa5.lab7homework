package pl.sda.wwa5.homework.myExamples.gui;

import javax.swing.*;
import java.awt.*;

public class MainMenu extends JFrame {

    public JMenuBar menuBar = new JMenuBar();

    public MainMenu() throws HeadlessException {
        createMainMenu();
    }

    private void createMainMenu() {
        JMenuBar localMenuBar = new JMenuBar();
        JMenu mainMenuGame = new JMenu("Game");
        JMenu mainMenuSettings = new JMenu("Settings");
        localMenuBar.add(mainMenuGame);
        localMenuBar.add(mainMenuSettings);

        JMenuItem mainMenuGameNewGame = new JMenuItem("New Game");
        JMenuItem mainMenuGameExitGame = new JMenuItem("Exit");
        mainMenuGame.add(mainMenuGameNewGame);
        mainMenuGame.add(mainMenuGameExitGame);

        JMenuItem mainMenuSettingsSetLevel = new JMenuItem("Set Difficulty Level");
        mainMenuSettings.add(mainMenuSettingsSetLevel);
        setJMenuBar(localMenuBar);
        this.menuBar = localMenuBar;
    }
}
