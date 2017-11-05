package pl.sda.wwa5.homework.myExamples.gui;

import pl.sda.wwa5.homework.myExamples.DifficultyLevel;
import pl.sda.wwa5.homework.myExamples.Minefield;

import javax.swing.*;
import java.awt.*;

public class MineFieldGUI extends JFrame {

    private int mineFieldXdimension;
    private int mineFieldYdimension;
    private int numberOfFields;
    private int level;
    private Minefield minefield;

    public MineFieldGUI(int mineFieldXdimension, int mineFieldYdimension, DifficultyLevel difficultyLevel, Minefield minefield) throws HeadlessException {
        this.mineFieldXdimension = mineFieldXdimension;
        this.mineFieldYdimension = mineFieldYdimension;
        this.numberOfFields = mineFieldXdimension * mineFieldYdimension;
        this.level = difficultyLevel.getMinesNumber();
        this.minefield = minefield;
        generateMinefieldGUI(this.mineFieldXdimension,this.mineFieldYdimension);
    }

    private void generateMinefieldGUI(int fieldsNumber, int level) {
        Container mineFieldContainer = getContentPane();
        mineFieldContainer.setLayout(new GridLayout(this.mineFieldXdimension, this.mineFieldYdimension));

        ImageIcon icon = new ImageIcon("images/mine.png");
        icon = resizeIcon(icon,30,30);


        for (int i=1;i<=numberOfFields;i++) {
            if (minefield.getMinefield().get(i-1).hasMine()) {
                JButton jButton = new JButton(icon);
                mineFieldContainer.add(jButton);
            } else {
                String jButtonLabel = String.valueOf(minefield.getMinefield().get(i-1).getNeighbouringMines());
                mineFieldContainer.add(new JButton(jButtonLabel));
            }
        }
    }

    private static ImageIcon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
        Image img = icon.getImage();
        Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }

}
