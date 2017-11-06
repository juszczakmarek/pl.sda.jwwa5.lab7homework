package pl.sda.wwa5.homework.myExamples.gui;

import pl.sda.wwa5.homework.myExamples.DifficultyLevel;
import pl.sda.wwa5.homework.myExamples.Minefield;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

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
//            button.setIcon(new ImageIcon("images/blank.png"));
            button.setSelectedIcon(resizeIcon(new ImageIcon("images/mine.png"),30,30));
//            button.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Blank.png"))));

//            JButton jButton = new JButton();
//            jButton.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
//
//            if (minefield.getMinefield().get(i-1).hasMine()) {
//                //jButton.setIcon(icon);
//            } else {
//                String jLabelText = String.valueOf(minefield.getMinefield().get(i-1).getNeighbouringMines());
//                //jButton.setText(jLabelText);
//            }
            mineFieldContainer.add(button);
            button.addActionListener(new MinefieldButtonAction(minefield.getMinefield().get(i-1),button," images/mine.png"));
        }
        return mineFieldContainer;
    }

    private static ImageIcon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
        Image img = icon.getImage();
        Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }



}
