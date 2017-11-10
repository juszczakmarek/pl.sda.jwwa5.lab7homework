package pl.sda.wwa5.homework.myExamples.gui;

import pl.sda.wwa5.homework.myExamples.DifficultySettings;
import pl.sda.wwa5.homework.myExamples.minefield.Minefield;

import javax.swing.*;
import java.awt.*;

public class MineFieldGUI extends JFrame {

    private int mineFieldXdimension;
    private int mineFieldYdimension;
    private int numberOfFields;
    private int level;
    private Minefield minefield;

    public MineFieldGUI(DifficultySettings difficultySettings, Minefield minefield) throws HeadlessException {
        this.mineFieldXdimension = difficultySettings.getxDimension();
        this.mineFieldYdimension = difficultySettings.getyDimension();
        this.numberOfFields = mineFieldXdimension * mineFieldYdimension;
        this.level = difficultySettings.getNumberOfMines();
        this.minefield = minefield;
        generateMinefieldGUI(this.mineFieldXdimension,this.mineFieldYdimension);
    }

    private void generateMinefieldGUI(int fieldsNumber, int level) {
        Container mineFieldLabels;
        Container mineFieldButtons;



//        mineFieldLabels = createMinefieldLabels(fieldsNumber,level,icon, this.mineFieldXdimension, this.mineFieldYdimension);
        mineFieldButtons = createMinefieldButtons(fieldsNumber,level, this.mineFieldXdimension, this.mineFieldYdimension);

    }

    private Container createMinefieldLabels(int fieldsNumber, int level, Icon icon, int mineFieldXdimension, int mineFieldYdimension) {
        Container mineFieldContainer = getContentPane();
        mineFieldContainer.setLayout(new GridLayout(mineFieldXdimension, mineFieldYdimension));

        for (int i=1;i<=numberOfFields;i++) {
            JLabel jLabel = new JLabel();
            jLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));

            if (minefield.getMinefield().get(i-1).hasMine()) {
                jLabel.setIcon(icon);
            } else {
                String jLabelText = String.valueOf(minefield.getMinefield().get(i-1).getNeighbouringMines());
                jLabel.setText(jLabelText);
            }
            mineFieldContainer.add(jLabel);

        }
        return mineFieldContainer;
    }

    private Container createMinefieldButtons(int fieldsNumber, int level, int mineFieldXdimension, int mineFieldYdimension) {
        Container mineFieldContainer = getContentPane();
        mineFieldContainer.setLayout(new GridLayout(mineFieldXdimension, mineFieldYdimension));

        for (int i=1;i<=numberOfFields;i++) {
            JToggleButton button = new JToggleButton();
            button.setModel(new MineFieldButton());
//            button.setSelectedIcon(resizeIcon(new ImageIcon("./src/images/mine.png"),30,30));
            mineFieldContainer.add(button);
            button.addActionListener(new MinefieldButtonAction(minefield.getMinefield().get(i-1),button,"./src/images/mine.png"));
        }
        return mineFieldContainer;
    }

    private static ImageIcon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
        Image img = icon.getImage();
        Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }



}
