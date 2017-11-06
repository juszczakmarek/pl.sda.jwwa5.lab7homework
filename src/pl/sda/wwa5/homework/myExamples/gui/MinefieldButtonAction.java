package pl.sda.wwa5.homework.myExamples.gui;

import pl.sda.wwa5.homework.myExamples.SingleField;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinefieldButtonAction implements ActionListener {

    private SingleField singleField;
    private JButton jButton;

    public MinefieldButtonAction(SingleField singleField, JButton jButton) {
        this.singleField = singleField;
        this.jButton = jButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (singleField.hasMine()) {
            gameLost();
        } else {
            setMinesLabel();
        }
    }

    private void gameLost() {
        JOptionPane.showMessageDialog(null,"Bum!!!! Przegrywasz");
    }

    private void setMinesLabel() {
        String numberOfMines = String.valueOf(this.singleField.getNeighbouringMines());
        this.jButton.setText(numberOfMines);

//        String jLabelText = String.valueOf(minefield.getMinefield().get(i-1).getNeighbouringMines());
//        //jButton.setText(jLabelText);
    }
}
