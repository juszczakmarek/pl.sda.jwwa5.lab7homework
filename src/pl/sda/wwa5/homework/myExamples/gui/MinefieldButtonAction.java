package pl.sda.wwa5.homework.myExamples.gui;

import pl.sda.wwa5.homework.myExamples.minefield.SingleField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinefieldButtonAction implements ActionListener {

    private SingleField singleField;
//    private JButton jButton;
    private JToggleButton button;
    private String iconFilename;



    public MinefieldButtonAction(SingleField singleField, JToggleButton button, String iconFilename) {
        this.singleField = singleField;
        this.button = button;

        this.iconFilename = iconFilename;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (singleField.hasMine()) {
            gameLost();
        } else {
            displayNumberOfMinesOnField();
        }
    }

    private static ImageIcon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
        Image img = icon.getImage();
        Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }

    private void gameLost() {
        displayBombIconOfField();
        JOptionPane.showMessageDialog(null,"Bum!!!! Przegrywasz");
    }


    private void displayBombIconOfField() {

        ImageIcon icon = new ImageIcon(iconFilename);
        icon = resizeIcon(icon,30,30);

        this.button.setIcon(icon);

    }

    private void displayNumberOfMinesOnField() {

        String numberOfMines = String.valueOf(this.singleField.getNeighbouringMines());
        this.button.setText(numberOfMines);

//        String jLabelText = String.valueOf(minefield.getMinefield().get(i-1).getNeighbouringMines());
//        //jButton.setText(jLabelText);
    }
}
