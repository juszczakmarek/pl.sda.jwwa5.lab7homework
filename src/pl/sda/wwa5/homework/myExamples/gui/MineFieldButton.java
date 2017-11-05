package pl.sda.wwa5.homework.myExamples.gui;

import pl.sda.wwa5.homework.myExamples.SingleField;

import javax.swing.*;
import java.awt.*;

public class MineFieldButton extends JFrame {

    private SingleField singleField;
    private boolean covered;

    public MineFieldButton(SingleField singleField) throws HeadlessException {
        this.singleField = singleField;
        this.covered = true;
    }
}
